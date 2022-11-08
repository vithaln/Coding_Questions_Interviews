package com.sort.comp;

import java.util.Comparator;

public class AdressWiseComp implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getAdress().compareTo(o2.getAdress());
	}

}
