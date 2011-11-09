package org.codeandmagic.android.android_ui;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.codeandmagic.android.android_ci.HomeActivity;
import org.codeandmagic.android.android_ci.R;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class HomeActivityTest {
	private HomeActivity mActivity;

	@Before
	public void setUp() throws Exception {
		mActivity = new HomeActivity();
		mActivity.onCreate(null);
	}

	@Test
	public void testHomeActivity() throws Exception {
		final String appName = mActivity.getResources().getString(R.string.app_name);
		assertThat(appName, equalTo("Android CI"));

	}
}
