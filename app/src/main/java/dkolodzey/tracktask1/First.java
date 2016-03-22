package dkolodzey.tracktask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class First extends AppCompatActivity {

    private AsyncSecondCaller asyncCaller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    @Override
    protected void onStart(){
        super.onStart();
        asyncCaller = new AsyncSecondCaller();
        asyncCaller.execute(this);
    }

    public void callSecondAndDie() {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        asyncCaller.cancel(true);
        super.onBackPressed();
    }
}
