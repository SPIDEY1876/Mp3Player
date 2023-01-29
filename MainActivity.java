package kr.ac.cnu.computer.rotto;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    TextView tv;
    String n="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button);
        button2=findViewById(R.id.clear);
        tv=findViewById(R.id.text);
        View.OnClickListener cl = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if(v==button1){
                int[] rotto = new int[45];
                for(int i=0;i<rotto.length;i++)
                    rotto[i]=i+1;

                for(int k=0;k<5;k++) {


                    int temp=0;
                    int j=0;
                    for(int i=0;i<6;i++) {
                        j=(int)(Math.random()*45);
                        temp=rotto[i];
                        rotto[i]=rotto[j];
                        rotto[j]=temp;
                    }

                    int[] print = Arrays.copyOfRange(rotto,0,6);
                    Arrays.sort(print);

                    for(int i=0;i<6;i++) {
                        if(print[i]<10){n=n+" "+print[i]+",";}
                        else{  n=n+print[i]+",";}
                      }
                    n=n+"\n";
                    tv. setText(n);

                    Arrays.sort(rotto);
                }

            }
                else if(v==button2){
                    n="";
                    tv.setText("");
                }

        }
        };

        button1.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        tv.setOnClickListener(cl);
        }
    }
