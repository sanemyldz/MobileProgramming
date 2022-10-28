package com.example.hafta4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> elemanlar;
    Spinner sp;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.spinner);
        pic=findViewById(R.id.imageView);

        elemanlar= new ArrayList<>();
        elemanlar.add("Leonardo");
        elemanlar.add("Michelangelo");
        elemanlar.add("Rafael");
        elemanlar.add("Donatello");

        ArrayAdapter<String> arrAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,elemanlar );
        sp.setAdapter(arrAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(elemanlar.get(i)=="Rafael"){
                    pic.setImageResource(R.drawable.rafael);
                }
                if(elemanlar.get(i)=="Donatello"){
                    pic.setImageResource(R.drawable.donatello);
                }
                if(elemanlar.get(i)=="Leonardo"){
                    pic.setImageResource(R.drawable.leonardo);
                }
                if(elemanlar.get(i)=="Michelangelo"){
                    pic.setImageResource(R.drawable.mic);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}