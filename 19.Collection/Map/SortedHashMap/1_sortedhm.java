package Map.SortedHashMap;

import java.util.SortedMap;
import java.util.TreeMap;

class SortedMapMethods {
	
	public static void main(String[] args) {
	
		SortedMap map = new TreeMap();

		map.put("Ind", "India");
		map.put("Ban", "Bangladesh");
		map.put("SL", "SriLanka");
		map.put("Aus", "Australia");
		map.put("Pak", "Pakistan");

		System.out.println(map);

		// subMap(k, k)
		System.out.println(map.subMap("Aus", "Pak"));

	    //  headMap(k)
		System.out.println(map.headMap("Pak"));

		// tailMap(K)
		System.out.println(map.tailMap("Ind"));

		// firstKey()
		System.out.println(map.firstKey());

		// lastKey()
		System.out.println(map.lastKey());

		// keySet()
		System.out.println(map.keySet());

		// values()
		System.out.println(map.values());

		// entrySet()
		System.out.println(map.entrySet());
	}
}
