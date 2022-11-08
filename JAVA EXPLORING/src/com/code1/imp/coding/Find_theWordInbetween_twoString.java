package com.code1.imp.coding;

import java.util.Arrays;

public class Find_theWordInbetween_twoString {

	public static void main(String[] args) {
		String s1 = "use cloudtech for learning java";
		String w1 = "cloudtech";
		String w2 = "learning";
		String[] arr1= s1.split(" ");
		System.out.println(Arrays.toString(arr1));
		int len = arr1.length;
		int source=0;
		int destinatio=0;
		for(int i=0;i<len;i++) {
			if(arr1[i].equals(w1)) {
				source=i;
			}
			if(arr1[i].equals(w2)) {
				destinatio=i;
			}
		}
		if(destinatio>source)
			System.out.println(destinatio-source-1);
		else
			System.out.println(source-destinatio-1);
	}
}
