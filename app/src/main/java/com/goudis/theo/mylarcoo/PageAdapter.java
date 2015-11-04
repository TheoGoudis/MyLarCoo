package com.goudis.theo.mylarcoo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PageAdapter extends RecyclerView.Adapter<PageViewHolder> {
	private final int numItems;

	public PageAdapter(int numItems) {
		this.numItems = numItems;
	}

	@Override public PageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

		View itemView = LayoutInflater.from(viewGroup.getContext())
				.inflate(R.layout.list_item_card, viewGroup, false);

		return new PageViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(PageViewHolder holder, int position) {

	}

	@Override public int getItemCount() {
		return numItems;
	}
}
