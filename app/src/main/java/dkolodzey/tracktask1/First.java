package dkolodzey.tracktask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    @Override
    protected void onStart(){
        super.onStart();
        new AsyncSecondCaller().execute(this);
    }

    public void callSecond() {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }
}
