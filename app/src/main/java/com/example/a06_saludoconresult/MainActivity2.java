package com.example.a06_saludoconresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText a;
    Button l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a=findViewById(R.id.edittext_nombre);
        l=findViewById(R.id.button_nombre);
    }

    public void l (View vista){
        Intent intent=new Intent(this, MainActivity.class);
        intent.putExtra("Nombre",a.getText().toString());
        startActivity(intent);

    }
}