package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Intelligence extends AppCompatActivity  {


    ArrayList <String> correct_answers = new ArrayList<>();
    ArrayList <String> user_answers = new ArrayList<>();

    StringBuilder sb = new StringBuilder();
    String answer_holder;
    String answer_1;
    String answer_2;
    String score_number;

    FloatingActionButton next_question;
    Button show_score;
    TextView question_num;
    TextView score_view;
    List<Integer> imageViewList = new ArrayList<Integer>();
    LinearLayout linearLayout;
    LinearLayout image_container;
    LinearLayout question_container;
    Context context;
    int counter = 0;


    CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intelligence);



        cardView = findViewById(R.id.materialCardView);





        next_question = findViewById(R.id.next_question_button);
        show_score = findViewById(R.id.show_score_button);

            question_num = findViewById(R.id.question_number);
            score_view = findViewById(R.id.score_view);



        linearLayout = findViewById(R.id.blanket_linear_layout);
        image_container = findViewById(R.id.image_container);
        question_container = findViewById(R.id.question_container);

       // imageViewList.add(0,R.drawable.iq_q1);
        imageViewList.add(0,null);
        imageViewList.add(1,R.drawable.question_1);
        imageViewList.add(2,R.drawable.question_2);
        imageViewList.add(3,R.drawable.question_3png);
        imageViewList.add(4,R.drawable.question_4);
        imageViewList.add(5,R.drawable.question_5);
        imageViewList.add(6,R.drawable.question_6);
        imageViewList.add(7,R.drawable.question_7);
        imageViewList.add(8,R.drawable.question_8);
        imageViewList.add(9,R.drawable.question_9);
        imageViewList.add(10,R.drawable.question_10);
        imageViewList.add(11,R.drawable.question_11);
        imageViewList.add(12,R.drawable.question_12);
        imageViewList.add(13,R.drawable.question_13);
        imageViewList.add(14,R.drawable.question_14);
        imageViewList.add(15,R.drawable.question_15);
        imageViewList.add(16,R.drawable.question_16);
        imageViewList.add(17,R.drawable.question_17);
        imageViewList.add(18,R.drawable.question_18);
        imageViewList.add(19,R.drawable.question_19);
        imageViewList.add(20,R.drawable.question_20);
        imageViewList.add(21,R.drawable.question_21);
        imageViewList.add(22,R.drawable.question_22);
        imageViewList.add(23,R.drawable.question_23);
        imageViewList.add(24,R.drawable.question_24);
        imageViewList.add(25,R.drawable.question_25);
        imageViewList.add(26,R.drawable.question_26);
        imageViewList.add(27,R.drawable.question_27);
        imageViewList.add(28,R.drawable.question_28);
        imageViewList.add(29,R.drawable.question_29);
        imageViewList.add(30,R.drawable.question_30);
        imageViewList.add(31,R.drawable.question_31);
        imageViewList.add(32,R.drawable.question_32);
        imageViewList.add(33,R.drawable.question_33);
        imageViewList.add(34,R.drawable.question_34);
        imageViewList.add(35,R.drawable.question_35);
        imageViewList.add(36,R.drawable.question_36);
        imageViewList.add(37,R.drawable.question_37);
        imageViewList.add(38,R.drawable.question_38);
        imageViewList.add(39,R.drawable.question_39);
        imageViewList.add(40,R.drawable.question_40);


        context = getApplicationContext();

        final ImageView imageView_questions = new ImageView(context);
        imageView_questions.setScaleType(ImageView.ScaleType.FIT_CENTER);








        final TextView question_1 = new TextView(context);

        question_1.setTextAppearance(this,R.style.font_style);

        final TextView question_2 = new TextView(context);

        question_2.setTextAppearance(this,R.style.font_style);

        final EditText question_1_input =  new EditText(context);
        question_1_input.setWidth(150);
        question_1_input.setHeight(150);
        question_1_input.setHint("enter your answer");
        question_1_input.setGravity(50);

        final EditText question_2_input =  new EditText(context);
        question_2_input.setWidth(150);
        question_2_input.setHeight(150);
        question_2_input.setHint("enter your answer");
        question_2_input.setGravity(50);

        final EditText question_3_input =  new EditText(context);
        question_3_input.setWidth(150);
        question_3_input.setHeight(150);
        question_3_input.setHint("enter your answer");
        question_3_input.setGravity(50);



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






        next_question.setOnClickListener(new View.OnClickListener() {
           
            @Override
            public void onClick(View v) {

                counter++;
                question_num.setText("question  "+String.valueOf(counter));



                if (counter == 1){
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);
                    final   Button q1_button = new Button(context);
                    q1_button.setText("enter");
                    q1_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();

                            user_answers.set(0,answer_holder);
                            Toast.makeText(getApplicationContext(), user_answers.get(0),Toast.LENGTH_SHORT).show();
                        }
                    });

                    question_1.setText(R.string.iq_test_Q1);

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    question_container.addView(question_1);
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q1_button);

                }
                else if (counter == 2){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    final   Button q2_button = new Button(context);
                    q2_button.setText("enter");
                    q2_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();

                            user_answers.set(1,answer_holder);
                            Toast.makeText(getApplicationContext(), user_answers.get(1),Toast.LENGTH_SHORT).show();
                        }
                    });
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    question_container.removeAllViews();
                    image_container.removeAllViews();

                    question_container.addView(question_1_input);
                    image_container.addView(imageView_questions);

                    question_container.addView(q2_button);



                }

                else if (counter == 3){

                    question_1_input.setText("");
                    final   Button q3_button = new Button(context);
                    q3_button.setText("enter");
                    q3_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();

                            user_answers.set(2,answer_holder);
                            Toast.makeText(getApplicationContext(),user_answers.get(0).toString(),Toast.LENGTH_SHORT).show();
                        }
                    });

                    question_container.removeAllViews();
                    image_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q3_button);

                }

                else if(counter == 4){

                    RadioGroup q4_RG = new RadioGroup(context);


                    CheckBox q4_ch1 = new CheckBox(context);
                    q4_ch1.setText(R.string.iq_test_Q4_CH1);
                    q4_ch1.setId(R.id.Q4_ch1);

                    final CheckBox q4_ch2 = new CheckBox(context);
                    q4_ch2.setText(R.string.iq_test_Q4_CH2);
                    q4_ch2.setId(R.id.Q4_ch2);

                    CheckBox q4_ch3 = new CheckBox(context);
                    q4_ch3.setText(R.string.iq_test_Q4_CH3);
                    q4_ch3.setId(R.id.Q4_ch3);

                    CheckBox q4_ch4 = new CheckBox(context);
                    q4_ch4.setText(R.string.iq_test_Q4_CH4);
                    q4_ch4.setId(R.id.Q4_ch4);

                    CheckBox q4_ch5 = new CheckBox(context);
                    q4_ch5.setText(R.string.iq_test_Q4_CH5);
                    q4_ch5.setId(R.id.Q4_ch5);

                    CheckBox q4_ch6 = new CheckBox(context);
                    q4_ch6.setText(R.string.iq_test_Q4_CH6);
                    q4_ch6.setId(R.id.Q4_ch6);

                    q4_RG.addView(q4_ch1,0);
                    q4_RG.addView(q4_ch2,1);
                    q4_RG.addView(q4_ch3,2);
                    q4_RG.addView(q4_ch4,3);
                    q4_RG.addView(q4_ch5,4);
                    q4_RG.addView(q4_ch6,5);


                 q4_ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                     @Override
                     public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                         if (q4_ch2.isChecked()){
                             answer_1 = "realistic";
                         }
                     }
                 });

                 q4_ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                     @Override
                     public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                         answer_2 = ", impracticable";
                         answer_holder = answer_1 + answer_2;
                         user_answers.set(3,answer_holder);
                     }
                 });


                    question_container.removeAllViews();
                    image_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q4_RG);






                }

                else if (counter == 5){
                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);


                    final   Button q5_button = new Button(context);
                    q5_button.setText("enter");
                    q5_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();

                            user_answers.set(4,answer_holder);
                            Toast.makeText(getApplicationContext(), user_answers.get(4),Toast.LENGTH_SHORT).show();
                        }
                    });

                    question_container.removeAllViews();
                    image_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q5_button);
                }

                else if (counter == 6){

                    RadioGroup q6_RG = new RadioGroup(context);

                    RadioButton q6_ch1 = new RadioButton(context);
                    q6_ch1.setText(R.string.iq_test_Q6_CH_1);
                    q6_ch1.setId(R.id.Q6_ch1);

                    final RadioButton q6_ch2 = new RadioButton(context);
                    q6_ch2.setText(R.string.iq_test_Q6_CH_2);
                    q6_ch2.setId(R.id.Q6_ch2);

                    RadioButton q6_ch3 = new RadioButton(context);
                    q6_ch3.setText(R.string.iq_test_Q6_CH_3);
                    q6_ch3.setId(R.id.Q6_ch3);

                    RadioButton q6_ch4 = new RadioButton(context);
                    q6_ch4.setText(R.string.iq_test_Q6_CH_4);
                    q6_ch4.setId(R.id.Q6_ch4);

                    RadioButton q6_ch5 = new RadioButton(context);
                    q6_ch5.setText(R.string.iq_test_Q6_CH_5);
                    q6_ch5.setId(R.id.Q6_ch5);

                    RadioButton q6_ch6 = new RadioButton(context);
                    q6_ch6.setText(R.string.iq_test_Q6_CH_6);
                    q6_ch6.setId(R.id.Q6_ch6);

                    q6_RG.addView(q6_ch1,0);
                    q6_RG.addView(q6_ch2,1);
                    q6_RG.addView(q6_ch3,2);
                    q6_RG.addView(q6_ch4,3);
                    q6_RG.addView(q6_ch5,4);
                    q6_RG.addView(q6_ch6,5);

                    question_container.removeAllViews();
                    image_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q6_RG);

                    q6_RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            if (checkedId == R.id.Q6_ch2 ){

                                answer_holder = "HJKN";
                                user_answers.set(5,answer_holder);
                            }
                        }
                    });





                }

                else if (counter == 7){

                    question_1.setText(R.string.iq_test_Q7_additional1);
                    question_2.setText(R.string.iq_test_Q7_additional2);

                    RadioGroup q7_RG1 = new RadioGroup(context);
                    RadioGroup q7_RG2 = new RadioGroup(context);

                    final RadioButton q7_ch1 = new RadioButton(context);
                    q7_ch1.setText(R.string.iq_test_Q7_part1_CH1);
                    q7_ch1.setId(R.id.Q7_ch1);

                    RadioButton q7_ch2 = new RadioButton(context);
                    q7_ch2.setText(R.string.iq_test_Q7_part1_CH2);
                    q7_ch2.setId(R.id.Q7_ch2);

                    RadioButton q7_ch3 = new RadioButton(context);
                    q7_ch3.setText(R.string.iq_test_Q7_part1_CH3);
                    q7_ch3.setId(R.id.Q7_ch3);

                    RadioButton q7_ch4 = new RadioButton(context);
                    q7_ch4.setText(R.string.iq_test_Q7_part2_CH1);
                    q7_ch4.setId(R.id.Q7_ch4);

                    final RadioButton q7_ch5 = new RadioButton(context);
                    q7_ch5.setText(R.string.iq_test_Q7_part2_CH2);
                    q7_ch5.setId(R.id.Q7_ch5);

                    RadioButton q7_ch6 = new RadioButton(context);
                    q7_ch6.setText(R.string.iq_test_Q7_part2_CH3);
                    q7_ch6.setId(R.id.Q7_ch6);

                    q7_RG1.addView(q7_ch1,0);
                    q7_RG1.addView(q7_ch2,1);
                    q7_RG1.addView(q7_ch3,2);
                    q7_RG2.addView(q7_ch4,0);
                    q7_RG2.addView(q7_ch5,1);
                    q7_RG2.addView(q7_ch6,2);

                    q7_ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if (q7_ch1.isChecked()){
                                answer_1 = "suppress";
                            }
                        }
                    });

                    q7_ch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q7_ch5.isChecked()){
                                answer_2 = ", reserve";
                                answer_holder = answer_1 + answer_2;
                                user_answers.set(6,answer_holder);
                            }
                        }
                    });

                    question_container.removeAllViews();
                    image_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1);
                    question_container.addView(q7_RG1);
                    question_container.addView(question_2);
                    question_container.addView(q7_RG2);










                }

                else if (counter == 8){



                    RadioGroup q8_RG = new RadioGroup(context);

                    RadioButton q8_ch1 = new RadioButton(context);
                    q8_ch1.setText("A");
                    q8_ch1.setId(R.id.Q8_ch1);

                    RadioButton q8_ch2 = new RadioButton(context);
                    q8_ch2.setText("B");
                    q8_ch2.setId(R.id.Q8_ch2);

                    RadioButton q8_ch3 = new RadioButton(context);
                    q8_ch3.setText("C");
                    q8_ch3.setId(R.id.Q8_ch3);

                    RadioButton q8_ch4 = new RadioButton(context);
                    q8_ch4.setText("D");
                    q8_ch4.setId(R.id.Q8_ch4);



                    q8_RG.addView(q8_ch1,0);
                    q8_RG.addView(q8_ch2,1);
                    q8_RG.addView(q8_ch3,2);
                    q8_RG.addView(q8_ch4,3);

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q8_RG);



                    q8_ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            answer_holder = "D";
                            user_answers.set(7,answer_holder);
                        }
                    });





                }

                else if (counter == 9){
                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_TEXT);

                    final   Button q9_button = new Button(context);
                    q9_button.setText("enter");
                    q9_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString().toUpperCase();



                            user_answers.set(8,answer_holder);

                            Toast.makeText(getApplicationContext(),user_answers.get(8),Toast.LENGTH_SHORT).show();
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q9_button);

                }

                else if (counter == 10){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);
                    question_2_input.setInputType(InputType.TYPE_CLASS_NUMBER);




                    final   Button q10_button = new Button(context);
                    q10_button.setText("enter");
                    q10_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if (question_1_input.getText().toString().equals("88") && question_2_input.getText().toString().equals("55")){

                                answer_holder = "88, 55";
                                user_answers.set(9,answer_holder);
                                Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();

                            }


                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(question_2_input);
                    question_container.addView(q10_button);


                }

                else if (counter == 11){

                    RadioGroup q11_RG = new RadioGroup(context);
                    RadioButton q11_ch1 = new RadioButton(context);
                    q11_ch1.setText(R.string.iq_test_Q_11_CH1);
                    q11_ch1.setId(R.id.Q11_ch1);

                    RadioButton q11_ch2 = new RadioButton(context);
                    q11_ch2.setText(R.string.iq_test_Q_11_CH2);
                    q11_ch2.setId(R.id.Q11_ch2);

                    RadioButton q11_ch3 = new RadioButton(context);
                    q11_ch3.setText(R.string.iq_test_Q_11_CH3);
                    q11_ch3.setId(R.id.Q11_ch3);

                    RadioButton q11_ch4 = new RadioButton(context);
                    q11_ch4.setText(R.string.iq_test_Q_11_CH4);
                    q11_ch4.setId(R.id.Q11_ch4);

                    RadioButton q11_ch5 = new RadioButton(context);
                    q11_ch5.setText(R.string.iq_test_Q_11_CH5);
                    q11_ch5.setId(R.id.Q11_ch5);

                    q11_RG.addView(q11_ch1,0);
                    q11_RG.addView(q11_ch2,1);
                    q11_RG.addView(q11_ch3,2);
                    q11_RG.addView(q11_ch4,3);
                    q11_RG.addView(q11_ch5,4);
                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q11_RG);



                    q11_ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            answer_holder = "accessory";
                            user_answers.set(10,answer_holder);
                        }
                    });


                }

                else if (counter ==12){

                    RadioGroup q12_RG = new RadioGroup(context);
                    RadioButton q12_ch1 = new RadioButton(context);
                    q12_ch1.setText(R.string.iq_test_Q_12_CH1);
                    q12_ch1.setId(R.id.Q12_ch1);

                    RadioButton q12_ch2 = new RadioButton(context);
                    q12_ch2.setText(R.string.iq_test_Q_12_CH2);
                    q12_ch2.setId(R.id.Q12_ch2);

                    RadioButton q12_ch3 = new RadioButton(context);
                    q12_ch3.setText(R.string.iq_test_Q_12_CH3);
                    q12_ch3.setId(R.id.Q12_ch3);

                    final RadioButton q12_ch4 = new RadioButton(context);
                    q12_ch4.setText(R.string.iq_test_Q_12_CH4);
                    q12_ch4.setId(R.id.Q12_ch4);

                    RadioButton q12_ch5= new RadioButton(context);
                    q12_ch5.setText(R.string.iq_test_Q_12_CH5);
                    q12_ch5.setId(R.id.Q12_ch5);

                    q12_RG.addView(q12_ch1);
                    q12_RG.addView(q12_ch2);
                    q12_RG.addView(q12_ch3);
                    q12_RG.addView(q12_ch4);
                    q12_RG.addView(q12_ch5);

                    q12_ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q12_ch4.isChecked()){

                                answer_holder = "fabulous";
                                user_answers.set(11,answer_holder);
                            }
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q12_RG);




                }

                else if (counter == 13){
                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    final   Button q13_button = new Button(context);
                    q13_button.setText("enter");
                    q13_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString().toUpperCase();



                            user_answers.set(12,answer_holder);
//
                            Toast.makeText(getApplicationContext(),user_answers.get(12),Toast.LENGTH_SHORT).show();
                        }
                    });




                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q13_button);
                }

                else if (counter ==14){

                    RadioGroup q14_RG = new RadioGroup(context);

                    final RadioButton q14_ch1 = new RadioButton(context);
                    q14_ch1.setText("A");
                    q14_ch1.setId(R.id.Q14_ch1);

                    RadioButton q14_ch2 = new RadioButton(context);
                    q14_ch2.setText("B");
                    q14_ch2.setId(R.id.Q14_ch2);

                    RadioButton q14_ch3 = new RadioButton(context);
                    q14_ch3.setText("C");
                    q14_ch3.setId(R.id.Q14_ch3);

                    RadioButton q14_ch4 = new RadioButton(context);
                    q14_ch4.setText("D");
                    q14_ch4.setId(R.id.Q14_ch4);

                    RadioButton q14_ch5 = new RadioButton(context);
                    q14_ch5.setText("E");
                    q14_ch5.setId(R.id.Q14_ch5);


                    q14_RG.addView(q14_ch1,0);
                    q14_RG.addView(q14_ch2,1);
                    q14_RG.addView(q14_ch3,2);
                    q14_RG.addView(q14_ch4,3);
                    q14_RG.addView(q14_ch5,4);



                    q14_ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                           if (q14_ch1.isChecked()){
                               answer_holder = "A";
                               user_answers.set(13,answer_holder);
                           }
                        }
                    });




                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q14_RG);



                }

                else if (counter ==15){


                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_TEXT);

                    question_2_input.setText("");
                    question_2_input.setInputType(InputType.TYPE_CLASS_TEXT)
                    ;
                    final Button q15_button = new Button(context);
                    q15_button.setText("Enter");
                    q15_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if (question_1_input.getText().toString().toLowerCase().equals("donate") && question_2_input.getText().toString().toLowerCase().equals("give")){

                                answer_holder = "donate, give";
                                user_answers.set(14,answer_holder);
                            }
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(question_2_input);
                    question_container.addView(q15_button);
                }

                else if (counter == 16){

                    question_1.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    final Button q16_button = new Button(context);
                    q16_button.setText("Enter");
                    q16_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                           if (question_1_input.getText().toString().equals("910")){

                               answer_holder = "910";
                               user_answers.set(15,answer_holder);
                           }
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q16_button);

                }

                else if (counter == 17){

                    RadioGroup q17_RG = new RadioGroup(context);

                    final RadioButton q17_ch1 = new RadioButton(context);
                    q17_ch1.setText(R.string.iq_test_Q_17_CH1);

                    RadioButton q17_ch2 = new RadioButton(context);
                    q17_ch2.setText(R.string.iq_test_Q_17_CH2);

                    RadioButton q17_ch3 = new RadioButton(context);
                    q17_ch3.setText(R.string.iq_test_Q_17_CH3);

                    RadioButton q17_ch4 = new RadioButton(context);
                    q17_ch4.setText(R.string.iq_test_Q_17_CH4);

                    RadioButton q17_ch5 = new RadioButton(context);
                    q17_ch5.setText(R.string.iq_test_Q_17_CH5);

                    q17_RG.addView(q17_ch1);
                    q17_RG.addView(q17_ch2);
                    q17_RG.addView(q17_ch3);
                    q17_RG.addView(q17_ch4);
                    q17_RG.addView(q17_ch5);

                    q17_ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q17_ch1.isChecked()){

                                answer_holder = "augment";
                                user_answers.set(16,answer_holder);
                            }
                        }
                    });



                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q17_RG);
                }

                else if (counter == 18){

                    RadioGroup q18_RG = new RadioGroup(context);

                    RadioButton q18_ch1 = new RadioButton(context);
                    q18_ch1.setText("A");

                    RadioButton q18_ch2 = new RadioButton(context);
                    q18_ch2.setText("B");

                    RadioButton q18_ch3 = new RadioButton(context);
                    q18_ch3.setText("C");

                    final RadioButton q18_ch4 = new RadioButton(context);
                    q18_ch4.setText("D");

                    RadioButton q18_ch5 = new RadioButton(context);
                    q18_ch5.setText("E");

                    q18_RG.addView(q18_ch1);
                    q18_RG.addView(q18_ch2);
                    q18_RG.addView(q18_ch3);
                    q18_RG.addView(q18_ch4);
                    q18_RG.addView(q18_ch5);

                    q18_ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q18_ch4.isChecked()){

                                answer_holder = "D";
                                user_answers.set(17,answer_holder);

                            }
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    image_container.addView(imageView_questions);
                    question_container.addView(q18_RG);

                }

                else if (counter == 19){

                    CheckBox q19_ch1 = new CheckBox(context);
                    q19_ch1.setText(R.string.iq_test_Q_19_CH1);

                    CheckBox q19_ch2 = new CheckBox(context);
                    q19_ch2.setText(R.string.iq_test_Q_19_CH2);

                    final CheckBox q19_ch3 = new CheckBox(context);
                    q19_ch3.setText(R.string.iq_test_Q_19_CH3);

                    CheckBox q19_ch4 = new CheckBox(context);
                    q19_ch4.setText(R.string.iq_test_Q_19_CH4);

                    CheckBox q19_ch5 = new CheckBox(context);
                    q19_ch5.setText(R.string.iq_test_Q_19_CH5);

                    final CheckBox q19_ch6 = new CheckBox(context);
                    q19_ch6.setText(R.string.iq_test_Q_19_CH6);

                    q19_ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if (q19_ch3.isChecked()){

                                answer_1 = "literal";
                            }
                        }
                    });

                    q19_ch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q19_ch6.isChecked()){

                                answer_2 = ", verbatim";
                                answer_holder = answer_1 + answer_2;
                                user_answers.set(18,answer_holder);
                            }
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q19_ch1);
                    question_container.addView(q19_ch2);
                    question_container.addView(q19_ch3);
                    question_container.addView(q19_ch4);
                    question_container.addView(q19_ch5);
                    question_container.addView(q19_ch6);


                }

                else if (counter == 20){
                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    final Button q20_button = new Button(context);
                    q20_button.setText("Enter");
                    q20_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if (question_1_input.getText().toString().equals("11")){

                                answer_holder = "11";
                                user_answers.set(19,answer_holder);
                            }
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q20_button);
                }

                else if (counter == 21){

                    final RadioGroup q21_RG = new RadioGroup(context);

                    final RadioButton q21_ch1 = new RadioButton(context);
                    q21_ch1.setText("A");

                    final RadioButton q21_ch2 = new RadioButton(context);
                    q21_ch2.setText("B");

                    final RadioButton q21_ch3 = new RadioButton(context);
                    q21_ch3.setText("C");

                    final RadioButton q21_ch4 = new RadioButton(context);
                    q21_ch4.setText("D");

                    q21_ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if (q21_ch2.isChecked()){
                                answer_holder = "B";
                                user_answers.set(20,answer_holder);
                            }
                        }
                    });

                    q21_RG.addView(q21_ch1);
                    q21_RG.addView(q21_ch2);
                    q21_RG.addView(q21_ch3);
                    q21_RG.addView(q21_ch4);



                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q21_RG);
                }

                else if (counter == 22){

                    final RadioGroup q22_RG = new RadioGroup(context);

                    final RadioButton q22_ch1 = new RadioButton(context);
                    q22_ch1.setText("A");

                    final RadioButton q22_ch2 = new RadioButton(context);
                    q22_ch2.setText("B");

                    final RadioButton q22_ch3 = new RadioButton(context);
                    q22_ch3.setText("C");

                    final RadioButton q22_ch4 = new RadioButton(context);
                    q22_ch4.setText("D");

                    final RadioButton q22_ch5 = new RadioButton(context);
                    q22_ch5.setText("E");

                    final RadioButton q22_ch6 = new RadioButton(context);
                    q22_ch6.setText("F");

                    final RadioButton q22_ch7 = new RadioButton(context);
                    q22_ch7.setText("G");

                    final RadioButton q22_ch8 = new RadioButton(context);
                    q22_ch8.setText("H");

                    q22_RG.addView(q22_ch1);
                    q22_RG.addView(q22_ch2);
                    q22_RG.addView(q22_ch3);
                    q22_RG.addView(q22_ch4);
                    q22_RG.addView(q22_ch5);
                    q22_RG.addView(q22_ch6);
                    q22_RG.addView(q22_ch7);
                    q22_RG.addView(q22_ch8);

                    q22_ch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if (q22_ch5.isChecked()){

                                answer_holder = "E";
                                user_answers.set(21,answer_holder);
                            }
                        }
                    });


                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q22_RG);

                }

                else if(counter == 23){

                    final RadioGroup q23_RG = new RadioGroup(context);

                    final RadioButton q23_ch1 = new RadioButton(context);
                    q23_ch1.setText(R.string.iq_test_Q23_CH1);

                    final RadioButton q23_ch2 = new RadioButton(context);
                    q23_ch2.setText(R.string.iq_test_Q23_CH2);

                    final RadioButton q23_ch3 = new RadioButton(context);
                    q23_ch3.setText(R.string.iq_test_Q23_CH3);

                    final RadioButton q23_ch4 = new RadioButton(context);
                    q23_ch4.setText(R.string.iq_test_Q23_CH4);

                    final RadioButton q23_ch5 = new RadioButton(context);
                    q23_ch5.setText(R.string.iq_test_Q23_CH5);

                    q23_ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q23_ch2.isChecked()){

                                answer_holder = "B";
                                user_answers.set(22,answer_holder);
                            }
                        }
                    });



                    q23_RG.addView(q23_ch1);
                    q23_RG.addView(q23_ch2);
                    q23_RG.addView(q23_ch3);
                    q23_RG.addView(q23_ch4);
                    q23_RG.addView(q23_ch5);

                    image_container.removeAllViews();
                    question_container.removeAllViews();
                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q23_RG);
                }

                else if (counter == 24){

                    final RadioGroup q24_RG = new RadioGroup(context);

                    final RadioButton q24_ch1 = new RadioButton(context);
                    q24_ch1.setText("A");

                    final RadioButton q24_ch2 = new RadioButton(context);
                    q24_ch2.setText("B");

                    final RadioButton q24_ch3 = new RadioButton(context);
                    q24_ch3.setText("C");

                    final RadioButton q24_ch4 = new RadioButton(context);
                    q24_ch4.setText("D");

                    final RadioButton q24_ch5 = new RadioButton(context);
                    q24_ch5.setText("E");

                    final RadioButton q24_ch6 = new RadioButton(context);
                    q24_ch6.setText("F");

                    q24_ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q24_ch3.isChecked()){

                                answer_holder = "C";
                                user_answers.set(23,answer_holder);
                            }
                        }
                    });

                    q24_RG.addView(q24_ch1);
                    q24_RG.addView(q24_ch2);
                    q24_RG.addView(q24_ch3);
                    q24_RG.addView(q24_ch4);
                    q24_RG.addView(q24_ch5);


                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q24_RG);

                }

                else if (counter == 25){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);
                    final Button q25_button = new Button(context);
                    q25_button.setText("Enter");
                    q25_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                           answer_holder = question_1_input.getText().toString();
                           user_answers.set(24,answer_holder);
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q25_button);
                }

                else if (counter == 26){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_TEXT);

                    question_2_input.setText("");
                    question_2_input.setInputType(InputType.TYPE_CLASS_TEXT);

                    final Button q26_Button = new Button(context);
                    q26_Button.setText("Enter");
                    q26_Button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if (question_1_input.getText().toString().toLowerCase().equals("crave") && question_2_input.getText().toString().toLowerCase().equals("dislike")){

                                answer_holder = "crave, dislike";
                                user_answers.set(25,answer_holder);

                            }

                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(question_2_input);
                    question_container.addView(q26_Button);
                }

                else if (counter == 27){

                    RadioGroup q27_RG = new RadioGroup(context);

                    final RadioButton q27_ch1 = new RadioButton(context);
                    q27_ch1.setText("A");

                    RadioButton q27_ch2 = new RadioButton(context);
                    q27_ch2.setText("B");

                    RadioButton q27_ch3 = new RadioButton(context);
                    q27_ch3.setText("C");

                    RadioButton q27_ch4 = new RadioButton(context);
                    q27_ch4.setText("D");

                    RadioButton q27_ch5 = new RadioButton(context);
                    q27_ch5.setText("E");

                    q27_ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q27_ch1.isChecked()){

                                answer_holder = "A";
                                user_answers.set(26,answer_holder);
                            }

                        }
                    });

                    q27_RG.addView(q27_ch1);
                    q27_RG.addView(q27_ch2);
                    q27_RG.addView(q27_ch3);
                    q27_RG.addView(q27_ch4);
                    q27_RG.addView(q27_ch5);

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q27_RG);
                }

                else if (counter == 28){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);
                    final Button q28_button = new Button(context);
                    q28_button.setText("Enter");
                    q28_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                        answer_holder = question_1_input.toString();
                        user_answers.set(27,answer_holder);

                        }
                    });


                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q28_button);
                }

                else if (counter == 29){

                    RadioGroup q29_RG = new RadioGroup(context);

                    RadioButton q29_ch1 = new RadioButton(context);
                    q29_ch1.setText("A");

                    RadioButton q29_ch2 = new RadioButton(context);
                    q29_ch2.setText("B");

                    RadioButton q29_ch3 = new RadioButton(context);
                    q29_ch3.setText("C");

                    RadioButton q29_ch4 = new RadioButton(context);
                    q29_ch4.setText("D");

                    RadioButton q29_ch5 = new RadioButton(context);
                    q29_ch5.setText("E");

                    final RadioButton q29_ch6 = new RadioButton(context);
                    q29_ch6.setText("F");

                    q29_ch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q29_ch6.isChecked()){

                                answer_holder = "F";
                                user_answers.set(28,answer_holder);
                            }
                        }
                    });

                    q29_RG.addView(q29_ch1);
                    q29_RG.addView(q29_ch2);
                    q29_RG.addView(q29_ch3);
                    q29_RG.addView(q29_ch4);
                    q29_RG.addView(q29_ch5);
                    q29_RG.addView(q29_ch6);


                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q29_RG);

                }

                else if (counter == 30){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    final Button q30_button = new Button(context);
                    q30_button.setText("Enter");
                    q30_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();
                            user_answers.set(29,answer_holder);
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));

                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q30_button);
                }

                else if (counter == 31){

                    RadioGroup q31_Rg = new RadioGroup(context);

                    RadioButton q31_ch1 = new RadioButton(context);
                    q31_ch1.setText("A");

                    RadioButton q31_ch2 = new RadioButton(context);
                    q31_ch2.setText("B");

                    final RadioButton q31_ch3 = new RadioButton(context);
                    q31_ch3.setText("C");

                    q31_ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q31_ch3.isChecked()){

                                answer_holder = "C";
                                user_answers.set(30,answer_holder);
                            }
                        }
                    });

                    q31_Rg.addView(q31_ch1);
                    q31_Rg.addView(q31_ch2);
                    q31_Rg.addView(q31_ch3);



                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q31_Rg);
                }

                else if (counter == 32){

                    RadioGroup q32_Rg = new RadioGroup(context);

                    RadioButton q32_ch1 = new RadioButton(context);
                    q32_ch1.setText("A");

                    final RadioButton q32_ch2 = new RadioButton(context);
                    q32_ch2.setText("B");

                    RadioButton q32_ch3 = new RadioButton(context);
                    q32_ch3.setText("C");

                    RadioButton q32_ch4 = new RadioButton(context);
                    q32_ch4.setText("D");

                    RadioButton q32_ch5 = new RadioButton(context);
                    q32_ch5.setText("E");

                    q32_ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q32_ch2.isChecked()){

                                answer_holder = "B";
                                user_answers.set(31,answer_holder);
                            }
                        }
                    });

                    q32_Rg.addView(q32_ch1);
                    q32_Rg.addView(q32_ch2);
                    q32_Rg.addView(q32_ch3);
                    q32_Rg.addView(q32_ch4);
                    q32_Rg.addView(q32_ch5);

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q32_Rg);
                }

                else if (counter == 33){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    final Button q33_button = new Button(context);
                    q33_button.setText("Enter");
                    q33_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();
                            user_answers.set(32,answer_holder);
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q33_button);

                }

                else if (counter == 34){

                    RadioGroup q34_Rg = new RadioGroup(context);

                    RadioButton q34_ch1 = new RadioButton(context);
                    q34_ch1.setText("A");

                    final RadioButton q34_ch2 = new RadioButton(context);
                    q34_ch2.setText("B");

                    RadioButton q34_ch3 = new RadioButton(context);
                    q34_ch3.setText("C");

                    RadioButton q34_ch4 = new RadioButton(context);
                    q34_ch4.setText("D");

                    final RadioButton q34_ch5 = new RadioButton(context);
                    q34_ch5.setText("E");

                    RadioButton q34_ch6 = new RadioButton(context);
                    q34_ch6.setText("F");

                    q34_Rg.addView(q34_ch1);
                    q34_Rg.addView(q34_ch2);
                    q34_Rg.addView(q34_ch3);
                    q34_Rg.addView(q34_ch4);
                    q34_Rg.addView(q34_ch5);
                    q34_Rg.addView(q34_ch6);

                    q34_ch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q34_ch5.isChecked()){

                                answer_holder = "E";
                                user_answers.set(33,answer_holder);
                            }
                        }
                    });


                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q34_Rg);

                }

                else if (counter == 35){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_TEXT);

                    final Button q35_button = new Button(context);
                    q35_button.setText("Enter");
                    q35_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();
                            user_answers.set(34,answer_holder);
                        }
                    });


                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q35_button);
                }

                else if (counter == 36){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    final Button q36_button = new Button(context);
                    q36_button.setText("Enter");
                    q36_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();
                            user_answers.set(35,answer_holder);
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q36_button);
                }

                else if (counter == 37){

                    RadioGroup q37_RG = new RadioGroup(context);

                    final RadioButton q37_ch1 = new RadioButton(context);
                    q37_ch1.setText("A");

                    RadioButton q37_ch2 = new RadioButton(context);
                    q37_ch2.setText("B");

                    RadioButton q37_ch3 = new RadioButton(context);
                    q37_ch3.setText("C");

                    RadioButton q37_ch4 = new RadioButton(context);
                    q37_ch4.setText("D");

                    RadioButton q37_ch5 = new RadioButton(context);
                    q37_ch5.setText("E");

                    q37_ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            if (q37_ch1.isChecked()){

                                answer_holder = "A";
                                user_answers.set(36,answer_holder);

                            }
                        }
                    });

                    q37_RG.addView(q37_ch1);
                    q37_RG.addView(q37_ch2);
                    q37_RG.addView(q37_ch3);
                    q37_RG.addView(q37_ch4);
                    q37_RG.addView(q37_ch5);

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q37_RG);

                }

                else if (counter == 38){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_TEXT);
                    question_1_input.setHint("Jo");

                    question_2_input.setText("");
                    question_2_input.setInputType(InputType.TYPE_CLASS_TEXT);
                    question_2_input.setHint("Mo");

                    question_3_input.setText("");
                    question_3_input.setInputType(InputType.TYPE_CLASS_TEXT);
                    question_3_input.setHint("Flo");

                    final Button q38_button = new Button(context);
                    q38_button.setText("Enter");
                    q38_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if (question_1_input.toString().equals("36") && question_2_input.toString().equals("24") && question_3_input.toString().equals("16")){

                                answer_holder = "36, 24, 16";
                                user_answers.set(37,answer_holder);

                            }
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(question_2_input);
                    question_container.addView(question_3_input);
                    question_container.addView(q38_button);

                }

                else if (counter == 39){

                    RadioGroup q39_RG = new RadioGroup(context);

                    RadioButton q39_ch1 = new RadioButton(context);
                    q39_ch1.setText("A");

                    RadioButton q39_ch2 = new RadioButton(context);
                    q39_ch2.setText("B");

                    RadioButton q39_ch3 = new RadioButton(context);
                    q39_ch3.setText("C");

                    final RadioButton q39_ch4 = new RadioButton(context);
                    q39_ch4.setText("D");

                    RadioButton q39_ch5 = new RadioButton(context);
                    q39_ch5.setText("E");

                    RadioButton q39_ch6 = new RadioButton(context);
                    q39_ch6.setText("F");

                    RadioButton q39_ch7 = new RadioButton(context);
                    q39_ch7.setText("G");

                    q39_ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                            if (q39_ch4.isChecked()){

                                answer_holder = "D";
                                user_answers.set(38,answer_holder);
                            }
                        }
                    });

                    q39_RG.addView(q39_ch1);
                    q39_RG.addView(q39_ch2);
                    q39_RG.addView(q39_ch3);
                    q39_RG.addView(q39_ch4);
                    q39_RG.addView(q39_ch5);
                    q39_RG.addView(q39_ch6);
                    q39_RG.addView(q39_ch7);

                    image_container.removeAllViews();
                    question_container.removeAllViews();



                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(q39_RG);
                }

                else if (counter == 40){

                    question_1_input.setText("");
                    question_1_input.setInputType(InputType.TYPE_CLASS_NUMBER);
                    question_1_input.setHint("Enter your answer");

                    final Button q40_button = new Button(context);
                    q40_button.setText("Enter");
                    q40_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            answer_holder = question_1_input.getText().toString();
                            user_answers.set(39,answer_holder);
                        }
                    });

                    image_container.removeAllViews();
                    question_container.removeAllViews();

                    imageView_questions.setImageResource(imageViewList.get(counter));
                    image_container.addView(imageView_questions);
                    question_container.addView(question_1_input);
                    question_container.addView(q40_button);
                }



            }


        });


        show_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                                          user_answers.retainAll(correct_answers);
                                          score_number = String.valueOf(user_answers.size());

                                          score_view.setText(score_number);

            }
        });



    }


}
