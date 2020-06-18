package com.example.iqtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IQ_Test_One extends AppCompatActivity   {

    ArrayList <String> correct_answers = new ArrayList<>();
    ArrayList <String> user_answers = new ArrayList<>();



    String answer_holder;
    String answer_holder2;
    String answer_holder3;
    String answer_holder4;
    String answer_holder5;
    String answer_holder6;
    String answer_holder7;
    String answer_holder8;
    String answer_holder9;
    String answer_holder10;
    String answer_holder11;
    String answer_holder12;
    String answer_holder13;
    String answer_holder14;
    String answer_holder15;
    String answer_holder16;
    String answer_holder17;
    String answer_holder18;
    String answer_holder19;
    String answer_holder20;
    String answer_holder21;
    String answer_holder22;
    String answer_holder23;
    String answer_holder24;
    String answer_holder25;
    String answer_holder26;
    String answer_holder27;
    String answer_holder28;
    String answer_holder29;
    String answer_holder30;
    String answer_holder31;
    String answer_holder32;
    String answer_holder33;
    String answer_holder34;
    String answer_holder35;
    String answer_holder36;
    String answer_holder37;
    String answer_holder38;
    String answer_holder39;
    String answer_holder40;
    String q10_ans1;
    String q10_ans2;
    String q15_ans1;
    String q15_ans2;
    String q26_ans1;
    String q26_ans2;
    String q38_ans1;
    String q38_ans2;
    String q38_ans3;
    String score_number;



    ScrollView scrollView;
    int scroll_position_x = 0;
    int scroll_position_y = 0;

    EditText iq_test_q1_input;
    EditText iq_test_q2_input;
    EditText iq_test_q3_input;
    EditText iq_test_q5_input;
    EditText iq_test_q9_input;
    EditText iq_test_q10_input;
    EditText iq_test_q10_input2;
    EditText iq_test_q13_input;
    EditText iq_test_q15_input;
    EditText iq_test_q15_input2;
    EditText iq_test_q16_input;
    EditText iq_test_q20_input;
    EditText iq_test_q22_input;
    EditText iq_test_q25_input;
    EditText iq_test_q26_input1;
    EditText iq_test_q26_input2;
    EditText iq_test_q28_input;
    EditText iq_test_q30_input;
    EditText iq_test_q31_input;
    EditText iq_test_q33_input;
    EditText iq_test_q35_input;
    EditText iq_test_q36_input;
    EditText iq_test_q38_input;
    EditText iq_test_q38_input2;
    EditText iq_test_q38_input3;
    EditText iq_test_q40_input;

    RadioButton iq_test_q6_ch1;
    RadioButton iq_test_q6_ch2;
    RadioButton iq_test_q6_ch3;
    RadioButton iq_test_q6_ch4;
    RadioButton iq_test_q6_ch5;
    RadioButton iq_test_q6_ch6;

    RadioButton iq_test_q7_ch1;
    RadioButton iq_test_q7_ch2;
    RadioButton iq_test_q7_ch3;
    RadioButton iq_test_q7_ch4;
    RadioButton iq_test_q7_ch5;
    RadioButton iq_test_q7_ch6;

    RadioButton iq_test_q11_ch1;
    RadioButton iq_test_q11_ch2;
    RadioButton iq_test_q11_ch3;
    RadioButton iq_test_q11_ch4;
    RadioButton iq_test_q11_ch5;

    RadioButton iq_test_q12_ch1;
    RadioButton iq_test_q12_ch2;
    RadioButton iq_test_q12_ch3;
    RadioButton iq_test_q12_ch4;
    RadioButton iq_test_q12_ch5;
    RadioButton iq_test_q12_ch6;

    RadioButton iq_test_q17_ch1;
    RadioButton iq_test_q17_ch2;
    RadioButton iq_test_q17_ch3;
    RadioButton iq_test_q17_ch4;
    RadioButton iq_test_q17_ch5;



    RadioButton iq_test_q23_ch1;
    RadioButton iq_test_q23_ch2;
    RadioButton iq_test_q23_ch3;
    RadioButton iq_test_q23_ch4;
    RadioButton iq_test_q23_ch5;

    RadioButton iq_test_q39_ch1;
    RadioButton iq_test_q39_ch2;
    RadioButton iq_test_q39_ch3;
    RadioButton iq_test_q39_ch4;
    RadioButton iq_test_q39_ch5;
    RadioButton iq_test_q39_ch6;
    RadioButton iq_test_q39_ch7;


    CheckBox iq_test_q4_ch1;
    CheckBox iq_test_q4_ch2;
    CheckBox iq_test_q4_ch3;
    CheckBox iq_test_q4_ch4;
    CheckBox iq_test_q4_ch5;
    CheckBox iq_test_q4_ch6;

    CheckBox iq_test_q19_ch1;
    CheckBox iq_test_q19_ch2;
    CheckBox iq_test_q19_ch3;
    CheckBox iq_test_q19_ch4;
    CheckBox iq_test_q19_ch5;
    CheckBox iq_test_q19_ch6;

    ImageButton iq_test_q8_ch1;
    ImageButton iq_test_q8_ch2;
    ImageButton iq_test_q8_ch3;
    ImageButton iq_test_q8_ch4;

    ImageButton iq_test_q14_ch1;
    ImageButton iq_test_q14_ch2;
    ImageButton iq_test_q14_ch3;
    ImageButton iq_test_q14_ch4;
    ImageButton iq_test_q14_ch5;

    ImageButton iq_test_q18_ch1;
    ImageButton iq_test_q18_ch2;
    ImageButton iq_test_q18_ch3;
    ImageButton iq_test_q18_ch4;
    ImageButton iq_test_q18_ch5;

    ImageButton iq_test_q21_ch1;
    ImageButton iq_test_q21_ch2;
    ImageButton iq_test_q21_ch3;
    ImageButton iq_test_q21_ch4;
    ImageButton iq_test_q21_ch5;
    ImageButton iq_test_q21_ch6;

    ImageButton iq_test_q24_ch1;
    ImageButton iq_test_q24_ch2;
    ImageButton iq_test_q24_ch3;
    ImageButton iq_test_q24_ch4;
    ImageButton iq_test_q24_ch5;
    ImageButton iq_test_q24_ch6;

    ImageButton iq_test_q27_ch1;
    ImageButton iq_test_q27_ch2;
    ImageButton iq_test_q27_ch3;
    ImageButton iq_test_q27_ch4;
    ImageButton iq_test_q27_ch5;

    ImageButton iq_test_q29_ch1;
    ImageButton iq_test_q29_ch2;
    ImageButton iq_test_q29_ch3;
    ImageButton iq_test_q29_ch4;
    ImageButton iq_test_q29_ch5;
    ImageButton iq_test_q29_ch6;

    ImageButton iq_test_q32_ch1;
    ImageButton iq_test_q32_ch2;
    ImageButton iq_test_q32_ch3;
    ImageButton iq_test_q32_ch4;
    ImageButton iq_test_q32_ch5;

    ImageButton iq_test_q34_ch1;
    ImageButton iq_test_q34_ch2;
    ImageButton iq_test_q34_ch3;
    ImageButton iq_test_q34_ch4;
    ImageButton iq_test_q34_ch5;
    ImageButton iq_test_q34_ch6;

    ImageButton iq_test_q37_ch1;
    ImageButton iq_test_q37_ch2;
    ImageButton iq_test_q37_ch3;
    ImageButton iq_test_q37_ch4;
    ImageButton iq_test_q37_ch5;
    ImageButton iq_test_q37_ch6;





    TextView score;


    Button iq_test_q1_button;
    Button iq_test_q2_button;
    Button iq_test_q3_button;
    Button iq_test_q5_button;
    Button iq_test_q9_button;
    Button iq_test_q10_button;
    Button iq_test_q13_button;
    Button iq_test_q15_button;
    Button iq_test_q16_button;
    Button iq_test_q20_button;
    Button iq_test_q22_button;
    Button iq_test_q25_button;
    Button iq_test_q26_button;
    Button iq_test_q28_button;
    Button iq_test_q30_button;
    Button iq_test_q31_button;
    Button iq_test_q33_button;
    Button iq_test_q35_button;
    Button iq_test_q36_button;
    Button iq_test_q38_button;
    Button iq_test_q40_button;

    Button show_score;
    Button click_me;
    int counter;

    LinearLayout linearLayout;
    FrameLayout frameLayout;
    FrameLayout frameLayout2;
    ConstraintLayout constraintLayout;

    SharedPreferences sharedPreferences;

    CardView card1;
    CardView card2;
    CardView card3;
    CardView cardholder;
    //CardView card4;

    Dialog dialog = new Dialog();

    List <CardView> cardViews = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_q__test__one);

        scrollView = findViewById(R.id.scrollview);

        frameLayout = findViewById(R.id.frame1);
        frameLayout2 = findViewById(R.id.frame2);
        linearLayout = findViewById(R.id.parent_linear);
        linearLayout.setVisibility(View.INVISIBLE);
        constraintLayout = findViewById(R.id.parent_layout);
       sharedPreferences = getSharedPreferences("preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        card1 = findViewById(R.id.Q1_card);
        card2 = findViewById(R.id.Q2_card);
        card3 = findViewById(R.id.Q3_card);

        click_me = findViewById(R.id.click_me);

        cardViews.add(0,card1);
        cardViews.add(1,card2);
        cardViews.add(2,card3);

        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            constraintLayout.removeAllViews();
            if (counter < 4){
                cardholder = cardViews.get(counter);
                frameLayout2.removeAllViews();
                frameLayout2.addView(cardholder);



            }
            counter++;

            }
        });
















         iq_test_q1_input = findViewById(R.id.iq_test_q1_input);
         iq_test_q2_input = findViewById(R.id.iq_test_q2_input);
         iq_test_q3_input = findViewById(R.id.iq_test_q3_input);
         iq_test_q5_input = findViewById(R.id.iq_test_q5_input);
         iq_test_q9_input = findViewById(R.id.iq_test_q9_input);
         iq_test_q10_input = findViewById(R.id. iq_test_q10_input);
        iq_test_q10_input2 = findViewById(R.id. iq_test_q10_input2);
         iq_test_q13_input =  findViewById(R.id. iq_test_q13_input);
         iq_test_q15_input = findViewById(R.id. iq_test_q15_input);
        iq_test_q15_input2 = findViewById(R.id. iq_test_q15_input2);
         iq_test_q16_input = findViewById(R.id. iq_test_q16_input);
         iq_test_q20_input = findViewById(R.id. iq_test_q20_input);
         iq_test_q22_input = findViewById(R.id. iq_test_q22_input);
         iq_test_q25_input =  findViewById(R.id. iq_test_q25_input);
         iq_test_q26_input1 = findViewById(R.id. iq_test_q26_input);
         iq_test_q26_input2 = findViewById(R.id. iq_test_q26_input2);
         iq_test_q28_input = findViewById(R.id. iq_test_q28_input);
         iq_test_q30_input = findViewById(R.id. iq_test_q30_input);
         iq_test_q31_input = findViewById(R.id. iq_test_q31_input);
         iq_test_q33_input = findViewById(R.id. iq_test_q33_input);
         iq_test_q35_input = findViewById(R.id. iq_test_q35_input);
         iq_test_q36_input = findViewById(R.id. iq_test_q36_input);
         iq_test_q38_input = findViewById(R.id. iq_test_q38_input);
         iq_test_q38_input2 = findViewById(R.id.iq_test_q38_input2);
        iq_test_q38_input3 = findViewById(R.id.iq_test_q38_input3);

         iq_test_q40_input = findViewById(R.id. iq_test_q40_input);


         iq_test_q6_ch1 = findViewById(R.id. iq_test_q6_ch1);
         iq_test_q6_ch2 = findViewById(R.id. iq_test_q6_ch2);
         iq_test_q6_ch3 = findViewById(R.id. iq_test_q6_ch3);
         iq_test_q6_ch4 = findViewById(R.id. iq_test_q6_ch4);
         iq_test_q6_ch5 = findViewById(R.id. iq_test_q6_ch5);
         iq_test_q6_ch6 = findViewById(R.id. iq_test_q6_ch6);

         iq_test_q7_ch1 = findViewById(R.id. iq_test_q7_ch1);
         iq_test_q7_ch2 = findViewById(R.id. iq_test_q7_ch2);
         iq_test_q7_ch3 = findViewById(R.id. iq_test_q7_ch3);
         iq_test_q7_ch4 = findViewById(R.id. iq_test_q7_ch4);
         iq_test_q7_ch5 = findViewById(R.id. iq_test_q7_ch5);
         iq_test_q7_ch6 =  findViewById(R.id. iq_test_q7_ch6);

         iq_test_q11_ch1 = findViewById(R.id. iq_test_q11_ch1);
         iq_test_q11_ch2 = findViewById(R.id. iq_test_q11_ch2);
         iq_test_q11_ch3 = findViewById(R.id. iq_test_q11_ch3);
         iq_test_q11_ch4 = findViewById(R.id. iq_test_q11_ch4);
         iq_test_q11_ch5 =  findViewById(R.id. iq_test_q11_ch5);

         iq_test_q12_ch1 = findViewById(R.id. iq_test_q12_ch1);
         iq_test_q12_ch2 = findViewById(R.id. iq_test_q12_ch2);
         iq_test_q12_ch3 = findViewById(R.id. iq_test_q12_ch3);
         iq_test_q12_ch4 = findViewById(R.id. iq_test_q12_ch4);
         iq_test_q12_ch5 = findViewById(R.id. iq_test_q12_ch5);


         iq_test_q17_ch1 =  findViewById(R.id. iq_test_q17_ch1);
         iq_test_q17_ch2 =  findViewById(R.id. iq_test_q17_ch2);
         iq_test_q17_ch3 =  findViewById(R.id. iq_test_q17_ch3);
         iq_test_q17_ch4 =  findViewById(R.id. iq_test_q17_ch4);
         iq_test_q17_ch5 =  findViewById(R.id. iq_test_q17_ch5);

         iq_test_q19_ch1 = findViewById(R.id. iq_test_q19_ch1);
         iq_test_q19_ch2 = findViewById(R.id. iq_test_q19_ch2);
         iq_test_q19_ch3 = findViewById(R.id. iq_test_q19_ch3);
         iq_test_q19_ch4 = findViewById(R.id. iq_test_q19_ch4);
         iq_test_q19_ch5 = findViewById(R.id. iq_test_q19_ch5);
         iq_test_q19_ch6 = findViewById(R.id. iq_test_q19_ch6);

         iq_test_q23_ch1 = findViewById(R.id. iq_test_q23_ch1);
         iq_test_q23_ch2 = findViewById(R.id. iq_test_q23_ch2);
         iq_test_q23_ch3 = findViewById(R.id. iq_test_q23_ch3);
         iq_test_q23_ch4 = findViewById(R.id. iq_test_q23_ch4);
         iq_test_q23_ch5 = findViewById(R.id. iq_test_q23_ch5);

         iq_test_q39_ch1 = findViewById(R.id. iq_test_q39_ch1);
         iq_test_q39_ch2 = findViewById(R.id. iq_test_q39_ch2);
         iq_test_q39_ch3 = findViewById(R.id. iq_test_q39_ch3);
         iq_test_q39_ch4 = findViewById(R.id. iq_test_q39_ch4);
         iq_test_q39_ch5 = findViewById(R.id. iq_test_q39_ch5);
         iq_test_q39_ch6 = findViewById(R.id. iq_test_q39_ch6);
         iq_test_q39_ch7 = findViewById(R.id. iq_test_q39_ch7);


         iq_test_q4_ch1 = findViewById(R.id.iq_test_q4_ch1);
         iq_test_q4_ch2 = findViewById(R.id.iq_test_q4_ch2);
         iq_test_q4_ch3 = findViewById(R.id.iq_test_q4_ch3);
         iq_test_q4_ch4 = findViewById(R.id.iq_test_q4_ch4);
         iq_test_q4_ch5 = findViewById(R.id.iq_test_q4_ch5);
         iq_test_q4_ch6 = findViewById(R.id.iq_test_q4_ch6);



        correct_answers.add(0,"");
        correct_answers.add(1,"");
        correct_answers.add(2,"");
        correct_answers.add(3,"");
        correct_answers.add(4,"");
        correct_answers.add(5,"");
        correct_answers.add(6,"");
        correct_answers.add(7,"");
        correct_answers.add(8,"");
        correct_answers.add(9,"");
        correct_answers.add(10,"");
        correct_answers.add(11,"");
        correct_answers.add(12,"");
        correct_answers.add(13,"");
        correct_answers.add(14,"");
        correct_answers.add(15,"");
        correct_answers.add(16,"");
        correct_answers.add(17,"");
        correct_answers.add(18,"");
        correct_answers.add(19,"");
        correct_answers.add(20,"");
        correct_answers.add(21,"");
        correct_answers.add(22,"");
        correct_answers.add(23,"");
        correct_answers.add(24,"");
        correct_answers.add(25,"");
        correct_answers.add(26,"");
        correct_answers.add(27,"");
        correct_answers.add(28,"");
        correct_answers.add(29,"");
        correct_answers.add(30,"");
        correct_answers.add(31,"");
        correct_answers.add(32,"");
        correct_answers.add(33,"");
        correct_answers.add(34,"");
        correct_answers.add(35,"");
        correct_answers.add(36,"");
        correct_answers.add(37,"");
        correct_answers.add(38,"");
        correct_answers.add(39,"");



        user_answers.add(0,"");
        user_answers.add(1,"");
        user_answers.add(2,"");
        user_answers.add(3,"");
        user_answers.add(4,"");
        user_answers.add(5,"");
        user_answers.add(6,"");
        user_answers.add(7,"");
        user_answers.add(8,"");
        user_answers.add(9,"");
        user_answers.add(10,"");
        user_answers.add(11,"");
        user_answers.add(12,"");
        user_answers.add(13,"");
        user_answers.add(14,"");
        user_answers.add(15,"");
        user_answers.add(16,"");
        user_answers.add(17,"");
        user_answers.add(18,"");
        user_answers.add(19,"");
        user_answers.add(20,"");
        user_answers.add(21,"");
        user_answers.add(22,"");
        user_answers.add(23,"");
        user_answers.add(24,"");
        user_answers.add(25,"");
        user_answers.add(26,"");
        user_answers.add(27,"");
        user_answers.add(28,"");
        user_answers.add(29,"");
        user_answers.add(30,"");
        user_answers.add(31,"");
        user_answers.add(32,"");
        user_answers.add(33,"");
        user_answers.add(34,"");
        user_answers.add(35,"");
        user_answers.add(36,"");
        user_answers.add(37,"");
        user_answers.add(38,"");
        user_answers.add(39,"");



        correct_answers.set(0,"4");
        correct_answers.set(1,"1412");
        correct_answers.set(2,"38514627");
        correct_answers.set(3,"realistic, impracticable");
        correct_answers.set(4,"4637");
        correct_answers.set(5,"HJKN");
        correct_answers.set(6,"suppress, reserve");
        correct_answers.set(7,"D");
        correct_answers.set(8,"ENCYCLOPEDIA");
        correct_answers.set(9,"88, 55");
        correct_answers.set(10,"accessory");
        correct_answers.set(11,"fabulous");
        correct_answers.set(12,"6");
        correct_answers.set(13,"A");
        correct_answers.set(14,"donate, give");
        correct_answers.set(15,"910");
        correct_answers.set(16,"augment");
        correct_answers.set(17,"D");
        correct_answers.set(18,"literal, verbatim");
        correct_answers.set(19,"11");
        correct_answers.set(20,"B");
        correct_answers.set(21,"E");
        correct_answers.set(22,"accustomed");
        correct_answers.set(23,"C");
        correct_answers.set(24,"51");
        correct_answers.set(25,"crave, dislike");
        correct_answers.set(26,"A");
        correct_answers.set(27,"76");
        correct_answers.set(28,"F");
        correct_answers.set(29,"5");
        correct_answers.set(30,"C");
        correct_answers.set(31,"B");
        correct_answers.set(32,"6.5");
        correct_answers.set(33,"E");
        correct_answers.set(34,"nocturnal");
        correct_answers.set(35,"91");
        correct_answers.set(36,"A");
        correct_answers.set(37,"36, 24, 16");
        correct_answers.set(38,"D");
        correct_answers.set(39,"28");




         score = findViewById(R.id.score);


         //Buttons

         iq_test_q1_button = findViewById(R.id.iq_test_q1_button);
         iq_test_q2_button = findViewById(R.id.iq_test_q2_button);
         iq_test_q3_button = findViewById(R.id.iq_test_q3_button);
         iq_test_q5_button = findViewById(R.id.iq_test_q5_button);
         iq_test_q9_button = findViewById(R.id.iq_test_q9_button);
         iq_test_q10_button = findViewById(R.id.iq_test_q10_button);
         iq_test_q13_button = findViewById(R.id.iq_test_q13_button);
         iq_test_q15_button = findViewById(R.id.iq_test_q15_button);
        iq_test_q16_button = findViewById(R.id.iq_test_q16_button);
        iq_test_q20_button = findViewById(R.id.iq_test_q20_button);
        iq_test_q22_button = findViewById(R.id.iq_test_q22_button);
        iq_test_q25_button = findViewById(R.id.iq_test_q25_button);
        iq_test_q26_button = findViewById(R.id.iq_test_q26_button);
        iq_test_q28_button = findViewById(R.id.iq_test_q28_button);
        iq_test_q30_button = findViewById(R.id.iq_test_q30_button);
        iq_test_q31_button = findViewById(R.id.iq_test_q31_button);
        iq_test_q33_button = findViewById(R.id.iq_test_q33_button);
        iq_test_q35_button = findViewById(R.id.iq_test_q35_button);
        iq_test_q36_button = findViewById(R.id.iq_test_q36_button);
        iq_test_q38_button = findViewById(R.id.iq_test_q38_button);
        iq_test_q40_button = findViewById(R.id.iq_test_q40_button);



        //Image Buttons

         iq_test_q8_ch1 = findViewById(R.id.iq_test_q8_ch1);
         iq_test_q8_ch2 = findViewById(R.id.iq_test_q8_ch2);
         iq_test_q8_ch3 = findViewById(R.id.iq_test_q8_ch3);
         iq_test_q8_ch4 = findViewById(R.id.iq_test_q8_ch4);

         iq_test_q14_ch1 = findViewById(R.id.iq_test_q14_ch1);
         iq_test_q14_ch2 = findViewById(R.id.iq_test_q14_ch2);
         iq_test_q14_ch3 = findViewById(R.id.iq_test_q14_ch3);
         iq_test_q14_ch4 = findViewById(R.id.iq_test_q14_ch4);
         iq_test_q14_ch5 = findViewById(R.id.iq_test_q14_ch5);

         iq_test_q18_ch1 = findViewById(R.id.iq_test_q18_ch1);
         iq_test_q18_ch2 = findViewById(R.id.iq_test_q18_ch2);
         iq_test_q18_ch3 = findViewById(R.id.iq_test_q18_ch3);
         iq_test_q18_ch4 = findViewById(R.id.iq_test_q18_ch4);
         iq_test_q18_ch5 = findViewById(R.id.iq_test_q18_ch5);

         iq_test_q21_ch1 = findViewById(R.id.iq_test_q21_ch1);
         iq_test_q21_ch2 = findViewById(R.id.iq_test_q21_ch2);
         iq_test_q21_ch3 = findViewById(R.id.iq_test_q21_ch3);
         iq_test_q21_ch4 = findViewById(R.id.iq_test_q21_ch4);
         iq_test_q21_ch5 = findViewById(R.id.iq_test_q21_ch5);
         iq_test_q21_ch6 = findViewById(R.id.iq_test_q21_ch6);

         iq_test_q24_ch1 = findViewById(R.id.iq_test_q24_ch1);
         iq_test_q24_ch2 = findViewById(R.id.iq_test_q24_ch2);
         iq_test_q24_ch3 = findViewById(R.id.iq_test_q24_ch3);
         iq_test_q24_ch4 = findViewById(R.id.iq_test_q24_ch4);
         iq_test_q24_ch5 = findViewById(R.id.iq_test_q24_ch5);
         iq_test_q24_ch6 = findViewById(R.id.iq_test_q24_ch6);

         iq_test_q27_ch1 = findViewById(R.id.iq_test_q27_ch1);
        iq_test_q27_ch2 = findViewById(R.id.iq_test_q27_ch2);
        iq_test_q27_ch3 = findViewById(R.id.iq_test_q27_ch3);
        iq_test_q27_ch4 = findViewById(R.id.iq_test_q27_ch4);
        iq_test_q27_ch5 = findViewById(R.id.iq_test_q27_ch5);

        iq_test_q29_ch1 = findViewById(R.id.iq_test_q29_ch1);
        iq_test_q29_ch2 = findViewById(R.id.iq_test_q29_ch2);
        iq_test_q29_ch3 = findViewById(R.id.iq_test_q29_ch3);
        iq_test_q29_ch4 = findViewById(R.id.iq_test_q29_ch4);
        iq_test_q29_ch5 = findViewById(R.id.iq_test_q29_ch5);
        iq_test_q29_ch6 = findViewById(R.id.iq_test_q29_ch6);

        iq_test_q32_ch1 = findViewById(R.id.iq_test_q32_ch1);
        iq_test_q32_ch2 = findViewById(R.id.iq_test_q32_ch2);
        iq_test_q32_ch3 = findViewById(R.id.iq_test_q32_ch3);
        iq_test_q32_ch4 = findViewById(R.id.iq_test_q32_ch4);
        iq_test_q32_ch5 = findViewById(R.id.iq_test_q32_ch5);

        iq_test_q34_ch1 = findViewById(R.id.iq_test_q34_ch1);
        iq_test_q34_ch2 = findViewById(R.id.iq_test_q34_ch2);
        iq_test_q34_ch3 = findViewById(R.id.iq_test_q34_ch3);
        iq_test_q34_ch4 = findViewById(R.id.iq_test_q34_ch4);
        iq_test_q34_ch5 = findViewById(R.id.iq_test_q34_ch5);
        iq_test_q34_ch6 = findViewById(R.id.iq_test_q34_ch6);

        iq_test_q37_ch1 = findViewById(R.id.iq_test_q37_ch1);
        iq_test_q37_ch2 = findViewById(R.id.iq_test_q37_ch2);
        iq_test_q37_ch3 = findViewById(R.id.iq_test_q37_ch3);
        iq_test_q37_ch4 = findViewById(R.id.iq_test_q37_ch4);
        iq_test_q37_ch5 = findViewById(R.id.iq_test_q37_ch5);









         show_score = findViewById(R.id.show_score);

         iq_test_q1_button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                answer_holder = String.valueOf(iq_test_q1_input.getText());
                user_answers.set(0,answer_holder);
             }
         });

         iq_test_q2_button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 answer_holder2 = String.valueOf(iq_test_q2_input.getText());
                 user_answers.set(1,answer_holder2);

             }
         });

        iq_test_q3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            answer_holder3 = String.valueOf(iq_test_q3_input.getText());
            user_answers.set(2,answer_holder3);

            }
        });

        iq_test_q5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer_holder5 = String.valueOf(iq_test_q5_input.getText());
                user_answers.set(4,answer_holder5);

            }
        });

        iq_test_q8_ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer_holder8 = "D";
                user_answers.set(7,answer_holder8);


            }
        });

        iq_test_q9_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer_holder9 = String.valueOf(iq_test_q9_input.getText());
                user_answers.set(8,answer_holder9);


            }
        });

        iq_test_q10_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     q10_ans1 ="88";
                     q10_ans2 = "55";
                if (String.valueOf(iq_test_q10_input.getText()).equals(q10_ans1) && String.valueOf(iq_test_q10_input2.getText()).equals(q10_ans2)){
                    answer_holder10 = "88, 55";
                    user_answers.set(9,answer_holder10);
                }


            }
        });

        iq_test_q13_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer_holder13 = String.valueOf(iq_test_q13_input.getText());
                user_answers.set(12,answer_holder13);

            }
        });

        iq_test_q14_ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer_holder14 = "A";
                user_answers.set(13,answer_holder14);

            }
        });


        iq_test_q15_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                q15_ans1 = "donate";
                q15_ans2 = "give";

                if (iq_test_q15_input.getText().toString().equals(q15_ans1) && iq_test_q15_input2.getText().toString().equals(q15_ans2)){
                    answer_holder15 = "donate, give";
                    user_answers.set(14,answer_holder15);
                }

            }
        });

        iq_test_q16_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer_holder16 = String.valueOf(iq_test_q16_input.getText());
                user_answers.set(15,answer_holder16);

            }
        });

        iq_test_q18_ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder18 = "D";
                user_answers.set(17,answer_holder18);
            }
        });

        iq_test_q20_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               answer_holder20 = iq_test_q20_input.getText().toString();
               user_answers.set(19,answer_holder20);
            }
        });
        iq_test_q21_ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder21 = "B";
                user_answers.set(20,answer_holder21);
            }
        });

        iq_test_q22_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder22 = iq_test_q22_input.getText().toString().toUpperCase();
                user_answers.set(21,answer_holder22);
            }
        });

        iq_test_q24_ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder24 = "C";
                user_answers.set(24,answer_holder24);
            }
        });

        iq_test_q25_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder25 = iq_test_q25_input.getText().toString();
                user_answers.set(24,answer_holder25);
            }
        });

        iq_test_q26_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q26_ans1 = "crave";
                q26_ans2 = "dislike";

                if (iq_test_q26_input1.getText().toString().equals(q26_ans1) && iq_test_q26_input2.getText().toString().equals(q26_ans2)){
                    answer_holder26 = "crave, dislike";
                    user_answers.set(25,answer_holder26);
                }
            }
        });

        iq_test_q27_ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder27 = "A";
                user_answers.set(26,answer_holder27);
            }
        });

        iq_test_q28_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder28 = iq_test_q28_input.getText().toString();
                user_answers.set(27,answer_holder28);
            }
        });

        iq_test_q29_ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder29 = "F";
                user_answers.set(28,answer_holder29);
            }
        });

        iq_test_q30_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder30 = iq_test_q30_input.getText().toString();
                user_answers.set(29,answer_holder30);
            }
        });

        iq_test_q31_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder31 = iq_test_q31_input.getText().toString().toUpperCase();
                user_answers.set(30,answer_holder31);
            }
        });

        iq_test_q32_ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder32 = "B";
                user_answers.set(31,answer_holder32);
            }
        });

        iq_test_q33_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_holder33 = iq_test_q33_input.getText().toString();
                user_answers.set(32,answer_holder33);
            }
        });

       iq_test_q34_ch5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               answer_holder34 = "E";
               user_answers.set(33,answer_holder34);
           }
       });
       iq_test_q35_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               answer_holder35 = iq_test_q35_input.getText().toString();
               user_answers.set(34,answer_holder35);
           }
       });

       iq_test_q36_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               answer_holder36 = iq_test_q36_input.getText().toString();
               user_answers.set(35,answer_holder36);
           }
       });

       iq_test_q37_ch1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               answer_holder37 = "A";
               user_answers.set(36,answer_holder37);
           }
       });

       iq_test_q38_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               q38_ans1 = "36";
               q38_ans2 = "24";
               q38_ans3 = "16";
               if (iq_test_q38_input.getText().toString().equals(q38_ans1) && iq_test_q38_input2.getText().toString().equals(q38_ans2)
                       && iq_test_q38_input3.getText().toString().equals(q38_ans3)
               ) {

                   answer_holder38 = "36, 24, 16";
                   user_answers.set(37,answer_holder38);
               }
           }
       });

       iq_test_q40_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               answer_holder40 = String.valueOf(iq_test_q40_input.getText());
               user_answers.set(39,answer_holder40);
           }
       });












         show_score.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 user_answers.retainAll(correct_answers);
                 score_number = String.valueOf(user_answers.size());

                 score.setText(score_number);



             }
         });











    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("x",scroll_position_x);
        outState.putInt("y",scroll_position_y);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        sharedPreferences = getSharedPreferences("preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("x",scrollView.getScrollX());
        editor.putInt("y",scrollView.getScrollY());
        editor.commit();



    }

    public void show(){
        android.app.AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Resume")
                .setMessage("Do you want to continue your previous unfinished test?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        scrollView.scrollTo(sharedPreferences.getInt("x",0),sharedPreferences.getInt("y",0));


                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        scrollView.scrollTo(0,0);


                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();



    }




    @Override
    protected void onStart() {
        super.onStart();
        show();
    }

    public  void checkForQuestion4(View v){
        if (iq_test_q4_ch2.isChecked() && iq_test_q4_ch4.isChecked()){

            answer_holder4 = "realistic, impracticable";

          user_answers.set(3,answer_holder4);


        }
    }

    public  void checkForQuestion6(View v){

        if (iq_test_q6_ch2.isChecked()){

            answer_holder6 = "HJKN";
            user_answers.set(5,answer_holder6);

        }

    }

    public  void checkQuestion7(View v){
        if (iq_test_q7_ch1.isChecked() && iq_test_q7_ch5.isChecked()){

            answer_holder7 = "suppress, reserve";
            user_answers.set(6,answer_holder7);


        }

    }

    public  void checkQuestion11(View v){
        if (iq_test_q11_ch3.isChecked()){

            answer_holder11 = "accessory";
            user_answers.set(10,answer_holder11);
        }
    }

    public  void checkQuestion12(View v){
        if (iq_test_q12_ch4.isChecked()){

            answer_holder12 = "fabulous";
            user_answers.set(11,answer_holder12);
        }
    }

    public  void checkQuestion17(View v){

        if (iq_test_q17_ch1.isChecked()){
            answer_holder17 = "augment";
            user_answers.set(16,answer_holder17);
        }

    }

    public void checkForQuestion19(View v){

        if (iq_test_q19_ch3.isChecked() && iq_test_q19_ch6.isChecked()){
            answer_holder19 = "literal, verbatim";
            user_answers.set(18,answer_holder19);
        }
    }

    public void checkForQuestion23(View v){

        if (iq_test_q23_ch2.isChecked()){
            answer_holder23 = "accustomed";
            user_answers.set(22,answer_holder23);
        }
    }

    public void checkForQuestion39(View v){

        if (iq_test_q39_ch4.isChecked()){
            answer_holder39 = "D";
            user_answers.set(38,answer_holder39);
        }
    }



}
