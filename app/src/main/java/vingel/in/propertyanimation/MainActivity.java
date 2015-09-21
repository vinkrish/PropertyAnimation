package vingel.in.propertyanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void flipAnimation(View view){
        Intent i = new Intent(MainActivity.this, FlipAnimation.class);
        startActivity(i);
    }

    public void flipInCode(View view){
        Intent i = new Intent(MainActivity.this, FlipProgrammatically.class);
        startActivity(i);
    }

    public void objectorSet(View view){
        Intent i = new Intent(MainActivity.this, ObjectorSet.class);
        startActivity(i);
    }

    public void tadComplexAnimation(View view){
        Intent i = new Intent(MainActivity.this, TadComplexAnimation.class);
        startActivity(i);
    }

}
