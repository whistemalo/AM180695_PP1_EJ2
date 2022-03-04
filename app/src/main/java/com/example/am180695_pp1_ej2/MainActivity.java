package com.example.am180695_pp1_ej2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static  final  String EXTRA_COA = "com.example.am180695_pp1_ej2.EXTRA_COA";
    public static  final  String EXTRA_COB = "com.example.am180695_pp1_ej2.EXTRA_COB";
    public static  final  String EXTRA_COC = "com.example.am180695_pp1_ej2.EXTRA_COC";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcular = (Button) findViewById(R.id.btncalc);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirAct2();
            }
        });
    }
    public void  abrirAct2(){
        EditText coeficienteA =(EditText)findViewById(R.id.coa);
        double coa = Double.parseDouble(coeficienteA.getText().toString());

        EditText coeficienteB =(EditText)findViewById(R.id.cob);
        double cob = Double.parseDouble(coeficienteB.getText().toString());

        EditText coeficienteC =(EditText)findViewById(R.id.coc);
        double coc = Double.parseDouble(coeficienteC.getText().toString());

        Intent  intent = new Intent(this, segundaactividad.class);
        intent.putExtra(EXTRA_COA, coa);
        intent.putExtra(EXTRA_COB, cob);
        intent.putExtra(EXTRA_COC, coc);
        startActivity(intent);
    }

}