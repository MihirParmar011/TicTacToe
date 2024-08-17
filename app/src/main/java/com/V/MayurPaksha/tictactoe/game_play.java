package com.V.MayurPaksha.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class game_play extends AppCompatActivity
{
    Button btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22;
    String b00,b01,b02,b10,b11,b12,b20,b21,b22;

    int flag =0;
    int Count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        init();

    }

    private void init()
    {
        btn00 = findViewById(R.id.btn00);
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
    }
    public void Check(View view)
    {
        Button btnCurrent = (Button) view;
        if (btnCurrent.getText().toString().equals(""))
        {
            Count++;
            if (flag == 0) {
                btnCurrent.setText("x");
                flag = 1;
            } else {
                btnCurrent.setText("0");
                flag = 0;
            }
            if (Count > 4) {
                b00 = btn00.getText().toString(); //1
                b01 = btn01.getText().toString(); //2
                b02 = btn02.getText().toString(); //3
                b10 = btn10.getText().toString(); //4
                b11 = btn11.getText().toString(); //5
                b12 = btn12.getText().toString(); //6
                b20 = btn20.getText().toString(); //7
                b21 = btn21.getText().toString(); //8
                b22 = btn22.getText().toString(); //9

                //condition

                if (b00.equals(b01) && b01.equals(b02) && !b00.equals("")) {
                    //1
                    Toast.makeText(this, "Winner is : " + b00, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b10.equals(b11) && b11.equals(b12) && !b10.equals("")) {
                    //2
                    Toast.makeText(this, "Winner is : " + b10, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b20.equals(b21) && b21.equals(b22) && !b20.equals("")) {
                    //3
                    Toast.makeText(this, "Winner is : " + b20, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b00.equals(b10) && b10.equals(b20) && !b00.equals("")) {
                    //4
                    Toast.makeText(this, "Winner is : " + b00, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b01.equals(b11) && b11.equals(b21) && !b01.equals("")) {
                    //5
                    Toast.makeText(this, "Winner is : " + b01, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b02.equals(b12) && b12.equals(b22) && !b02.equals("")) {
                    //6
                    Toast.makeText(this, "Winner is : " + b02, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b00.equals(b11) && b11.equals(b22) && !b00.equals("")) {
                    //7
                    Toast.makeText(this, "Winner is : " + b00, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b02.equals(b11) && b11.equals(b20) && !b02.equals("")) {
                    //8
                    Toast.makeText(this, "Winner is : " + b02, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (!b00.equals("") && !b01.equals("") && !b02.equals("")
                        && !b10.equals("") && !b11.equals("") && !b12.equals("")
                        && !b20.equals("") && !b21.equals("") && !b22.equals("")){
                    Toast.makeText(this, "Game Is Drawn", Toast.LENGTH_SHORT).show();
                    NewGame();
                }
            }
        }
    }
    public void NewGame()
    {
        btn00.setText("");
        btn01.setText("");
        btn02.setText("");
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn20.setText("");
        btn21.setText("");
        btn22.setText("");
        Count=0;
        flag=0;
    }
}
//<item name="android:textColor">@color/black</item>
//        <item name="android:textStyle">bold</item>

