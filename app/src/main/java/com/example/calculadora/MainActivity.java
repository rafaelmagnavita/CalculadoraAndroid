package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    //Campos do layout
    EditText num1, num2, result;
    Button btSomar, btSubtrair, btDividir, btMultiplicar;
    //Vars da classe para o calculo
    double n1, n2, resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (EditText) findViewById(R.id.result);
        btSomar = (Button) findViewById(R.id.btSomar);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btDividir = (Button) findViewById(R.id.btDividir);
        btMultiplicar = (Button) findViewById(R.id.btMultiplicar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
                resultado = n1+n2;
                result.setText(String.valueOf(resultado));
            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
                resultado = n1-n2;
                result.setText(String.valueOf(resultado));
            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
                resultado = n1/n2;
                result.setText(String.valueOf(resultado));
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
                resultado = n1*n2;
                result.setText(String.valueOf(resultado));
            }
        });
    }
}