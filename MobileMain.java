package com.capg.mymap.mobile;

import java.util.HashMap;

class Mobile {

	String model;
	String color;
	int battery;

	public Mobile(String model, String color, int battery) {
		super();
		this.model = model;
		this.color = color;
		this.battery = battery;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getbattery() {
		return battery;
	}

	public void setbattery(int battery) {
		this.battery = battery;
	}

	public String toString() {
		return "Model:" + this.model + " Color:" + color + " battery:" + battery;
	}

}

public class MobileMain {
	public static void main(String[] args) {
		HashMap<String, Mobile> map = new HashMap<String, Mobile>();

		Mobile m1 = new Mobile("G40", "black", 4500);
		map.put("Motorola", m1);

		Mobile m2 = new Mobile("G60", "white", 5000);
		map.put("Nokia", m2);

		Mobile m3 = new Mobile("13pro max", "Green", 4000);
		map.put("Apple", m3);

		System.out.println("the given mobile details are");
		System.out.println(map);

	}
}
