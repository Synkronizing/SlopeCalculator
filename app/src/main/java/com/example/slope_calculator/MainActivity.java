package com.example.slope_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        final TextView result = (TextView) findViewById(R.id.result);
        final TextView bText = (TextView) findViewById(R.id.bText);
        final TextView mText = (TextView) findViewById(R.id.mText);
        calcBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                double slope = (getY1()-getY2())/(getX1()-getX2());
                double yInter = (getY1()-slope*getX1());
                mText.setText(slope +"");
                bText.setText(yInter+"");
                result.setText("Y = " +slope+"X + " + yInter);

            }
        });
    }
    private double getX1(){
        EditText x1EditText = (EditText) findViewById(R.id.x1editText);
        return  Double.parseDouble(x1EditText.getText().toString());

    };
    private double getY1(){
        EditText y1editText = (EditText) findViewById(R.id.y1editText);
        return  Double.parseDouble(y1editText.getText().toString());

    };
    private double getX2(){
        EditText x2EditText = (EditText) findViewById(R.id.x2editText);
        return  Double.parseDouble(x2EditText.getText().toString());

    };
    private double getY2(){
        EditText y2editText = (EditText) findViewById(R.id.y2editText);
        return  Double.parseDouble(y2editText.getText().toString());

    };
}
