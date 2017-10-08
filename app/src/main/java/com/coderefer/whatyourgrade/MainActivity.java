package com.coderefer.whatyourgrade;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mNameEditText, mScoreEditText;
    private Button mGraderButton, mExitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = (EditText) findViewById(R.id.edit_text_name);
        mScoreEditText = (EditText) findViewById(R.id.edit_text_score);
        mGraderButton = (Button) findViewById(R.id.name_Button);
        mExitButton = (Button) findViewById(R.id.score_Button);
        mGraderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(mNameEditText.getText().toString());
                String score = String.valueOf(mScoreEditText.getText().toString());

                String result = String.format(name,score);


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name_value",name);
                intent.putExtra("score_text", score);
                startActivity(intent);

}
});
 }


    private String getScoreText(int score) {
        String scoreText = "";
        if (score < 50) {
            scoreText = "F";
        } else if (score < 60) {
            scoreText = "D";
        } else if (score < 70) {
            scoreText = "C";
        } else if (score < 80) {
            scoreText = "B";
        } else {
            scoreText = "A";
        }

return scoreText;
    }
}