package com.galang.resepmasakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResepActivity extends AppCompatActivity {

    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);
        Bundle b = getIntent().getExtras();
        gambar=(ImageView)findViewById(R.id.gambar);
        gambar.setImageResource(b.getInt("gambar"));
        setTitle(b.getString("label"));
    }
}
