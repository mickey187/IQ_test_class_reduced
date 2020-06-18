package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class NumericalTest extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button show;
    Button save;
    Button clear;
    String text;
    String test;

    ProgressBar progressBar;

    SharedPreferences sharedPreferences;
    String myPreference = "mypref";
    String key = "key";
    String value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerical_test);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.name);

        save =findViewById(R.id.save);
        show = findViewById(R.id.show);
        clear = findViewById(R.id.clear);
        progressBar = findViewById(R.id.progressBar2);


        sharedPreferences = getSharedPreferences(myPreference, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();






        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text =  sharedPreferences.getString("key",value);
                textView.setText(text);



            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test = sharedPreferences.getString(key,"three");
             if (test.equals("one")){
                 progressBar.setProgress(20);


                }
             else if (test.equals("two")){
                 progressBar.setProgress(40);
             }

            }
        });


    }
    public void save(View v){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        value = editText.getText().toString();
        editor.putString(key,value);
        editor.commit();

    }
    public void retrieve(View v){

    }
    public  void clear(View v){

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sharedPreferences = getSharedPreferences(myPreference, Context.MODE_PRIVATE);
         SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.commit();

    }
}
