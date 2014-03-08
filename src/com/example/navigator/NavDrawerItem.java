package com.example.navigator;

public class NavDrawerItem {

	private String text;
	private int icon;
	private String count;
	private boolean isCounterVisible = false;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public boolean isCounterVisible() {
		return isCounterVisible;
	}
	public void setCounterVisible(boolean isCounterVisible) {
		this.isCounterVisible = isCounterVisible;
	}
	
	public NavDrawerItem(){}

	public NavDrawerItem(String text, int icon) {
		super();
		this.text = text;
		this.icon = icon;
	}

	public NavDrawerItem(String text, int icon, String count,
			boolean isCounterVisible) {
		super();
		this.text = text;
		this.icon = icon;
		this.count = count;
		this.isCounterVisible = isCounterVisible;
	}
	
	
	
}
