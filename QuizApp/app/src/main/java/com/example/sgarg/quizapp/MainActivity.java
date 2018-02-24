package com.example.sgarg.quizapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);

        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);

        Button rb = (Button) findViewById(R.id.restart_btn);
        rb.setOnClickListener(this);

        tv = (TextView) findViewById(R.id.timer_text_view);
//        TextView tv2 = (TextView) findViewById(R.id.question_text_view);
//        TextView tv3 = (TextView) findViewById(R.id.score_text_view);
//        TextView tv4 = (TextView) findViewById(R.id.message_test_view);

    }

    public void timer() {
         new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv.setText((int) millisUntilFinished);
                //int j = (int) millisUntilFinished;
                //TextView tv1 = (TextView) findViewById(R.id.timer_text_view);
              // t.setText((int) millisUntilFinished);
               // Log.i("Clicked", "working");
            }


            @Override
            public void onFinish() {

            }

        }.start();

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button1: {
                timer();
               // Toast.makeText(MainActivity.this, "Button Clicked 1", Toast.LENGTH_SHORT).show();

//                new CountDownTimer(30000, 1000) {
//                    @Override
//                    public void onTick(long millisUntilFinished) {
//                        int j = (int) millisUntilFinished;
//                        TextView tv1 = (TextView) findViewById(R.id.timer_text_view);
//                        tv1.setText(j);
//                    }
//
//                    @Override
//                    public void onFinish() {
//
//                    }
//
//                }.start();

                break;
            }

            case R.id.button2: {
                //timer();
               // Toast.makeText(MainActivity.this, "Button Clicked 2", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button3: {
                //timer();
                break;
            }
            case R.id.button4: {
                //timer();
                break;
            }
            default:
                break;
        }

    }



}
