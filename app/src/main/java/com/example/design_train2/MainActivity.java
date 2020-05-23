package com.example.design_train2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView result_txt;
    Button add_btn,min_btn,div_btn,mult_btn,result_btn;

    int first,second;

    String txt,op;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_txt = findViewById(R.id.result_txt);
        add_btn = findViewById(R.id.btn_add);
        min_btn = findViewById(R.id.btn_min);
        div_btn = findViewById(R.id.btn_div);
        mult_btn = findViewById(R.id.btn_mul);
        result_btn = findViewById(R.id.btn_eql);

        add_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String f = result_txt.getText().toString();

                if (f.length() == 0)
                {
                    Toast.makeText(MainActivity.this , "please enter first number .." , Toast.LENGTH_SHORT).show();
                } else
                {
                    first = Integer.parseInt(f);

                    op = "+";
                    result_txt.setText("");
                }
            }
        });

        min_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String f = result_txt.getText().toString();

                if (f.length() == 0)
                {
                    Toast.makeText(MainActivity.this , "please enter first number .." , Toast.LENGTH_SHORT).show();
                } else
                {
                    first = Integer.parseInt(f);

                    op = "-";
                    result_txt.setText("");
                }
            }
        });

        mult_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String f = result_txt.getText().toString();

                if (f.length() == 0)
                {
                    Toast.makeText(MainActivity.this , "please enter first number .." , Toast.LENGTH_SHORT).show();
                } else
                {
                    first = Integer.parseInt(f);

                    op = "*";
                    result_txt.setText("");
                }
            }
        });

        div_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String f = result_txt.getText().toString();

                if (f.length() == 0)
                {
                    Toast.makeText(MainActivity.this , "please enter first number .." , Toast.LENGTH_SHORT).show();
                } else
                {
                    first = Integer.parseInt(f);

                    op = "/";
                    result_txt.setText("");
                }
            }
        });

        result_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (result_txt.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "please enter second number ..", Toast.LENGTH_SHORT).show();
                } else
                {
                    String s = result_txt.getText().toString();
                    second = Integer.parseInt(s);

                    switch (op)
                    {
                        case "+":
                            result_txt.setText(first + second + "");
                            break;
                        case "-":
                            result_txt.setText(first - second + "");
                            break;
                        case "*":
                            result_txt.setText(first * second + "");
                            break;
                        case "/":
                            result_txt.setText(first / second + "");
                            break;
                    }
                }
            }
        });
    }

//    public void returnDefaultColor ()
//    {
//        add_btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//        min_btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//        mult_btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//        div_btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//    }

    public void Button(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_0:
                txt = result_txt.getText().toString() + "0";
                result_txt.setText(txt);

               // returnDefaultColor();
                break;
            case R.id.btn_1:
                txt = result_txt.getText().toString() + "1";
                result_txt.setText(txt);

                //returnDefaultColor();
                break;
            case R.id.btn_2:
                txt = result_txt.getText().toString() + "2";
                result_txt.setText(txt);

               // returnDefaultColor();
                break;
            case R.id.btn_3:
                txt = result_txt.getText().toString() + "3";
                result_txt.setText(txt);

               // returnDefaultColor();
                break;
            case R.id.btn_4:
                txt = result_txt.getText().toString() + "4";
                result_txt.setText(txt);

               // returnDefaultColor();
                break;
            case R.id.btn_5:
                txt = result_txt.getText().toString() + "5";
                result_txt.setText(txt);

                //returnDefaultColor();
                break;
            case R.id.btn_6:
                txt = result_txt.getText().toString() + "6";
                result_txt.setText(txt);

                //returnDefaultColor();
                break;
            case R.id.btn_7:
                txt = result_txt.getText().toString() + "7";
                result_txt.setText(txt);

                //returnDefaultColor();
                break;
            case R.id.btn_8:
                txt = result_txt.getText().toString() + "8";
                result_txt.setText(txt);

               // returnDefaultColor();
                break;
            case R.id.btn_9:
                txt = result_txt.getText().toString() + "9";
                result_txt.setText(txt);

               // returnDefaultColor();
                break;
            case R.id.btn_c:
                result_txt.setText("");

                //returnDefaultColor();
                break;
        }
    }
}
