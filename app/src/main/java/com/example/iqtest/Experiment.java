package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Experiment extends AppCompatActivity {
    View v;
    Button click;
    FrameLayout layout_1;
    LinearLayout layout_2;
    Context context;
    CardView cardViewHolder;
    CardView c;
    View view;
    List <CardView> cards = new ArrayList <CardView>();
    int counter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        c = findViewById(R.id.expcard);

        layout_1 = findViewById(R.id.layout_1);
        layout_2 = findViewById(R.id.layout_2);
        click = findViewById(R.id.click);

        context = getApplicationContext();

        final CardView cardView1 = new CardView(context);

        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        cardView1.setLayoutParams(params);

        TextView tv = new TextView(context);
        tv.setLayoutParams(params);
        tv.setText("CardView\none");
        tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        tv.setTextColor(Color.RED);
        cardView1.addView(tv);


        CardView cardView2 = new CardView(context);

        FrameLayout.LayoutParams params2 = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        cardView2.setLayoutParams(params2);

        TextView tv2 = new TextView(context);
        tv2.setLayoutParams(params2);
        tv2.setText("CardView\ntwo");
        tv2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        tv2.setTextColor(Color.RED);
        cardView2.addView(tv2);




        CardView cardView3 = new CardView(context);

        FrameLayout.LayoutParams params3 = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        cardView3.setLayoutParams(params3);

        TextView tv3 = new TextView(context);
        tv3.setLayoutParams(params3);
        tv3.setText("CardView\nthree");
        tv3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        tv3.setTextColor(Color.RED);
        cardView3.addView(tv3);


        CardView cardView4 = new CardView(context);

        FrameLayout.LayoutParams params4 = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        cardView4.setLayoutParams(params4);

        TextView tv4 = new TextView(context);
        tv4.setLayoutParams(params4);
        tv4.setText("CardView\nfour");
        tv4.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        tv4.setTextColor(Color.RED);
        cardView4.addView(tv4);

        cards.add(0,cardView1);
        cards.add(1,cardView2);
        cards.add(2,cardView3);
        cards.add(3,cardView4);
        cards.add(4,c);


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                layout_1.removeAllViews();
              if (counter < 5){

                  cardViewHolder = cards.get(counter);

                  layout_1.addView(cardViewHolder);
              }
              counter++;









            }
        });




    }
}
