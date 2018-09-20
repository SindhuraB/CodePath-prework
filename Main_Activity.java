package com.example.sindhura.hellosindhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CHANGE COLOR OF TEXT BUTTON
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Change text color to Pink
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.gray));
            }
        });

        //CHANGE BACKGROUND BUTTON
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Change bg color to cyan (hex code had to be added to colors.xml
                findViewById(R.id.rootView).setBackgroundResource(R.drawable.windy_road);
            }
        });

        //CHANGE TEXT BUTTON
        findViewById(R.id.button3).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user input
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();

                //put the text into the text view once the change text button is clicked

                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Sindhu");
                }
                else{
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }


            }
        }));

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back to original(white)
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.white));

                //reset the background color to colorPrimary
                findViewById(R.id.rootView).setBackgroundResource(R.drawable.night_sparkles);

                //reset the text to "Hello from Sindhu"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Sindhu");
            }
        });

    }
}
