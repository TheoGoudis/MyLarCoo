package com.goudis.theo.mylarcoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.support.design.widget.AppBarLayout;
import android.widget.RelativeLayout;

import com.goudis.theo.mylarcoo.view.animations.HeadAnimateListener;
import com.goudis.theo.mylarcoo.view.fragments.*;

public class MainActivity extends AppCompatActivity {

	RelativeLayout relLogo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabLayout tabLayout = (TabLayout) findViewById(R.id.meet_tabs);
		ViewPager viewPager = (ViewPager) findViewById(R.id.meet_viewpager);

		AppBarLayout appbarLayout = (AppBarLayout) findViewById(R.id.meet_appbar);

		relLogo = (RelativeLayout) findViewById(R.id.meet_relative_logo);
		appbarLayout.addOnOffsetChangedListener(new HeadAnimateListener(appbarLayout, relLogo));

		viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));
		tabLayout.setupWithViewPager(viewPager);
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
			switch (i) {
				case 0:
					return CardsFragment.newInstance();
				case 1:
					return FiltersFragment.newInstance();
				case 2:
					return CardsFragment.newInstance();
			}
			return null;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			switch (position) {
				case 0:
					return "Cards";
				case 1:
					return "Filters";
				case 2:
					return "Map";
			}
			return "";
		}
	}
}