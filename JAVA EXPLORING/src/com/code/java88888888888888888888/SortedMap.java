package com.code.java88888888888888888888;
import com.code.java88888888888888888888.Employe;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class SortedMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		map.put("two", 2);
		map.put("thousand", 1000);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("as", 89);
		
		//System.out.println(map);
		//traditional way of print Map
		
		/*
		 * List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		 * //Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
		 * Collections.sort(entries,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
		 * 
		 * for(Entry<String, Integer> entry:entries) {
		 * System.out.println(entry.getKey()+ " "+entry.getValue()); }
		 */
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("::::::::::::::::::::::::::::::::");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	
	Map<Employe, Integer>	empMap=new TreeMap<>();
		
	empMap.put(new Employe(1, "vikki", "IT", "sangli", 12.3525), 2);
	empMap.put(new Employe(2, "akd", "mech", "sangli", 12.3525), 96);
	empMap.put(new Employe(3, "hggjnghjg", "TeST", "sangli", 152.3525), 36);
	empMap.put(new Employe(4, "loval", "dev", "miraj", 685685635.3525), 98);
	empMap.put(new Employe(5, "ravi", "civil", "kol", 75785687.3525), 23);
	System.out.println("CUSTOM OBJECT SORT BY KEY'S IN CITY");
	empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employe::getCity))).forEach(System.out::println);

	
	
	
	
	
	
	
	
	
	
	}
}
