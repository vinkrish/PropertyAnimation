package vingel.in.propertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;


public class TadComplexAnimation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_complex_animation);
    }

    public void tadComplexAnimation(View view) {
        float scale = getResources().getDisplayMetrics().density;
        View someImage = findViewById(R.id.nina);

        ObjectAnimator anim1 = ObjectAnimator.ofFloat(someImage,
                "x", 20.0f * scale, 220.0f * scale);
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(someImage,
                "y", 20.0f * scale, 220.0f * scale);
        ObjectAnimator anim3 = ObjectAnimator.ofFloat(someImage,
                "x", 220.0f * scale, 20.0f * scale);
        ObjectAnimator anim4 = ObjectAnimator.ofFloat(someImage,
                "y", 220.0f * scale, 20.0f * scale);

        AnimatorSet animSet = new AnimatorSet();

        /*animSet.play(anim1).before(anim2);
        animSet.play(anim3).after(anim2);
        animSet.play(anim3).with(anim4);
        animSet.play(anim1).after(500);*/

        animSet.play(anim1).before(anim2).after(500);
        animSet.play(anim3).after(anim2).with(anim4);

        anim1.setDuration(500);
        anim2.setDuration(500);
        anim1.setInterpolator(new AccelerateInterpolator());
        anim2.setInterpolator(new DecelerateInterpolator());

        anim3.setDuration(1000);
        anim4.setDuration(1000);
        anim3.setInterpolator(new LinearInterpolator());
        anim4.setInterpolator(new AccelerateDecelerateInterpolator());

        //animSet.setDuration(1000);
        //animSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animSet.start();
    }
}
