package com.example.formelementleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tmpName,tmpSurname;
    RadioButton tmpEvli,tmpBekar;
    Switch tmpOnay;
    Button tmpKaydet;
    TextView tmpYazdır;
    CheckBox tmpDans,tmpMüzik,tmpSpor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tmpName=findViewById(R.id.editTextTextPersonName);
        tmpSurname=findViewById(R.id.editTextTextPersonName2);
        tmpEvli=findViewById(R.id.radioButton);
        tmpBekar=findViewById(R.id.radioButton2);
        tmpOnay=findViewById(R.id.switch1);
        tmpKaydet=findViewById(R.id.button);
        tmpYazdır=findViewById(R.id.textView4);
        tmpDans=findViewById(R.id.checkBox);
        tmpMüzik=findViewById(R.id.checkBox2);
        tmpSpor=findViewById(R.id.checkBox3);
    }


    public void Kaydet(View view) {

        tmpYazdır.setText("Ad: "+ tmpName.getText().toString()+ "\n" + "Soyad: "+tmpSurname.getText().toString()+ "\n");

        if(tmpEvli.isChecked())
        {
            tmpYazdır.setText(tmpYazdır.getText().toString() + "Medeni Durum: "+tmpEvli.getText().toString()+"\n");
        }
        else
            tmpYazdır.setText(tmpYazdır.getText().toString() +"Medeni Durum: "+tmpBekar.getText().toString()+"\n");

        tmpYazdır.setText(tmpYazdır.getText().toString() +"Hobileriniz: ");
        if(tmpDans.isChecked())
        {
            tmpYazdır.setText(tmpYazdır.getText().toString() +tmpDans.getText().toString()+", ");
        }
        if(tmpMüzik.isChecked())
        {
            tmpYazdır.setText(tmpYazdır.getText().toString() +tmpMüzik.getText().toString()+",");
        }
        if(tmpSpor.isChecked())
        {
            tmpYazdır.setText(tmpYazdır.getText().toString() +tmpSpor.getText().toString()+"\n");
        }
    }
}