package com.globallogic.training.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


//nested HashMap
public class MapImpl {
	public static void main(String[] args) {
		Map<String,Map<Character,Integer>> outerMap = new HashMap<>();
		
		//Method 1 of adding String as key and Map as value
		//Creating a map
		Map<Character, Integer> innerMap1 = new HashMap<>();
		innerMap1.put('B',66);
		//Adding existing map
		outerMap.put("InnerMap1", innerMap1);
		
		//Method 2 of adding String as key and Map as value
		//Directly adding new object as value
		outerMap.put("InnerMap2", new HashMap<>());
		
		//Adding Value to Inner HashMap
		outerMap.get("InnerMap1").put('A',65);
		outerMap.get("InnerMap1").put('a',97);
		
		outerMap.get("InnerMap2").put('$', 34);
		
		
		//fetching an inner map
		String key = "InnerMap2";
		//initializing the variable of inner map data-type
		Map<Character, Integer> fetchedMap2=new HashMap<>();;
		if(outerMap.containsKey(key))
			fetchedMap2 = outerMap.get(key);
		System.out.println("FetchedMap:");
		System.out.println(fetchedMap2);
		System.out.println();
		
		//Fetching every entry
		
		//Method 1
		System.out.println("Inner Map 1:");
		Map<Character, Integer> innerMap = outerMap.get("InnerMap1");
		for(char charKey: innerMap.keySet()) {
			System.out.println("Key: "+charKey+", Value:"+innerMap.get(charKey));
		}
		System.out.println();

		//Method 2: EntrySet of keys and value
		System.out.println("Outer Map:");
		System.out.println();
		for(Entry<String, Map<Character,Integer>> entry: outerMap.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
			System.out.println();
		}
		
	}
}