package com.example.android.thetowersofhanoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable myFrameAnimation;
    private View myFrameAnimationImageView;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFrameAnimationImageView = (ImageView)
                findViewById(R.id.frameAnimationImageView);
        myFrameAnimationImageView.setBackgroundResource(R.drawable.frame_animation);
        myFrameAnimation = (AnimationDrawable)
                myFrameAnimationImageView.getBackground();
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                myFrameAnimation.stop();
                myFrameAnimation.start();
            }
        });
    }

    //clicking the image starts the frame animation. if it is running, it first stops
    // and then starts it
   /* public void showAnimation(View view) {
        myFrameAnimation.stop();
        myFrameAnimation.start();
    }
*/
}
