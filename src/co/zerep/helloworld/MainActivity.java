package co.zerep.helloworld;

import co.zerep.helloworld.R;

import com.google.android.glass.app.Card;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	
	private static final String TAG = MainActivity.class.getSimpleName();
	
	private Card helloCard;

	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		
		Log.d(TAG, "Application launched.");
		helloCard = new Card(this).setText(R.string.hello_world);
		setContentView(helloCard.getView());
	}

	@Override
    protected void onResume() {
        super.onResume();
        
        Log.d(TAG, "Application resumed.");
        // onResume code here
    }

	@Override
    protected void onPause() {
		// onPause code here
		Log.d(TAG, "Application paused.");
		
        super.onPause();
    }	
}
