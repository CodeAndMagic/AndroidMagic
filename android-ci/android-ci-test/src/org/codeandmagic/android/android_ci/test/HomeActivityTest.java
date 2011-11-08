package org.codeandmagic.android.android_ci.test;

import org.codeandmagic.android.android_ci.HomeActivity;
import org.junit.Assert;
import org.junit.Test;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

public class HomeActivityTest extends ActivityInstrumentationTestCase2<HomeActivity> {

	private Solo mSolo;

	public HomeActivityTest() {
		super(HomeActivity.class.getPackage().getName(), HomeActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mSolo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	protected void tearDown() throws Exception {
		try {
			mSolo.finalize();
		}
		catch (final Throwable e) {
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
	}

	@Test
	public void testHomeActivity() {
		assertNotNull(getActivity());
		Assert.assertTrue(mSolo.searchText("Hello World!"));
	}
}
