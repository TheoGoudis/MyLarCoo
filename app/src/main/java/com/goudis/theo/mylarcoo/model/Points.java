package com.goudis.theo.mylarcoo.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Points extends HashMap<Integer, Point> {

	public ArrayList<String> getImages(int pointId) {
		ArrayList<String> images = new ArrayList<>();
		Point point = this.get(pointId);

		if (!point.getHighResImageUrl1().isEmpty())
			images.add(point.getHighResImageUrl1());
		if (!point.getHighResImageUrl2().isEmpty())
			images.add(point.getHighResImageUrl2());
		if (!point.getHighResImageUrl3().isEmpty())
			images.add(point.getHighResImageUrl3());
		if (!point.getHighResImageUrl4().isEmpty())
			images.add(point.getHighResImageUrl4());
		if (!point.getHighResImageUrl5().isEmpty())
			images.add(point.getHighResImageUrl5());

		return images;
	}

	public String getProfileImage(int pointId) {
		return this.get(pointId).getProfileImage();
	}

}
