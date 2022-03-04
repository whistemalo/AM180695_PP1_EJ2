package com.example.am180695_pp1_ej2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class segundaactividad extends AppCompatActivity {

    private TextView resultado;
    private TextView resultado2;
    private TextView resultado3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundaactividad);

        Intent intent =getIntent();
        double coa = intent.getDoubleExtra(MainActivity.EXTRA_COA,0);
        double cob = intent.getDoubleExtra(MainActivity.EXTRA_COB,0);
        double coc = intent.getDoubleExtra(MainActivity.EXTRA_COC,0);

        TextView tv1 = (TextView)findViewById(R.id.resultado);
        TextView tv2 = (TextView)findViewById(R.id.resultado2);
        TextView tv3 = (TextView)findViewById(R.id.resultado3);

//        tv1.setText("a"+coa);
//        tv2.setText("b"+cob);
//        tv3.setText("c"+coc);


        double a = coa, b = cob, c = coc;
        double raiz1, raiz2;

        // calcular el determinante (b2 - 4ac)
        double determinante = (b * b) - 4 * a * c;

        // verificar si el det. es mayor a cero
        if (determinante > 0) {

            // 2 raices reales distintas
            raiz1 = (-b + Math.sqrt(determinante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(determinante)) / (2 * a);
            tv1.setText("Raiz1 = "+ raiz1 );
            tv2.setText("Raiz2 = " + raiz2 );

        }

        // verificar si el determinante es igual a cero
        else if (determinante == 0) {

            // 2 raices reales iguales
            // si el determinante es cero
            // por lo que -b + 0 == -b
            raiz1 = -b / (2 * a);
            tv1.setText("Raiz1 = Raiz2 = %0.2f" + raiz1);
        }

        // if determinant is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginario = Math.sqrt(-determinante) / (2 * a);


            tv1.setText("Raiz1 = " + real + " + " + imaginario + "i" );
            tv2.setText("Raiz2 = " + real + " - " + imaginario + "i" );

        }

    }
}