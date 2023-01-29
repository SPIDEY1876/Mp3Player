package kr.ac.cnu.computer.myapplication;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private TextView edit_p,
            edit_r;
     Button button1,
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9,
            button0,
            buttonP,
            buttonR,
            buttonC;
    int n=0;
    int store=0;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.bt_1);
        button2=(Button)findViewById(R.id.bt_2);
        button3=(Button)findViewById(R.id.bt_3);
        button4=(Button)findViewById(R.id.bt_4);
        button5=(Button)findViewById(R.id.bt_5);
        button6=(Button)findViewById(R.id.bt_6);
        button7=(Button)findViewById(R.id.bt_7);
        button8=(Button)findViewById(R.id.bt_8);
        button9=(Button)findViewById(R.id.bt_9);
        button0=(Button)findViewById(R.id.bt_0);
        buttonP=(Button)findViewById(R.id.bt_add);
        buttonR=(Button)findViewById(R.id.bt_result);
        buttonC=(Button)findViewById(R.id.bt_clear);


        edit_p=(TextView) findViewById(R.id.t_process);
        edit_r=(TextView) findViewById(R.id.t_result);
        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==button1){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+1);
                        n=1;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+1);
                        n=n*10+1;
                    }
                }
                else if(v==button2){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+2);
                        n=2;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+2);
                        n=n*10+2;
                    }
                }
                else if(v==button3){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+3);
                        n=3;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+3);
                        n=n*10+3;
                    }
                }
                else if(v==button4){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+4);
                        n=4;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+4);
                        n=n*10+4;
                    }
                }
                else if(v==button5){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+5);
                        n=5;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+5);
                        n=n*10+5;
                    }
                }
                else if(v==button6){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+6);
                        n=6;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+6);
                        n=n*10+6;
                    }
                }

                else if(v==button7){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+7);
                        n=7;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+7);
                        n=n*10+7;
                    }
                }
                else if(v==button8){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+8);
                        n=8;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+8);
                        n=n*10+8;
                    }
                }
                else if(v==button9){
                    if(n==0){
                        edit_p.setText(edit_p.getText().toString()+9);
                        n=9;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+9);
                        n=n*10+9;
                    }
                }

                else if(v==button0){
                    if(n==0){
                        edit_p.setText("0");
                        n=0;

                    }
                    else{
                        edit_p.setText(edit_p.getText().toString()+0);
                        n=n*10+0;
                    }
                }
                else if(v==buttonP){
                    if(count==0){
                        edit_p.setText(edit_p.getText().toString()+"+");
                        store=n;
                        n=0;
                        count++;
                    }
                    else {
                        edit_p.setText(edit_p.getText().toString()+"+");
                        store=store+n;
                        edit_r.setText(Integer.toString(store));
                        n=0;

                    }
                }
                else if(v==buttonR) {
                        int result=n+store;
                        edit_r.setText(Integer.toString(result));
                        edit_p.setText("");

                }
                else if(v==buttonC){
                   store=0;
                   n=0;
                   edit_p.setText("");
                   edit_r.setText(Integer.toString(0));
                }


            }

        };
        button1.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        button3.setOnClickListener(cl);
        button4.setOnClickListener(cl);
        button5.setOnClickListener(cl);
        button6.setOnClickListener(cl);
        button7.setOnClickListener(cl);
        button8.setOnClickListener(cl);
        button9.setOnClickListener(cl);
        button0.setOnClickListener(cl);
        buttonP.setOnClickListener(cl);
        buttonR.setOnClickListener(cl);
        buttonC.setOnClickListener(cl);

    }
}


