package com.goudis.theo.mylarcoo.controller;

import com.goudis.theo.mylarcoo.model.Point;
import com.goudis.theo.mylarcoo.model.Points;

import java.util.ArrayList;

public class ControllerInterface {
	private Points points;


	ControllerInterface() {
		points = new Points();
	}

	public Point getPoint(int id) {
		if (points.isEmpty())
			populatePoints();

		return points.get(id);
	}

	public Points getPoints() {
		return points;
	}

	public ArrayList<String> getImages(int pointId) {
		return points.getImages(pointId);
	}

	public String getProfileImage(int pointId) {
		return points.getProfileImage(pointId);
	}


	private void populatePoints() {

	}

	private void updatePoints() {

	}
}
