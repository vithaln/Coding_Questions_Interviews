package com.sort.comp;

import java.util.Comparator;

public class NameWiseSort implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
