package com.zfw.di04.javaconfig;

public class School {
	private String name;

	public School(String name) {
		super();
		this.name = name;
	}

	public School() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}

}
