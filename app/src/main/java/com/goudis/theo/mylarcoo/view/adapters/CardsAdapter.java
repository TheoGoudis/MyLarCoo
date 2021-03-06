package com.goudis.theo.mylarcoo.view.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goudis.theo.mylarcoo.R;

public class CardsAdapter extends RecyclerView.Adapter<CardViewHolder> {
	private final int numItems;

	public CardsAdapter(int numItems) {
		this.numItems = numItems;
	}

	@Override
	public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

		View itemView = LayoutInflater.from(viewGroup.getContext())
				.inflate(R.layout.view_holder_card, viewGroup, false);

		return new CardViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(CardViewHolder holder, int position) {

	}

	@Override
	public int getItemCount() {
		return numItems;
	}
}
