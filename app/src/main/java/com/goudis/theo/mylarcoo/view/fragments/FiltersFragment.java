package com.goudis.theo.mylarcoo.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goudis.theo.mylarcoo.R;
import com.goudis.theo.mylarcoo.view.adapters.CardsAdapter;

public class FiltersFragment extends Fragment {
	private RecyclerView mRootView;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = (RecyclerView) inflater.inflate(R.layout.fragment_filters, container, false);
		return mRootView;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		initRecyclerView();
	}

	private void initRecyclerView() {
		mRootView.setAdapter(new CardsAdapter(5));
	}

	public static Fragment newInstance() {
		return new FiltersFragment();
	}
}
