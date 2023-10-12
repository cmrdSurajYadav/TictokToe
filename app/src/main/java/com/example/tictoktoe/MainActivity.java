package com.example.tictoktoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tictoktoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    static int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        flag=0;

        activityMainBinding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn1);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn1.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        activityMainBinding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn2);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn2.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        activityMainBinding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn3);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn3.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        activityMainBinding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn4);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn4.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        activityMainBinding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn5);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn5.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        activityMainBinding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn6);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn6.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        activityMainBinding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn7);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn7.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }

            }
        });
        activityMainBinding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn8);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn8.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        activityMainBinding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark(activityMainBinding.btn9);
                if(checkForWin()){
                    Toast.makeText(MainActivity.this, activityMainBinding.btn9.getText()+" Won", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });



    }

    private boolean checkForWin() {
        // Check rows
        if (checkWin(activityMainBinding.btn1, activityMainBinding.btn2, activityMainBinding.btn3) ||
                checkWin(activityMainBinding.btn4, activityMainBinding.btn5, activityMainBinding.btn6) ||
                checkWin(activityMainBinding.btn7, activityMainBinding.btn8, activityMainBinding.btn9)) {
            return true;
        }

        // Check columns
        if (checkWin(activityMainBinding.btn1, activityMainBinding.btn4, activityMainBinding.btn7) ||
                checkWin(activityMainBinding.btn2, activityMainBinding.btn5, activityMainBinding.btn8) ||
                checkWin(activityMainBinding.btn3, activityMainBinding.btn6, activityMainBinding.btn9)) {
            return true;
        }

        // Check diagonals
        if (checkWin(activityMainBinding.btn1, activityMainBinding.btn5, activityMainBinding.btn9) ||
                checkWin(activityMainBinding.btn3, activityMainBinding.btn5, activityMainBinding.btn7)) {
            return true;
        }

        return false;
    }

    private boolean checkWin(AppCompatButton button1, AppCompatButton button2, AppCompatButton button3) {
        String text1 = button1.getText().toString();
        String text2 = button2.getText().toString();
        String text3 = button3.getText().toString();

        return text1.equals(text2) && text1.equals(text3) && !text1.isEmpty();
    }



    public static void mark(AppCompatButton button){
       if(flag==0){
           button.setText("0");
           flag=1;
       }else{
           button.setText("X");
           flag=0;
       }
    }
    public void reset(){
        activityMainBinding.btn1.setText("");
        activityMainBinding.btn2.setText("");
        activityMainBinding.btn3.setText("");
        activityMainBinding.btn4.setText("");
        activityMainBinding.btn5.setText("");
        activityMainBinding.btn6.setText("");
        activityMainBinding.btn7.setText("");
        activityMainBinding.btn8.setText("");
        activityMainBinding.btn9.setText("");
    }
}