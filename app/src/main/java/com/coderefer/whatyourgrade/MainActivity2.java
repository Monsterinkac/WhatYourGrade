package com.coderefer.whatyourgrade;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity{

    public class BmiResultActivity extends AppCompatActivity {
        private Button Button1,Button2;
        public void backb(View view) {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            Intent intent = getIntent();
            int score = intent.getIntExtra("score_value", 0);
            String scoreText = intent.getStringExtra("scoreText");

            TextView t = (TextView) findViewById(R.id.Name_show);
            TextView t2 = (TextView) findViewById(R.id.Score_cal);

            t2.setText(scoreText);


        }
    }

}
