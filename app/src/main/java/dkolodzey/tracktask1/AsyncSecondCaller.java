package dkolodzey.tracktask1;

import android.content.Intent;
import android.os.AsyncTask;

/**
 * Created by DKolodzey on 20.03.16.
 */
public class AsyncSecondCaller extends AsyncTask<First, Void, Void> {
    @Override
    protected Void doInBackground(First... params) {
        try {
            Thread.sleep(2000);
            First callingActivity = params[0];
            callingActivity.callSecond();
        } catch (Exception e) {
            //Ignore
        }
        return null;
    }
    @Override
    protected void onPostExecute(Void result) {

    }
}
