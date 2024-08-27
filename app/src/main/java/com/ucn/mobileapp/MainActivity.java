package com.ucn.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton1);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notification = Toast.makeText(MainActivity.this, "Exfoliante facial", Toast.LENGTH_SHORT);
                notification.show();
                Intent intencion = new Intent(getApplicationContext(), ActivityExfoliant.class);
                startActivity(intencion);
            }
        }
        ));
        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton2);
        boton2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notification = Toast.makeText(MainActivity.this, "Despigmentante íntimo", Toast.LENGTH_SHORT);
                notification.show();
                Intent intencion = new Intent(getApplicationContext(), ActivityDespigmenting.class);
                startActivity(intencion);
            }
        }
        ));

        ImageButton boton3 = (ImageButton) findViewById(R.id.imageButton3);
        boton3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notification = Toast.makeText(MainActivity.this, "Aceite bronceador", Toast.LENGTH_SHORT);
                notification.show();
                Intent intencion = new Intent(getApplicationContext(), ActivityOil.class);
                startActivity(intencion);
            }
        }
        ));

        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton4);
        boton4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notification = Toast.makeText(MainActivity.this, "Carbón activado", Toast.LENGTH_SHORT);
                notification.show();
                Intent intencion = new Intent(getApplicationContext(), ActivityCoal.class);
                startActivity(intencion);
            }
        }
        ));


    }

    @Override
    public void onClick(View view) {

    }
}