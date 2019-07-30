package com.example.aplicativo2bim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class tela2 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_tela2);

        ListView lista = (ListView) findViewById(R.id.list);
        final ArrayList<String> signos = preencherDados();
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, signos);
            lista.setAdapter(arrayAdapter);
      }

        private ArrayList<String> preencherDados(){
            ArrayList<String> dados = new ArrayList<String>();
            dados.add("  Aquário");
            dados.add("  Libra");
            dados.add("  Leão");
            dados.add("  Peixes");
            dados.add("  Áries");
            dados.add("  Touro");
            dados.add("  Peixes");
            dados.add("  Gêmeos");
            dados.add("  Câncer");
            dados.add("  Virgem");
            dados.add("  Escorpião");
            dados.add("  Sagitário");
            dados.add("  Capricórnio");
            return dados;

        }

    public void continuou(View view) {
        Intent intent = new Intent(this, Tela3.class);
        startActivity(intent);
    }
}





