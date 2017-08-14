package com.example.andres.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Main extends AppCompatActivity {

    Button b0, b1,b2,b3,b4,b5,b6,b7,b8,b9,bmas,bmenos,bigual,limpiar;
    int estado1 = 0;
    int operacion=0;
    String valor1,valor2;
    String llevo="" ;
    String llevo2="";
    TextView text;
    int total = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearactivity);
     b0 = (Button) findViewById(R.id.button0);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        limpiar = (Button) findViewById(R.id.buttonlimpiar);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        bmas = (Button) findViewById(R.id.buttonmas);
        bmenos = (Button) findViewById(R.id.buttonmenos);
        bigual = (Button) findViewById(R.id.buttonigual);
        text = (TextView) findViewById(R.id.textView);


    }

    public void cero(View view){
        text.setText(llevo+"0");
        if(estado1==0){
            text.setText(llevo+"0");
            valor1= llevo+"0";
            llevo = valor1;
        }else{
            text.setText(llevo2+"0");
            valor2=llevo2+"0";
            llevo2 = valor2 ;
        }
    }

    public void uno(View view) {

        if(estado1==0){
            text.setText(llevo+"1");
            valor1=llevo+"1";
            llevo = valor1;
        }else{
            text.setText(llevo2+"1");
            valor2=llevo2+"1";
            llevo2 = valor2;
        }
    }

    public void dos(View view){

        if(estado1==0){
            text.setText(llevo+"2");
            valor1= llevo+"2";
            llevo = valor1;

        }else{
            text.setText(llevo2+"2");
            valor2=llevo2+"2";
            llevo2 = valor2;
        }
    }
    public void tres(View view){

        if(estado1==0){
            text.setText(llevo+"3");
            valor1= llevo+"3";
            llevo = valor1;
        }else{
            text.setText(llevo2+"3");
            valor2= llevo2+"3";
            llevo2 = valor2;
        }
    }
    public void cuatro(View view){

        if(estado1==0){
            text.setText(llevo+"4");
            valor1= llevo+"4";
            llevo = valor1;
        }else{
            text.setText(llevo2+"4");
            valor2=llevo2+"4";
            llevo2 = valor2;
        }
    }
    public void cinco(View view){

        if(estado1==0){
            text.setText(llevo+"5");
            valor1=llevo+"5";
            llevo=valor1;
        }else{
            text.setText(llevo2+"5");
            valor2=llevo2+"5";
            llevo2 = valor2;
        }
    }
    public void seis(View view){

        if(estado1==0){
            text.setText(llevo+"6");
            valor1= llevo+"6";
            llevo = valor1;
        }else{
            text.setText(llevo2+"6");
            valor2=llevo2+"6";
            llevo2 = valor2;
        }
    }
    public void siete(View view){

        if(estado1==0){
            text.setText(llevo+"7");
            valor1= llevo+"7";
           llevo = valor1;
        }else{
            text.setText(llevo2+"7");
            valor2=llevo2+"7";
            llevo2 = valor2;
        }
    }
    public void ocho(View view){

        if(estado1==0){
            text.setText(llevo+"8");
            valor1= llevo+"8";
            llevo = valor1;
        }else{
            text.setText(llevo2+"8");
            valor2=llevo2+"8";
            llevo2 = valor2;

        }
    }
    public void nueve(View view){

        if(estado1==0){
            text.setText(llevo+"9");
            valor1= llevo+"9";
            llevo = valor1;
        }else{
            text.setText(llevo2+"9");
            valor2=llevo2+"9";
            llevo2 = valor2;
        }
    }
    public void mas(View view){
        text.setText("+");
        operacion = 0 ;
        if (estado1 ==1){
            total = Integer.valueOf(valor1)+Integer.valueOf(valor2);
            valor1 = String.valueOf(total);
        }
        estado1=1;
        llevo="";
        llevo2="";
    }
    public void menos(View view){
        text.setText("-");
        operacion = 1;
        if (estado1 ==1){
            total = Integer.valueOf(valor1)-Integer.valueOf(valor2);
            valor1 = String.valueOf(total);
        }
        estado1=1;
        llevo="";
        llevo2="";
    }
    public void igual(View view){
        if(estado1 == 1 && operacion==0){
            total = Integer.valueOf(valor1)+Integer.valueOf(valor2);
            estado1=0;
        }
        if(estado1 == 1 && operacion==1){
            total = Integer.valueOf(valor1)-Integer.valueOf(valor2);
            estado1=0;

        }
        text.setText(String.valueOf(total));

    }

    public void limpiar(View view){
    text.setText("0");
        estado1=0;
        total = 0;
        valor1="0";
        valor2="0";
        llevo="";
        llevo2="";

}
}
