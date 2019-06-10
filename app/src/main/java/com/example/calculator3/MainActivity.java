package com.example.calculator3;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
  int  x=0,r=0;
  double a=0,d=0,g=0;
 int y=0;
String ch;
TextView t;
String p="+",mul="*",sub="-",div="/",per="%",deci=".";

ArrayList<Integer>digitArray=new ArrayList<Integer>();
    int functions[]={R.id.percent,R.id.multipl,R.id.plus,R.id.substract,R.id.addition,R.id.divide,R.id.delete,R.id.decimal,R.id.equals};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.t);


        digitArray.add(R.id.zero);digitArray.add(R.id.nine);digitArray.add(R.id.eight);digitArray.add(R.id.seven);digitArray.add(R.id.six);digitArray.add(R.id.five);digitArray.add(R.id.four);digitArray.add(R.id.three);digitArray.add(R.id.two);digitArray.add(R.id.one);
        
    }
    public  void clicks(View view){
        TextView b=findViewById(view.getId());
        if(digitArray.contains(view.getId())){
            {
            x=(x*10)+Integer.parseInt(b.getText().toString());
            t.setText(Integer.toString(x));}

        }
    else
        {
            switch (view.getId()){
                case R.id.addition:
                    ch=(b.getText().toString());
                    t.setText(ch);
                    y=y+x;
                    x=0;
                    t.setText(Integer.toString(x));
                    break;
                case R.id.equals:

                    if (ch.compareTo(p)==0){
                        y=y+x;
                        t.setText(Integer.toString(y));}
                    else if (ch.compareTo(mul)==0) {

                        y=y*x;
                        t.setText(Integer.toString(y));

                    }
                    else if (ch.compareTo(sub)==0) {

                        y=y-x;
                        t.setText(Integer.toString(y));}
                    else if (ch.compareTo(div)==0) {

                        a=a/x;
                        d=a%x;
                        t.setText(Double.toString(a));}
                    else if (ch.compareTo(per)==0)
                    {  if(x==0)
                        a=a*1;
                    else
                        a=a*x;
                        t.setText(Double.toString(a));}
                    break;
                case R.id.c:
                    x=0;
                    y=0;
                    a=0;
                    d=0;
                    t.setText(Integer.toString(x));
                    break;
                case R.id.multipl:
                    ch=(b.getText().toString());
                    y=y+x;
                    x=0;
                    t.setText(Integer.toString(x));
                    break;
                case R.id.substract:
                    ch=(b.getText().toString());
                    y=y+x;
                    x=0;
                    t.setText(Integer.toString(x));
                    break;
                case R.id.divide:
                    ch=(b.getText().toString());
                    a=a+x;
                    x=0;
                    t.setText(Integer.toString(x));
                    break;
                case R.id.delete:
                    x=x/10;
                    t.setText(Integer.toString(x));
                    break;
                case R.id.percent:
                    ch=(b.getText().toString());
                    a=x;
                    a=a/100;
                    x=0;
                    t.setText(Integer.toString(x));
                    break;
                case R.id.plus:
                    a=0;
                    r++;





            }
        }
     }
    {

    }


    }



