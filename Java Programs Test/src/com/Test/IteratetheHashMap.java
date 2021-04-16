package com.Test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IteratetheHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> info = new HashMap<>();
		info.put(14861, "Raman");
		info.put(14862, "Jesse Pinkman");
		info.put(14863, "Hanks");
		info.put(14864, "Alpha");
		info.put(14864, "Walter White");
		info.put(14865, "Rishi");

		// Iterate The Value Using Entry Set Method
		Set<Entry<Integer, String>> entrySet = info.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("Employee ID and Names  " + entry.getKey() + " " + entry.getValue());

		}
		System.out.println(" ");
		// find the size
		int size = info.size();
		System.out.println("Size Of Given Elements " + size);

		System.out.println(" ");

		// To Print Alone Key Only
		Set<Integer> keySet = info.keySet();
		System.out.println("KeySet method :" + keySet);

		System.out.println(" ");
		boolean containsKey = info.containsKey(14861);
		System.out.println("TO check Values There or Not :" + containsKey);

		System.out.println("  ");
		boolean remove = info.remove(2, "Rishi");
		System.out.println("Remove the Element :" + remove);

		// To Change Value Alone
		boolean replace = info.replace(4, "Hanks", "TomHanks");
		System.out.println("Replaced The Value " + replace);

		// To check with putIfAbscent Method
		System.out.println(" ");
		String putIfAbsent = info.putIfAbsent(12862, "Jesse Pinkma");
		System.out.println("putIfAbsent Method " + putIfAbsent);
	}
}
