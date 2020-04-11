package com.neeru.quizzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    String name_s;

    public void name(View view) {
        EditText name = findViewById(R.id.name);
        name_s = name.getText().toString().trim();
        displayname(0);
    }

    public void result(View view) {
        int score = 0;
        // Question  1
        RadioButton radio1A = findViewById(R.id.radio1A);
        RadioButton radio1B = findViewById(R.id.radio1B);
        RadioButton radio1C = findViewById(R.id.radio1C);
        RadioButton radio1D = findViewById(R.id.radio1D);
        if (radio1B.isChecked()) {
            score += 4;
        } else if (radio1A.isChecked() | radio1C.isChecked() | radio1D.isChecked()) {
            score -= 1;
        }
        //Question 4
        RadioButton radio4A = findViewById(R.id.radio4A);
        RadioButton radio4B = findViewById(R.id.radio4B);
        RadioButton radio4C = findViewById(R.id.radio4C);
        RadioButton radio4D = findViewById(R.id.radio4D);
        if (radio4B.isChecked()) {
            score += 4;
        } else if (radio4A.isChecked() | radio4C.isChecked() | radio4D.isChecked()) {
            score -= 1;
        }
        //Question 7
        RadioButton radio7A = findViewById(R.id.radio7A);
        RadioButton radio7B = findViewById(R.id.radio7B);
        RadioButton radio7C = findViewById(R.id.radio7C);
        RadioButton radio7D = findViewById(R.id.radio7D);
        if (radio7A.isChecked()) {
            score += 4;
        } else if (radio7B.isChecked() | radio7C.isChecked() | radio7D.isChecked()) {
            score -= 1;
        }
        //Question 2
        CheckBox Check2A = findViewById(R.id.radio2A);
        CheckBox Check2B = findViewById(R.id.radio2B);
        CheckBox Check2C = findViewById(R.id.radio2C);
        CheckBox Check2D = findViewById(R.id.radio2D);
        if (Check2A.isChecked()) {
            score += 2;
        }
        if (Check2B.isChecked()) {
            score += 2;
        }
        if (Check2C.isChecked() | Check2D.isChecked()) {
            score -= 1;
        }
        //Question 3
        CheckBox Check3A = findViewById(R.id.radio3A);
        CheckBox Check3B = findViewById(R.id.radio3B);
        CheckBox Check3C = findViewById(R.id.radio3C);
        CheckBox Check3D = findViewById(R.id.radio3D);
        if (Check3A.isChecked()) {
            score += 2;
        }
        if (Check3C.isChecked()) {
            score += 2;
        }
        if (Check3B.isChecked() | Check3D.isChecked()) {
            score -= 1;
        }
        //Question 8
        CheckBox Check8A = findViewById(R.id.radio8A);
        CheckBox Check8B = findViewById(R.id.radio8B);
        CheckBox Check8C = findViewById(R.id.radio8C);
        CheckBox Check8D = findViewById(R.id.radio8D);
        if (Check8A.isChecked()) {
            score += 2;
        }
        if (Check8D.isChecked()) {
            score += 2;
        }
        if (Check8B.isChecked() | Check8C.isChecked()) {
            score -= 1;
        }
        //Question 5
        EditText edit5 = findViewById(R.id.edit5);
        String edit5s = edit5.getText().toString().trim();
        if (edit5s.startsWith("Keys") | edit5s.startsWith("keys")) {
            score += 4;
        } else if (edit5s.isEmpty()) {
            score += 0;
        } else {
            score -= 1;
        }
        //Question 6
        EditText edit6 = findViewById(R.id.edit6);
        String edit6s = edit6.getText().toString().trim();
        if (edit6s.equals("llo")) {
            score += 4;
        } else if (edit6s.isEmpty()) {
            score += 0;
        } else {
            score -= 1;
        }
        //Question 9
        EditText edit9 = findViewById(R.id.edit9);
        String edit9s = edit9.getText().toString().trim();
        if (edit9s.equals("break")) {
            score += 4;
        } else if (edit9s.isEmpty()) {
            score += 0;
        } else {
            score -= 1;
        }
        //Question 10
        EditText edit0 = findViewById(R.id.edit0);
        String edit0s = edit0.getText().toString().trim();
        if (edit0s.startsWith("import")) {
            score += 4;
        } else if (edit0s.isEmpty()) {
            score += 0;
        } else {
            score -= 1;
        }
        display(score);
        displayname(score);
    }

    public void display(int score) {
        TextView result_disp =findViewById(R.id.result);
        result_disp.setText("Your Score: " + score);
        Toast.makeText(getApplicationContext(), "Your Score: " + score, Toast.LENGTH_LONG).show();
    }

    public void displayname(int score) {
        TextView result_name =findViewById(R.id.namedisp);
        if (score == 0) {
            result_name.setText("Hi, " + name_s + "\n");
            return;
        }
        result_name.setText("Hi, " + name_s + "\nScore: " + score);
    }
}
