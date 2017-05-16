package com.zfw.di03.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Some {
	private String[] names;
	private List<School> schools;
	private Set<String> mySets;
	private Map<String, String> myMap;
	private Properties myproperties;

	public void setNames(String[] names) {
		this.names = names;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public void setMySets(Set<String> mySets) {
		this.mySets = mySets;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public void setMyproperties(Properties myproperties) {
		this.myproperties = myproperties;
	}

	@Override
	public String toString() {
		return "Some [names=" + Arrays.toString(names) + ", schools=" + schools
				+ ", mySets=" + mySets + ", myMap=" + myMap + ", myproperties="
				+ myproperties + "]";
	}
	
}
