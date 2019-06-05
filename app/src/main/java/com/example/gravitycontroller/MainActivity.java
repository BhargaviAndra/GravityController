package com.example.gravitycontroller;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.util.Log;
import android.view.animation.AnimationSet;
import static android.graphics.Color.BLACK;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ConstraintLayout touch;
    Animation down,up;

int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        touch=(ConstraintLayout)findViewById(R.id.r);
        image1=(ImageView)findViewById(R.id.image1);
        image2=(ImageView)findViewById(R.id.image2);
        image3=(ImageView)findViewById(R.id.image3);
        image4=(ImageView)findViewById(R.id.image4);
        image5=(ImageView)findViewById(R.id.image5);
        down=AnimationUtils.loadAnimation(this,R.anim.translate_down);//code to be written in separate file in anim in res
        up=AnimationUtils.loadAnimation(this,R.anim.translate_up);//code to be written in separate file in anim in res

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            a=a+1;
            if((a%2)!=0)
            {
                image1.startAnimation(down);
                image2.startAnimation(down);
                image3.startAnimation(down);
                image4.startAnimation(down);
                image5.startAnimation(down);
                down.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

            }
            else
            { image1.startAnimation(up);
                image2.startAnimation(up);
                image3.startAnimation(up);
                image4.startAnimation(up);
                image5.startAnimation(up);
                up.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

            }

            }

        });
    }
}