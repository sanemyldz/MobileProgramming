package com.example.hafta3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout tmpback;

    @Override
    public class MainActivity extends AppCompatActivity
    {

        Button btnSubmit;
        EditText txtName, txtPassword;
        ConstraintLayout back;
        int c = 3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            txtName = findViewById(R.id.txtName);
            txtPassword = findViewById(R.id.txtPassword);
            btnSubmit = findViewById(R.id.btnSubmit);
            back = findViewById(R.id.cnstback);

        }

        public void login(View view)
        {

            if (txtName.getText().toString().equals("Name") && txtPassword.getText().toString().equals("1")) {
                Toast.makeText(this, "Giris Basarılı", Toast.LENGTH_SHORT).show();
                back.setBackgroundColor(Color.GREEN);
            } else {
                c--;
                Toast.makeText(this, c + "Hakkınız kaldı", Toast.LENGTH_SHORT).show();

                if (c == 0) {
                    back.setBackgroundColor(Color.RED);
                    Toast.makeText(this, "Giriş başarısız", Toast.LENGTH_SHORT).show();
                }
            }
        }

}