package test.com.transitiontest;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.widget.ImageView;

/**
 * Created by WingHinChan on 2016/09/28.
 */

public class SecondActivity extends AppCompatActivity {

    ImageView backdrop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        backdrop = (ImageView) findViewById(R.id.picture);
        backdrop.setBackground(ContextCompat.getDrawable(this, R.drawable.snow));
    }

    @Override
    public void onBackPressed() {
        supportFinishAfterTransition();
        super.onBackPressed();

    }
}
