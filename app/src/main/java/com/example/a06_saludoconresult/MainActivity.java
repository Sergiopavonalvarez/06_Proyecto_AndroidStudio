package com.example.a06_saludoconresult;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button segundaactividad;
    TextView n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        segundaactividad=findViewById(R.id.Segunda_Actividad);
        n=findViewById(R.id.todavianosetunombre);
        String nombre=getIntent().getStringExtra("Nombre");
        if (nombre==null){
            n.setText("Aun no se tu nombre");

        }else{
        n.setText("Bienvenido "+nombre);}
    }

    public void h(View vista){
       Intent intent=new Intent(this,MainActivity2.class);
       startActivity(intent);

    }

}