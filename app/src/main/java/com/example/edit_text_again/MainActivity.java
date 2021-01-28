package com.example.edit_text_again;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random  rand = new Random();
    int num1 = rand.nextInt(90) + 10;
    int num2 = rand.nextInt(90) + 10;
    String sum_st;
    int sum;
    int toast = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = (TextView) findViewById(R.id.textView);
        TextView t2 = (TextView) findViewById(R.id.textView2);
        TextView t3 = (TextView) findViewById(R.id.textView3);
        TextView t4 = (TextView) findViewById(R.id.textView4);
        TextView t5 = (TextView) findViewById(R.id.textView5);
        TextView t6 = (TextView) findViewById(R.id.textView6);

        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        ImageView img1 = (ImageView) findViewById(R.id.imageView);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);

        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn_new = (Button) findViewById(R.id.button4);



        t1.setText("" + num1);
        t2.setText("" + num2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0)
                {
                    sum_st = et1.getText().toString();
                    sum = Integer.parseInt(sum_st);

                    if (sum == (num1 + num2)) {
                        toast = toast + 1;
                        img1.setImageResource(R.drawable.vi);
                    } else {
                        img1.setImageResource(R.drawable.x2);
                    }

                    count = count + 1;

                    num1 = num1 + num2;
                    t3.setText("" + num1);
                    num2 = rand.nextInt(90) + 10;
                    t4.setText("" + num2);


                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 1)
                {


                    sum_st = String.valueOf(et2.getText());
                    sum = Integer.parseInt(sum_st);

                    if (sum == (num1 + num2)) {
                        toast = toast + 1;
                        img2.setImageResource(R.drawable.vi);
                    } else {
                        img2.setImageResource(R.drawable.x2);
                    }

                    count = count + 1;


                    num1 = num1 + num2;
                    t5.setText("" + num1);
                    num2 = rand.nextInt(90) + 10;
                    t6.setText("" + num2);

                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 2)
                {

                    sum_st = String.valueOf(et3.getText());
                    sum = Integer.parseInt(sum_st);

                    if (sum == (num1 + num2)) {
                        toast = toast + 1;
                        img3.setImageResource(R.drawable.vi);
                    } else {
                        img3.setImageResource(R.drawable.x2);
                    }

                    count = count + 1;
                    Toast.makeText(getApplicationContext(), ""  + toast + "/3 ", Toast.LENGTH_LONG).show();

                }
            }
        });

        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                toast = 0;
                num1 = rand.nextInt(90) + 10;
                num2 = rand.nextInt(90) + 10;


                t1.setText("" + num1);
                t2.setText("" + num2);
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");

                et1.setText("");
                et2.setText("");
                et3.setText("");

                img1.setImageResource(0);
                img2.setImageResource(0);
                img3.setImageResource(0);

            }
        });



    }
}