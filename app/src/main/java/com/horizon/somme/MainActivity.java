package com.horizon.somme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText input1,input2;
    private Button btnSomme;
    private TextView tvSomme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=(EditText)findViewById(R.id.edit_text_input1);
        input2=(EditText)findViewById(R.id.edit_text_input2);
        btnSomme=(Button)findViewById(R.id.btn_somme);
        tvSomme=(TextView)findViewById(R.id.tv_somme);
        btnSomme.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    public void onClick(View v) {

        if (v==btnSomme) {
            String numEdit1 = input1.getText().toString();
            String numEdit2 = input2.getText().toString();
            Integer resultatSomme = Integer.parseInt(numEdit1) + Integer.parseInt(numEdit2);
            tvSomme.setText(Integer.toString(resultatSomme));
        }
    }

}