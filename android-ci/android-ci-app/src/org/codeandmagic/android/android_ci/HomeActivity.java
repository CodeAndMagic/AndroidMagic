package org.codeandmagic.android.android_ci;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class HomeActivity extends FragmentActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}