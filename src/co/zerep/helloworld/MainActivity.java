/*
 * Copyright (C) 2014 Pedro Perez Sanchez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
