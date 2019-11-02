package com.ronggosukowti.ti.ft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHasil;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.edt_panjang);
        etLebar = findViewById(R.id.edt_lebar);
        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int panjang = Integer.parseInt(etPanjang.getText().toString());
               int lebar = Integer.parseInt(etLebar.getText().toString());

               int hasil = panjang * lebar;

               tvHasil.setText("Hasil : " + hasil);
            }
        });

    }
}
