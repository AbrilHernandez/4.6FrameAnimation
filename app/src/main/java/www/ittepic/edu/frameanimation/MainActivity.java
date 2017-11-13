package www.ittepic.edu.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.animation);
        if (imageView == null) throw new AssertionError();

        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.animation);

        clock = (AnimationDrawable) imageView.getBackground();
        clock.setOneShot(true);
    }


    public void onStartBtnClick(View v) {
        imageView.setVisibility(View.VISIBLE);
        if (clock.isRunning()) {
            clock.stop();
        }
        clock.start();
    }

    public void onStopBtnClick(View v) {
        clock.stop();
    }

}
