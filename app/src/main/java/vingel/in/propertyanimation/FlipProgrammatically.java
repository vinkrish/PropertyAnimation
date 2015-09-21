package vingel.in.propertyanimation;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class FlipProgrammatically extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_progmmactically);

        findViewById(R.id.nina).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                View image = findViewById(R.id.nina);
                ObjectAnimator anim
                        = ObjectAnimator.ofFloat(image, "alpha",
                        1.0f, 0.25f, 0.75f, 0.15f, 0.5f, 0.0f);
                anim.setDuration(5000);
                //anim.setInterpolator(new BounceInterpolator());
                anim.start();
                return true;
            }
        });
    }

    public void flipProgrammatically(View view){
        View image = findViewById(R.id.nina);
        ObjectAnimator anim
                = ObjectAnimator.ofFloat(image, "rotationY", 0.0f, 360.0f);
        anim.setDuration(300);
        anim.start();
    }

}
