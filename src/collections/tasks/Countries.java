package collections.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Countries {
public static void main(String[] args) {
	Map<String,String> countryCapitalMap=new HashMap<String, String>();
	
	countryCapitalMap.put("India", "New Delhi");
    countryCapitalMap.put("Japan", "Tokyo");
    countryCapitalMap.put("France", "Paris");
    countryCapitalMap.put("Germany", "Berlin");
    
    System.out.println(countryCapitalMap);
   
    System.out.print("\n using forEach\n");
    for (Map.Entry<String, String> map:countryCapitalMap.entrySet()) {
		System.out.println(map.getKey()+" : "+map.getValue());
	}
    System.out.print("\n using Iterator\n");
    Iterator<String> it=countryCapitalMap.keySet().iterator(); 
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    
    for (Map.Entry<String, String> map:countryCapitalMap.entrySet()) {
		System.out.println(map.getKey()+" : "+map.getValue());
	}
    
    System.out.print("\n using Iterator\n");
    Iterator<Map.Entry<String, String>>it2=countryCapitalMap.entrySet().iterator();
    while(it2.hasNext()) {
    	System.out.println(it2.next());
    }
}
}
