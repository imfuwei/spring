package com.zfw.di02.gouzao;

public class School {
	private String name;

	public School() {
		super();

		// spring构造注入，是不需要调用无参构造器的
	}

	public School(String name) {
		this.name = name;
	}

}
