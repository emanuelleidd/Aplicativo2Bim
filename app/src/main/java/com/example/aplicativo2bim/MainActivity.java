package com.example.aplicativo2bim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarToast(View view) {
        Toast.makeText(getApplicationContext(),"Dados Enviados",Toast.LENGTH_SHORT).show();
    }

    public void confirmou(View view) {
        Intent intent = new Intent(this, tela2.class);
        Bundle bundle = new Bundle();
        TextView textView = (TextView) findViewById(R.id.editText);
        TextView textView1 = (TextView) findViewById(R.id.editText2);
        TextView textView2 = (TextView) findViewById(R.id.editText3);
        bundle.putString("nome",textView.getText().toString());
        bundle.putString("email",textView1.getText().toString());
        bundle.putString("signo",textView2.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
        //adicionei isso aqui
    }
}