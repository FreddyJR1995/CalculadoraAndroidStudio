package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    public int op1, op2;
    public int opcion;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(EditText) findViewById(R.id.TxtDisplay);
    }
    public void mas(View view){
        opcion=1;
        op1=Integer.parseInt(display.getText().toString());
        display.setText("");
        op2=op1;
    }
    public void resta(View view){
        opcion=2;
        op1=Integer.parseInt(display.getText().toString());
        display.setText("");
        op2=op1;
    }
    public void multiplicacion(View view){
        opcion=3;
        op1=Integer.parseInt(display.getText().toString());
        display.setText("");
        op2=op1;
    }
    public void division(View view){
        opcion=4;
        op1=Integer.parseInt(display.getText().toString());
        display.setText("");
        op2=op1;
    }
    public void potencia(View view){
        op1=Integer.parseInt(display.getText().toString());
        int respuesta;
        op2=op1;
        respuesta=op2*op2;
        op2=respuesta;
        display.setText(String.valueOf(op2));
    }
    public void raizc(View view){
        op1=Integer.parseInt(display.getText().toString());
        op2=op1;
        double res=Math.sqrt(op2);
        op2=Integer.parseInt(String.valueOf(res));
        display.setText(String.valueOf(op2));
    }
    public void factorial(View view){
        op1=Integer.parseInt(display.getText().toString());
        op2=op1;
        int resp=1;
        for (int i = op2; i>0; i--){
            resp=resp*i;
        }
        op2 = resp;
        display.setText(String.valueOf(op2));
    }
    public void igual(View view){
        int respuesta;
        switch(opcion){
            case 1:
                op1=Integer.parseInt(display.getText().toString());
                respuesta=op2+op1;
                op2=respuesta;
                display.setText(String.valueOf(op2));
                break;
            case 2:
                op1=Integer.parseInt(display.getText().toString());
                respuesta=op2-op1;
                op2=respuesta;
                display.setText(String.valueOf(op2));
                break;
            case 3:
                op1=Integer.parseInt(display.getText().toString());
                respuesta=op1*op2;
                op2=respuesta;
                display.setText(String.valueOf(op2));
                break;
            case 4:
                op1=Integer.parseInt(display.getText().toString());
                if (op1 ==0){
                    display.setText("No hay división para 0");
                }else{
                    respuesta=op2/op1;
                    op2=respuesta;
                    display.setText(String.valueOf(op2));
                }
                break;
        }
    }
    public void limpiar(View view ){
        display.setText("");
    }
}