package org.codeandmagic.android.android_ci.test;

import org.codeandmagic.android.android_ci.HomeActivity;
import org.junit.Test;

import android.test.ActivityInstrumentationTestCase2;

public class HomeActivityTest extends ActivityInstrumentationTestCase2<HomeActivity> {

	public HomeActivityTest() {
		super(HomeActivity.class.getPackage().getName(), HomeActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void testHomeActivity() {
		assertNotNull(getActivity());
	}
}
