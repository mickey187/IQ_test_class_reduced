package com.example.iqtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class WordTest extends AppCompatActivity {

    HomeFragment homeFragment;

      int counter = 0;
    ProgressBar progressBar;
    Button show_score;
    Button question5_button;
    Button question7_button;

    TextView score_text_view;
    TextView countdown_number;

    EditText  question5_input;
    EditText  question7_input;

    String question5_answer = "ABSOLUTELY FABULOUS";
    String question7_answer = "MAKE";
    String key = "key";




    SharedPreferences sharedPreferences;
   // String  preferences = "my preference";

    TextToSpeech textToSpeech;

    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;
    RadioGroup group4;
    RadioGroup group6;


    RadioButton WT_Q1_CH_A;
    RadioButton WT_Q1_CH_B;
    RadioButton WT_Q1_CH_C;
    RadioButton WT_Q1_CH_D;
    RadioButton WT_Q1_CH_E;

    RadioButton WT_Q2_CH_A;
    RadioButton WT_Q2_CH_B;
    RadioButton WT_Q2_CH_C;
    RadioButton WT_Q2_CH_D;
    RadioButton WT_Q2_CH_E;

    RadioButton WT_Q3_CH_A;
    RadioButton WT_Q3_CH_B;
    RadioButton WT_Q3_CH_C;
    RadioButton WT_Q3_CH_D;
    RadioButton WT_Q3_CH_E;

    RadioButton WT_Q4_CH_A;
    RadioButton WT_Q4_CH_B;
    RadioButton WT_Q4_CH_C;
    RadioButton WT_Q4_CH_D;

    RadioButton WT_Q6_CH_A;
    RadioButton WT_Q6_CH_B;
    RadioButton WT_Q6_CH_C;
    RadioButton WT_Q6_CH_D;
    RadioButton WT_Q6_CH_E;
    RadioButton WT_Q6_CH_F;

    CheckBox WT_Q6_CH_1;
    CheckBox WT_Q6_CH_2;
    CheckBox WT_Q6_CH_3;
    CheckBox WT_Q6_CH_4;
    CheckBox WT_Q6_CH_5;
    CheckBox WT_Q6_CH_6;

    Boolean checkedState;

    View view;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_test);

        homeFragment = new HomeFragment();




        sharedPreferences = getSharedPreferences("preferences",Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(getString(R.string.counter_key),getResources().getInteger(R.integer.default_counter_value));
        editor.putInt(getString(R.string.score_key),getResources().getInteger(R.integer.default_score_value));
        editor.putInt("x",0);
        editor.putInt("y",0);
       editor.commit();







        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    int ttsLang = textToSpeech.setLanguage(Locale.US);

                }
            }
        });

        final HomeFragment homeFragment = new HomeFragment();


        //show_score = findViewById(R.id.show_score);


        countdown_number = findViewById(R.id.countdown_number);
       // score_text_view = findViewById(R.id.score_text_view);

        question5_input = findViewById(R.id.input_for_Q5);
        question7_input = findViewById(R.id.input_for_Q7);

        question7_button = findViewById(R.id.Q7_button);
        question5_button = findViewById(R.id.Q5_button);


        group1 = findViewById(R.id.WT_RG_Q1);
        group2 = findViewById(R.id.WT_RG_Q2);
        group3 = findViewById(R.id.WT_RG_Q3);
        group4 = findViewById(R.id.WT_RG_Q4);
        group6 = findViewById(R.id.WT_RG_Q6);

        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.WT_Q1_CH_A || checkedId == R.id.WT_Q1_CH_B
                        || checkedId == R.id.WT_Q1_CH_C || checkedId == R.id.WT_Q1_CH_D || checkedId == R.id.WT_Q1_CH_E){
                    editor.putBoolean("radio_check",false);
                    for(int i = 0;i < group.getChildCount();i++){
                        group1.getChildAt(i).setEnabled(sharedPreferences.getBoolean("radio_check",false));
                    }
                }
            }
        });
        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.WT_Q2_CH_A || checkedId == R.id.WT_Q2_CH_B
                        || checkedId == R.id.WT_Q2_CH_C || checkedId == R.id.WT_Q2_CH_D || checkedId == R.id.WT_Q2_CH_E){
                    for(int i = 0;i < group.getChildCount();i++){
                        group2.getChildAt(i).setEnabled(false);
                    }
                }
            }
        });
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.WT_Q3_CH_A || checkedId == R.id.WT_Q3_CH_B
                        || checkedId == R.id.WT_Q3_CH_C || checkedId == R.id.WT_Q3_CH_D || checkedId == R.id.WT_Q3_CH_E){
                    for(int i = 0;i < group.getChildCount();i++){
                        group3.getChildAt(i).setEnabled(false);
                    }
                }
            }
        });
        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.WT_Q4_CH_A || checkedId == R.id.WT_Q4_CH_B
                        || checkedId == R.id.WT_Q4_CH_C || checkedId == R.id.WT_Q4_CH_D){
                    for(int i = 0;i < group.getChildCount();i++){
                        group4.getChildAt(i).setEnabled(false);
                    }
                }
            }
        });


        WT_Q1_CH_A = findViewById(R.id.WT_Q1_CH_A);
        WT_Q1_CH_B = findViewById(R.id.WT_Q1_CH_B);
        WT_Q1_CH_C = findViewById(R.id.WT_Q1_CH_C);
        WT_Q1_CH_D = findViewById(R.id.WT_Q1_CH_D);
        WT_Q1_CH_E = findViewById(R.id.WT_Q1_CH_E);

        WT_Q2_CH_A = findViewById(R.id.WT_Q2_CH_A);
        WT_Q2_CH_B = findViewById(R.id.WT_Q2_CH_B);
        WT_Q2_CH_C = findViewById(R.id.WT_Q2_CH_C);
        WT_Q2_CH_D= findViewById(R.id.WT_Q2_CH_D);
        WT_Q2_CH_E = findViewById(R.id.WT_Q2_CH_E);

        WT_Q3_CH_A = findViewById(R.id.WT_Q3_CH_A);
        WT_Q3_CH_B = findViewById(R.id.WT_Q3_CH_B);
        WT_Q3_CH_C = findViewById(R.id.WT_Q3_CH_C);
        WT_Q3_CH_D = findViewById(R.id.WT_Q3_CH_D);
        WT_Q3_CH_E = findViewById(R.id.WT_Q3_CH_E);

        WT_Q4_CH_A = findViewById(R.id.WT_Q4_CH_A);
        WT_Q4_CH_B = findViewById(R.id.WT_Q4_CH_B);
        WT_Q4_CH_C = findViewById(R.id.WT_Q4_CH_C);
        WT_Q4_CH_D = findViewById(R.id.WT_Q4_CH_D);



        WT_Q6_CH_1 = findViewById(R.id.WT_Q6_CH_1);
        WT_Q6_CH_2 = findViewById(R.id.WT_Q6_CH_2);
         WT_Q6_CH_3 = findViewById(R.id.WT_Q6_CH_3);
         WT_Q6_CH_4 = findViewById(R.id.WT_Q6_CH_4);
         WT_Q6_CH_5 = findViewById(R.id.WT_Q6_CH_5);
         WT_Q6_CH_6 = findViewById(R.id.WT_Q6_CH_6);
        //Q1
        WT_Q1_CH_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q1_CH_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q1_CH_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForCorrectAnswer(v);
                String speech = "That is Correct";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
                counter = counter + 1;
                //editor.putInt(getString(R.string.key),getResources().getInteger(R.integer.value2));
                editor.putInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_1));
                editor.putInt(getString(R.string.score_key),getResources().getInteger(R.integer.score1_value));

                editor.commit();






            }
        });
        WT_Q1_CH_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q1_CH_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        //Q2
        WT_Q2_CH_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q2_CH_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q2_CH_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q2_CH_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForCorrectAnswer(v);
                String speech = "That is Correct";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
                counter = counter + 1;
                editor.putInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_2));
                editor.putInt(getString(R.string.score_key),getResources().getInteger(R.integer.score2_value));
                editor.commit();

            }
        });
        WT_Q2_CH_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        //Q3
        WT_Q3_CH_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q3_CH_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q3_CH_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        WT_Q3_CH_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForCorrectAnswer(v);
                String speech = "That is Correct";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
                counter = counter + 1;
                editor.putInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_3));
                editor.putInt(getString(R.string.score_key),getResources().getInteger(R.integer.score3_value));
                editor.commit();
            }
        });
        WT_Q3_CH_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        //Q4
        WT_Q4_CH_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        WT_Q4_CH_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        WT_Q4_CH_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForCorrectAnswer(v);
                String speech = "That is Correct";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
                counter = counter + 1;
                editor.putInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_4));
                editor.putInt(getString(R.string.score_key),getResources().getInteger(R.integer.score4_value));
                editor.commit();

            }
        });
        WT_Q4_CH_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        //Q5

        question5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String answer= question5_input.getText().toString().toUpperCase();


            if(answer.equals(question5_answer)){
                showPopupForCorrectAnswer(v);
                String speech = "That is Correct";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
                counter = counter + 1;
                question5_input.setEnabled(false);

            }
            else
                showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);



            }
        });

        //Q6


