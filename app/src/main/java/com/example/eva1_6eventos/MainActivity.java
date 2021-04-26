package com.example.eva1_6eventos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    //Se crean objetos de tipo button
        Button btnListener, btnClaseAnonima, btnPorClase;

            @Override
            protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //Conecto los objetos button con los widget
            btnListener = findViewById(R.id.btnListener);
            btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
            btnPorClase = findViewById(R.id.btnPorClase);

            //Se agrega al objeto el el metodo listener
            btnListener.setOnClickListener(this);

            //Se crea una clase anonima la cual implementa un metodo setonclick
                // y se crea un nuevo objeto de tipo view
            btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),/*MainActivity.this*/ "Evento por clase anonima", Toast.LENGTH_LONG).show();
                }
            });

            MiClaseOnClick objClick = new MiClaseOnClick();
            objClick.setContext(this);
            btnPorClase.setOnClickListener(objClick);
        }
            //usando la propiedad android: onclick del  Widget
            //public void nombredelmetodo(view arg){}
            public void elclick(View arg){
            //Mostrar un mensaje (toast)
            Toast.makeText(this, "Evento por onclick xml", Toast.LENGTH_LONG).show();
        }

            @Override
            public void onClick(View view){
            Toast.makeText(this, "Evento por Listener", Toast.LENGTH_LONG).show();
        }
}