package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void rbSecim(View view) {
        RadioButton rbTmp=(RadioButton) view;
        ImageView myImg=findViewById(R.id.imageView);
        if(rbTmp.getId()==R.id.radioButton)
        {
            Glide.with(this)
                    .load("https://ogu.edu.tr/files/icerik/a0deecf6-7a3c-4859-9259-9dae538fab3b/maviturkceJPG.jpg")
                    .into(myImg);
        }
        else if(rbTmp.getId()==R.id.radioButton2)
        {
            Glide.with(this)
                    .load("https://ogu.edu.tr/files/icerik/a0deecf6-7a3c-4859-9259-9dae538fab3b/JPEG%20siyahTurkce.jpg")
                    .into(myImg);
        }
        else if(rbTmp.getId()==R.id.radioButton3)
        {
            Glide.with(this)
                    .load("https://ogu.edu.tr/files/icerik/a0deecf6-7a3c-4859-9259-9dae538fab3b/JPEG%20Siyah%C4%B0NG.jpg")
                    .into(myImg);
        }
        else if(rbTmp.getId()==R.id.radioButton4)
        {
            Glide.with(this)
                    .load("https://ogu.edu.tr/files/icerik/a0deecf6-7a3c-4859-9259-9dae538fab3b/JPEG%20Siyah%C4%B0NG.jpg")
                    .into(myImg);
        }
    }

}