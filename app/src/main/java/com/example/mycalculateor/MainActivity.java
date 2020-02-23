package com.example.mycalculateor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView nub1;
    float one ,two;
    TextView tv;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_add,b_sub,b_div,b_mul;
    Button equal,b_doc,b_c;
    boolean addition,multiplication,subtract,division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nub1=findViewById(R.id.num1);
        tv=findViewById(R.id.result);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.there);
        b4=findViewById(R.id.fore);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        b0=findViewById(R.id.zor);
        b_add=findViewById(R.id.add);
        b_div=findViewById(R.id.div);
        b_mul=findViewById(R.id.mul);
        b_sub=findViewById(R.id.sub);
        equal=findViewById(R.id.quival);
        b_doc = findViewById(R.id.dot);
        b_c=findViewById(R.id.bt_c);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+"0");
            }
        });
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nub1 == null){
                    nub1.setText("");
                }else {
                    one=Float.parseFloat(nub1.getText()+"");
                    addition=true;
                    nub1.setText(null);
                }
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nub1== null){
                    nub1.setText("");
                }else {
                    one = Float.parseFloat(nub1.getText()+"");
                    subtract=true;
                    nub1.setText(null);
                }
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nub1 == null){
                    nub1.setText("");
                }else {
                    one =Float.parseFloat(nub1.getText()+"");
                    multiplication = true;
                    nub1.setText(null);
                }
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nub1 == null){
                    nub1.setText("");
                }else{
                    one = Float.parseFloat(nub1.getText()+"");
                    division = true;
                    nub1.setText(null);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two = Float.parseFloat(nub1.getText()+"");

                 if (addition == true)
                 {
                   nub1.setText(one + two + "");
                   addition = false;
                }
                 if (subtract == true){
                     nub1.setText(one - two + "");
                     subtract = false;
                 }
                 if (multiplication == true){
                     nub1.setText(one * two + "");
                     multiplication= false;
                 }
                 if (division == true){
                     nub1.setText(one / two + "");
                     division =false;
                 }
            }
        });
        b_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText(nub1.getText()+ ".");
            }
        });
        b_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nub1.setText("");
            }
        });

    }


    }

