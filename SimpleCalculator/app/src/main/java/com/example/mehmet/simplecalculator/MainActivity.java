package com.example.mehmet.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultText;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        resultText = (TextView) findViewById(R.id.textView);
        resultText.setText("Result");
    }

    public void sum (View view){ //view view yaparak düğmeler aktif edildi
     if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
        resultText.setText("Numara yok");

     }
     else {
         int a = Integer.parseInt(editText.getText().toString());//metni integer a çevirdik
         int b = Integer.parseInt(editText2.getText().toString());

         int resultInteger = a + b;

         resultText.setText("Result " + resultInteger);
     }
     }

         public void deduct (View view){  //xml de onclick e sum için sum yazdık

             if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
                 resultText.setText("Numara yok");

             }
             else {
                 int a = Integer.parseInt(editText.getText().toString());//metni integer a çevirdik
                 int b = Integer.parseInt(editText2.getText().toString());

                 int resultInteger = a - b;

                 resultText.setText("Result " + resultInteger);
             }
        }

    public void multiply (View view){

        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("Numara yok");

        }
        else {
            int a = Integer.parseInt(editText.getText().toString());//metni integer a çevirdik
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInteger = a * b;

            resultText.setText("Result " + resultInteger);
        }

    }

        public void divide(View view){


            if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
                resultText.setText("Numara yok");

            }
            else {
                int a = Integer.parseInt(editText.getText().toString());//metni integer a çevirdik
                int b = Integer.parseInt(editText2.getText().toString());

                int resultInteger = a / b;

                resultText.setText("Result " + resultInteger);
            }
         }
}
