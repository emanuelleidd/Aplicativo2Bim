package com.example.aplicativo2bim;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Tela3 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_tela3);
        

        Button ok = (Button) findViewById(R.id.botao);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Tela3.this);
                alerta.setTitle("você acredita em signos?");
                alerta
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage(" ")
                        .setCancelable(false)
                        .setNegativeButton("Não acredito", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Escolha confirmada", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Acredito", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Escolha confirmada", Toast.LENGTH_SHORT).show();

                            }
                        });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }


        });
    }
}
