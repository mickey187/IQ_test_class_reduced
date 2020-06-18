package com.example.iqtest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import android.widget.Switch;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment   {
    Button iq_test_launcher_button;
    Button numerical_test_launcher_button;

    private View view;
    Context context;
    ProgressBar progressBar;
    WordTest wordTest;
    SharedPreferences sharedPreferences;
    String test;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

       view  = inflater.inflate(R.layout.fragment_home, container, false);


        wordTest = new WordTest();
        progressBar = view.findViewById(R.id.progressBar);


        int score_counter = wordTest.counter;
        sharedPreferences = this.getActivity().getSharedPreferences("preferences",Context.MODE_PRIVATE);



        //progressBar.setProgress(sharedPreferences.getInt(getString(R.string.counter_key),getResources().getInteger(R.integer.default_counter_value)));

      if (sharedPreferences.getInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_1))==1){
          progressBar.setProgress(sharedPreferences.getInt(getString(R.string.score_key),getResources().getInteger(R.integer.score1_value)));

      }

      else if (sharedPreferences.getInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_2))==2){

          progressBar.setProgress(sharedPreferences.getInt(getString(R.string.score_key),getResources().getInteger(R.integer.score2_value)));

      }
      else if (sharedPreferences.getInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_3))==3){

          progressBar.setProgress(sharedPreferences.getInt(getString(R.string.score_key),getResources().getInteger(R.integer.score3_value)));

      }
      else if (sharedPreferences.getInt(getString(R.string.counter_key),getResources().getInteger(R.integer.counter_value_4))==4){

          progressBar.setProgress(sharedPreferences.getInt(getString(R.string.score_key),getResources().getInteger(R.integer.score4_value)));

      }
      else if (sharedPreferences.getInt(getString(R.string.counter_key),getResources().getInteger(R.integer.default_counter_value))==0){
          progressBar.setProgress(sharedPreferences.getInt(getString(R.string.score_key),getResources().getInteger(R.integer.default_score_value)));}





















        iq_test_launcher_button = view.findViewById(R.id.iq_test_launcher_button);
        numerical_test_launcher_button = view.findViewById(R.id.numerical_test_launcher_button);

       context = getActivity();
        iq_test_launcher_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context,IQ_Test_One.class);
               startActivity(intent);
           }
       });

        numerical_test_launcher_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context,Intelligence.class);
               startActivity(intent);
               getActivity().overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
           }
       });


        return view ;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        sharedPreferences = this.getActivity().getSharedPreferences("preferences",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.commit();
    }
    private Boolean allowRefresh = false;
    @Override
    public void onResume() {
        super.onResume();

        sharedPreferences = this.getActivity().getSharedPreferences("preferences",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.commit();
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);




    }








}
