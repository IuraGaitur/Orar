package com.example.adapters;

import com.example.fragments.CalendarFragment;
import com.example.fragments.HomeFragment;
import com.example.fragments.OrarFragment;
import com.example.fragments.OrarListFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter{

	public TabsAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new HomeFragment();
		case 1:
			// Games fragment activity
			return new CalendarFragment();
		case 2:
			// Movies fragment activity
			return new CalendarFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
