package com.example.firoz.animation;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animation;

    AnimationDrawable headAnimation,handAnimation,legAnimation;

    ImageView ivHead,ivLeftLeg,ivRightLeg,ivLeftHand,ivRightHand,ivStomach;

    public MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivHead=(ImageView)findViewById(R.id.ivhead);
        ivLeftLeg=(ImageView)findViewById(R.id.ivleftleg);
        ivRightLeg=(ImageView)findViewById(R.id.ivrightleg);
        ivLeftHand=(ImageView)findViewById(R.id.ivlefthand);
        ivRightHand=(ImageView)findViewById(R.id.ivrighthand);
        ivStomach=(ImageView)findViewById(R.id.ivstomach);

        ivHead.setImageResource(R.drawable.head_animation);
        headAnimation=(AnimationDrawable)ivHead.getDrawable();
        //ivHead.setBackgroundResource(R.drawable.head_animation);
        //headAnimation=(AnimationDrawable)ivHead.getBackground();

        ivRightLeg.setImageResource(R.drawable.leg_animation);
        legAnimation=(AnimationDrawable)ivRightLeg.getDrawable();

        ivRightHand.setImageResource(R.drawable.hand_animation);
        handAnimation=(AnimationDrawable)ivRightHand.getDrawable();


        ivHead.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        //ivHead.setBackgroundResource(R.drawable.head_animation);
                        //headAnimation=(AnimationDrawable)ivHead.getBackground();
                        mp=MediaPlayer.create(getApplicationContext(),R.raw.head);
                        headAnimation.stop();
                        headAnimation.start();
                        mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }

                return true;
            }
        });
        ivRightLeg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        mp=MediaPlayer.create(getApplicationContext(),R.raw.leg);

                        legAnimation.stop();
                        headAnimation.stop();
                        legAnimation.start();
                        headAnimation.start();
                        mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });
        ivRightHand.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        mp=MediaPlayer.create(getApplicationContext(),R.raw.hand);
                        handAnimation.stop();
                        headAnimation.stop();
                        handAnimation.start();
                        headAnimation.start();
                        mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });
    }
}

/*
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imageView);


        //first get the image view that you want to animate and set it to use your animation drawable as its background
        img.setBackgroundResource(R.drawable.frame_animation);

        //then get the image view’s background and cast it to an AnimationDrawable object
        animation=(AnimationDrawable)img.getBackground();
    }
    public void showAnimation(View v)
    {
        animation.stop();
        animation.start();
    }
 */