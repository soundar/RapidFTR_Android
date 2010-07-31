package org.unicef.rapidftr.test;

import org.unicef.rapidftr.RootActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;

public class RootActivityTest extends ActivityInstrumentationTestCase2<RootActivity>{

	
	private RootActivity mActivity;
	private TextView mView;
	private String resourceString;
	public RootActivityTest() {
		super("org.unicef.rapidftr", RootActivity.class);
	} 
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();
		mView = (TextView) mActivity.findViewById(org.unicef.rapidftr.R.id.text);
		resourceString = mActivity.getString(org.unicef.rapidftr.R.string.hello);
		
	}

	public void testPreconditions() {
	      assertNotNull(mView);
	    }
	    public void testText() {
	      assertEquals(resourceString,(String)mView.getText());
	    }

}
