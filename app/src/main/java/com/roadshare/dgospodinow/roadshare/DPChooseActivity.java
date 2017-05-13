package com.roadshare.dgospodinow.roadshare;

/**
 * Created by dgospodinow on 5/12/17.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class DPChooseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dp_choose_activity);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            setTextViewFont((TextView) findViewById(R.id.textView));
            setTextViewFont((TextView) findViewById(R.id.textView2));

            Button withCarButton = (Button) findViewById(R.id.button3);
            final ImageView outterCircle = (ImageView) findViewById(R.id.outterCircle);
            withCarButton.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionevent) {
                    int action = motionevent.getAction();
                    if (action == MotionEvent.ACTION_DOWN) {
                        outterCircle.setImageResource(R.drawable.ic_circle_svg3);

                    } else if (action == MotionEvent.ACTION_UP) {
                        outterCircle.setImageResource(R.drawable.ic_circle_svg2);
                    }
                    return false;
                }
            });

            Button withoutCarButton = (Button) findViewById(R.id.button2);
            final ImageView outterCircle2 = (ImageView) findViewById(R.id.outterCircle2);
            withoutCarButton.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionevent) {
                    int action = motionevent.getAction();
                    if (action == MotionEvent.ACTION_DOWN) {
                        outterCircle2.setImageResource(R.drawable.ic_circle_svg3);

                    } else if (action == MotionEvent.ACTION_UP) {
                        outterCircle2.setImageResource(R.drawable.ic_circle_svg2);
                    }
                    return false;
                }
            });
        } else {
            Intent loginIntent = new Intent(DPChooseActivity.this, SignInActivity.class);
            startActivity(loginIntent);
        }
    }

    public void setTextViewFont(TextView t) {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Blogger_Sans.otf");
        t.setTypeface(font);
    }
}
