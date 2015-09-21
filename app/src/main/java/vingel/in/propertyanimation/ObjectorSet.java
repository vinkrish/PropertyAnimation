package vingel.in.propertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;


public class ObjectorSet extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objector_set);
    }

    public void disappearBox(View view){
        View policebox = findViewById(R.id.tardis);
        View policeboxlight = findViewById(R.id.bulb);
        ObjectAnimator anim1 = ObjectAnimator.ofFloat(policebox, "alpha",
                1.0f, 0.0f, 0.5f, 0.75f, 1.0f, 0.5f, 0.0f);
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(policeboxlight, "alpha",
                0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.5f, 0.0f);
        AnimatorSet animSet = new AnimatorSet();
        animSet.playTogether(anim1, anim2);
        animSet.setDuration(5000);
        animSet.setInterpolator(new LinearInterpolator());
        animSet.start();
    }

}
