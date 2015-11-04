package com.goudis.theo.mylarcoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.support.design.widget.TabLayout;
import android.support.design.widget.AppBarLayout;

public class MainActivity extends AppCompatActivity implements AppBarLayout.OnOffsetChangedListener{

	private static final int PERCENTAGE_TO_ANIMATE_LOGO = 50;
	private boolean mIsLogoShown = true;
	
	private ImageView mLogoView;
	private int mMaxScrollSize;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabLayout tabLayout = (TabLayout) findViewById(R.id.materialup_tabs);
		ViewPager viewPager  = (ViewPager) findViewById(R.id.materialup_viewpager);
		AppBarLayout appbarLayout = (AppBarLayout) findViewById(R.id.materialup_appbar);
		mLogoView = (ImageView) findViewById(R.id.materialup_profile_image);

		appbarLayout.addOnOffsetChangedListener(this);
		mMaxScrollSize = appbarLayout.getTotalScrollRange();

		viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));
		tabLayout.setupWithViewPager(viewPager);
	}

	public static void start(Context c) {
		c.startActivity(new Intent(c, MainActivity.class));
	}

	@Override
	public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
		if (mMaxScrollSize == 0)
			mMaxScrollSize = appBarLayout.getTotalScrollRange();

		int percentage = (Math.abs(i)) * 100 / mMaxScrollSize;

		if (percentage >= PERCENTAGE_TO_ANIMATE_LOGO && mIsLogoShown) {
			mIsLogoShown = false;
			mLogoView.animate().scaleY(0).scaleX(0).setDuration(200).start();
		}

		if (percentage <= PERCENTAGE_TO_ANIMATE_LOGO && !mIsLogoShown) {
			mIsLogoShown = true;
			mLogoView.animate()
					.scaleY(1).scaleX(1)
					.start();
		}
	}

	class TabsAdapter extends FragmentPagerAdapter {
		public TabsAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getCount() {
			return 3;
		}

		@Override
		public Fragment getItem(int i) {
			switch(i) {
				case 0: return CardsFragment.newInstance();
				case 1: return CardsFragment.newInstance();
				case 2: return CardsFragment.newInstance();
			}
			return null;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			switch(position) {
				case 0: return "Cards";
				case 1: return "Filters";
				case 2: return "Map";
			}
			return "";
		}
	}

}