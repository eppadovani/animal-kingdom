package com.company;

public abstract class Animal {
	private String name;
	private String filo;
	private String category;
	private boolean isEating;

	public Animal(String name, String filo, String category, boolean isEating) {
		this.name = name;
		this.filo = filo;
		this.category = category;
		this.isEating = isEating;
	}

	public boolean isEating() {
		return isEating;
	}

	public void setEating(boolean eating) {
		isEating = eating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public abstract void locomover();
	public abstract void speak();
	public abstract void info();
}
