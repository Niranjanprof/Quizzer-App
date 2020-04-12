package com.neeru.quizzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button submitButton = findViewById(R.id.submit);
        Button reset = findViewById(R.id.reset);
        Button nameButton = findViewById(R.id.nameButton);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name();
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result();
            }
        });

    }
    //Can we call onCreate() again ?? That would better than writting the whole Code
    public void reset(){
        TextView text  = findViewById(R.id.namedisp);
        text.setText("");
        TextView text1  = findViewById(R.id.result);
        text1.setText("");
        EditText edit  = findViewById(R.id.name);
        edit.setText("");
        EditText edit1  = findViewById(R.id.edit5);
        edit1.setText("");
        EditText edit2  = findViewById(R.id.edit6);
        edit2.setText("");
        EditText edit3  = findViewById(R.id.edit9);
        edit3.setText("");
        EditText edit4  = findViewById(R.id.edit0);
        edit4.setText("");
        RadioButton radio1 = findViewById(R.id.radio1A);
        radio1.setChecked(false);
        RadioButton radio2 = findViewById(R.id.radio4A);
        radio2.setChecked(false);
        RadioButton radio3 = findViewById(R.id.radio7A);
        radio3.setChecked(false);
        RadioButton radio4 = findViewById(R.id.radio1B);
        radio4.setChecked(false);
        RadioButton radio5 = findViewById(R.id.radio1C);
        radio5.setChecked(false);
        RadioButton radio6 = findViewById(R.id.radio1D);
        radio6.setChecked(false);
        RadioButton radio7 = findViewById(R.id.radio7D);
        radio7.setChecked(false);
        RadioButton radio8 = findViewById(R.id.radio7B);
        radio8.setChecked(false);
        RadioButton radio9 = findViewById(R.id.radio7C);
        radio9.setChecked(false);
        RadioButton radio0 = findViewById(R.id.radio4B);
        radio0.setChecked(false);
        RadioButton radioA = findViewById(R.id.radio4C);
        radioA.setChecked(false);
        RadioButton radioB = findViewById(R.id.radio4D);
        radioB.setChecked(false);
        CheckBox check1 = findViewById(R.id.radio2A);
        check1.setChecked(false);
        CheckBox check2 = findViewById(R.id.radio2B);
        check2.setChecked(false);
        CheckBox check3 = findViewById(R.id.radio2C);
        check3.setChecked(false);
        CheckBox check4 = findViewById(R.id.radio2D);
        check4.setChecked(false);
        CheckBox check5 = findViewById(R.id.radio3A);
        check5.setChecked(false);
        CheckBox check6 = findViewById(R.id.radio3B);
        check6.setChecked(false);
        CheckBox check7 = findViewById(R.id.radio3C);
        check7.setChecked(false);
        CheckBox check8 = findViewById(R.id.radio3D);
        check8.setChecked(false);
        CheckBox check9 = findViewById(R.id.radio8A);
        check9.setChecked(false);
        CheckBox check0 = findViewById(R.id.radio8B);
        check0.setChecked(false);
        CheckBox checkA = findViewById(R.id.radio8C);
        checkA.setChecked(false);
        CheckBox checkB = findViewById(R.id.radio8D);
        checkB.setChecked(false);
    }

    String nameString;
    int totalScore = 40;

    public void name() {
        EditText name = findViewById(R.id.name);
        nameString = name.getText().toString().trim();
        displayname(0);
    }

    public void result() {
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
        // I had a logical error while computing total marks
        //If all checkboxes are True mark was given
        //Now I've corrected it such a way that if there is wrong answer you will get deducted
        CheckBox Check2A = findViewById(R.id.radio2A);
        CheckBox Check2B = findViewById(R.id.radio2B);
        CheckBox Check2C = findViewById(R.id.radio2C);
        CheckBox Check2D = findViewById(R.id.radio2D);
        if(Check2A.isChecked() & Check2B.isChecked() & !(Check2C.isChecked()) & !(Check2D.isChecked())){
            score += 4;
        }
        else if (Check2A.isChecked() & !(Check2C.isChecked()) & !(Check2D.isChecked())) {
            score += 2;
        }
        else if (Check2B.isChecked() & !(Check2C.isChecked()) & !(Check2D.isChecked())) {
            score += 2;
        }
        else if (Check2C.isChecked() | Check2D.isChecked()) {
            score -= 1;
        }
        //Question 3
        CheckBox Check3A = findViewById(R.id.radio3A);
        CheckBox Check3B = findViewById(R.id.radio3B);
        CheckBox Check3C = findViewById(R.id.radio3C);
        CheckBox Check3D = findViewById(R.id.radio3D);
        if(Check3A.isChecked() & Check3C.isChecked() & !(Check3B.isChecked()) & !(Check3D.isChecked())){
            score += 4;
        }
        else if (Check3A.isChecked() & !(Check3B.isChecked()) & !(Check3D.isChecked())) {
            score += 2;
        }
        else if (Check3C.isChecked() & !(Check3B.isChecked()) & !(Check3D.isChecked())) {
            score += 2;
        }
        else if (Check3B.isChecked() | Check3D.isChecked()) {
            score -= 1;
        }
        //Question 8
        CheckBox Check8A = findViewById(R.id.radio8A);
        CheckBox Check8B = findViewById(R.id.radio8B);
        CheckBox Check8C = findViewById(R.id.radio8C);
        CheckBox Check8D = findViewById(R.id.radio8D);
        if(Check8A.isChecked() & Check8D.isChecked() & !(Check8C.isChecked()) & !(Check8B.isChecked())){
            score += 4;
        }
        else if (Check8A.isChecked() & !(Check8C.isChecked()) & !(Check8B.isChecked())) {
            score += 2;
        }
        else if (Check8D.isChecked() & !(Check8C.isChecked()) & !(Check2B.isChecked())) {
            score += 2;
        }
        else if (Check8C.isChecked() | Check8B.isChecked()) {
            score -= 1;
        }
        //Question 5
        EditText edit5 = findViewById(R.id.edit5);
        String edit5s = edit5.getText().toString().trim().toLowerCase();
        if (edit5s.startsWith("keys")) {
            score += 4;
        } else if (edit5s.isEmpty()) {
        } else {
            score -= 1;
        }
        //Question 6
        EditText edit6 = findViewById(R.id.edit6);
        String edit6s = edit6.getText().toString().trim();
        if (edit6s.equals("llo")) {
            score += 4;
        } else if (edit6s.isEmpty()) {
        } else {
            score -= 1;
        }
        //Question 9
        EditText edit9 = findViewById(R.id.edit9);
        String edit9s = edit9.getText().toString().trim();
        if (edit9s.equals("break")) {
            score += 4;
        } else if (edit9s.isEmpty()) {
        } else {
            score -= 1;
        }
        //Question 10
        EditText edit0 = findViewById(R.id.edit0);
        String edit0s = edit0.getText().toString().trim();
        if (edit0s.startsWith("import")) {
            score += 4;
        } else if (edit0s.isEmpty()) {
        } else {
            score -= 1;
        }
        display(score);
        displayname(score);
    }
    // I tried by keeping this in strings.xml but it gave some number instead of Strings
    public void display(int score) {
        TextView result_disp =findViewById(R.id.result);
        result_disp.setText("You've Scored: " + score + "/" + totalScore);
        Toast.makeText(getApplicationContext(), "You've Scored: "+ score + "/" + totalScore, Toast.LENGTH_LONG).show();
    }

    public void displayname(int score) {
        TextView result_name =findViewById(R.id.namedisp);
        if (score == 0) {
            result_name.setText("Hi, " + nameString + "\n");
            return;
        }
        result_name.setText("Hi, "+ nameString + "\n" +"You've Scored: "+ "/" + totalScore);
    }
}
