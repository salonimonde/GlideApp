package bynry.com.glideapp.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import bynry.com.glideapp.R;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnGlide, btnPicasso;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnGlide = findViewById(R.id.btn_glide);
        btnGlide.setOnClickListener(this);

        btnPicasso = findViewById(R.id.btn_picasso);
        btnPicasso.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == btnGlide){
            Intent intentGlide = new Intent(StartActivity.this, MainActivity.class);
            startActivity(intentGlide);
        }

        if (v == btnPicasso){
            Intent intentPicasso = new Intent(StartActivity.this, PicassoActivity.class);
            startActivity(intentPicasso);
        }

    }
}
