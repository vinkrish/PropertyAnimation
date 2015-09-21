package vingel.in.propertyanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class FlipAnimation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_animation);
    }

    public void flipOnVertical(View view) {
        View image = findViewById(R.id.nina);
        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.flip_on_vertical);
        anim.setTarget(image);
        anim.start();
    }
}