//        WT_Q6_CH_A.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
//
//            }
//        });

        //Q7

        question7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = question7_input.getText().toString().toUpperCase();
                if (answer.equals(question7_answer)){
                    showPopupForCorrectAnswer(v);
                    String speech = "That is Correct";
                    int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
                    counter = counter + 1;
                    question7_input.setEnabled(false);

                }
                else
                    showPopupForIncorrectAnswer(v);
                String speech = "That is Incorrect";
                int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);


            }
        });




















      /*  show_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = Integer.toString(counter);
                score_text_view.setText("your total score is: "+result);
            }
        });

       */


        new CountDownTimer(90000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                countdown_number.setText("time remaining: "+millisUntilFinished/1000 +" seconds");

            }

            @Override
            public void onFinish() {
                countdown_number.setText("done");
            }
        }.start();






getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showPopupForCorrectAnswer(View view){
        LayoutInflater layoutInflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = layoutInflater.inflate(R.layout.popup_window_correct,null);
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true;
        final PopupWindow popupWindow = new PopupWindow(popupView,width,height,focusable);

        popupWindow.showAtLocation(view, Gravity.CENTER,0,0);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                popupWindow.dismiss();
            }
        },1200);
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });

    }
    public void showPopupForIncorrectAnswer(View view){
        LayoutInflater layoutInflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = layoutInflater.inflate(R.layout.popup_window_wrong,null);
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true;
        final PopupWindow popupWindow = new PopupWindow(popupView,width,height,focusable);

        popupWindow.showAtLocation(view, Gravity.CENTER,0,0);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                popupWindow.dismiss();
            }
        },1200);
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
    public void onChecked(View v){
        if (WT_Q6_CH_1.isChecked() && WT_Q6_CH_3.isChecked()){
            showPopupForCorrectAnswer(v);
            String speech = "That is Correct";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
            WT_Q6_CH_1.setEnabled(false);
            WT_Q6_CH_3.setEnabled(false);
            counter = counter + 1;

        }
        else if(WT_Q6_CH_1.isChecked() && WT_Q6_CH_2.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_1.isChecked() && WT_Q6_CH_4.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_1.isChecked() && WT_Q6_CH_5.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_1.isChecked() && WT_Q6_CH_6.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }


        else if(WT_Q6_CH_2.isChecked() && WT_Q6_CH_3.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_2.isChecked() && WT_Q6_CH_4.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_2.isChecked() && WT_Q6_CH_5.isChecked() ){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
        }
        else if(WT_Q6_CH_2.isChecked() && WT_Q6_CH_6.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
        }


        else if(WT_Q6_CH_3.isChecked() && WT_Q6_CH_4.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_3.isChecked() && WT_Q6_CH_5.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_3.isChecked() && WT_Q6_CH_6.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }


        else if(WT_Q6_CH_4.isChecked() && WT_Q6_CH_5.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
        else if(WT_Q6_CH_4.isChecked() && WT_Q6_CH_6.isChecked()){
            showPopupForIncorrectAnswer(v);
            String speech = "That is Incorrect";
            int speechStatus = textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null);

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sharedPreferences = getSharedPreferences("preferences",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.commit();
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        sharedPreferences = getSharedPreferences("preferences",Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.commit();
//    }
}
