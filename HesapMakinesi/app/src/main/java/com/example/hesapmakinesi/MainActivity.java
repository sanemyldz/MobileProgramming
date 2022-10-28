package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tmpFirst,tmpSecond;
    TextView tmpResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tmpFirst=findViewById(R.id.editTextNumber);
        tmpSecond=findViewById(R.id.editTextNumber3);
        tmpResult=findViewById(R.id.textView);

    }

    public void Hesapla(View view)
    {
        Button tmpbtn = (Button) view ;
        String c= tmpbtn.getText().toString();
        if(c.equals("+"))
        {
            Double x= Double.parseDouble(tmpFirst.getText().toString());
            Double y=Double.parseDouble(tmpSecond.getText().toString());
            Double result=x+y;
            tmpResult.setText(result.toString());
        }
        if(c.equals("-"))
        {
            Double x= Double.parseDouble(tmpFirst.getText().toString());
            Double y=Double.parseDouble(tmpSecond.getText().toString());
            Double result=x-y;
            tmpResult.setText(result.toString());
        }
        if(c.equals("*"))
        {
            Double x= Double.parseDouble(tmpFirst.getText().toString());
            Double y=Double.parseDouble(tmpSecond.getText().toString());
            Double result=x*y;
            tmpResult.setText(result.toString());
        }
        if(c.equals("/"))
        {
            Double x= Double.parseDouble(tmpFirst.getText().toString());
            Double y=Double.parseDouble(tmpSecond.getText().toString());
            Double result=x/y;
            tmpResult.setText(result.toString());
        }
    }
}