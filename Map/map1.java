package Map;
import java.util.*;
public class map1 {
	public static void main(String[] args) {
		// both are same  process ,but see synchronized or not
		System.out.println("--------hashmap-------");
		Map<String, Integer>map=new HashMap<>();//not synchronized
		map.put("vicky",34);
		map.put("ram", 98);
		map.put("hari",67);
		map.put("rooban",99);
		for(String d:map.keySet())
		{
			System.out.println(d+" : "+map.get(d));
		}
		
		System.out.println("--------hashtable-------");

		Map<String, Integer>m=new Hashtable<>();//synchronized when we use multiple threads it's better
		m.put("vicky",34);
		m.put("ram", 98);
		m.put("hari",67);
		m.put("rooban",99);
		for(String d:map.keySet())
		{
			System.out.println(d+" : "+map.get(d));
		}
	}
}
