package com.capg.mymap.mobile;
	import java.util.Hashtable;
	import java.util.Map;
	import java.util.Set;
	
    public class MyMap {

		public static void main(String[] args) {
			Hashtable<Integer,String> map=new Hashtable<Integer,String>();
			
			map.put(1001, "Deepak");
			map.put(1002, "Pooja");
			map.put(1003, "Rishi");
			
			System.out.println(map.get(1003));
			
			Set<Integer> keys=map.keySet();
			for(Integer key:keys) {
				System.out.println("key " + key +" value "+ map.get(key));
				
				map.clear();
				
				System.out.println(map.contains("Deepak"));
				
				System.out.println(map.containsValue("Deepak"));
				
				Set<Map.Entry<Integer,String>> Key=map.entrySet();
				for(Map.Entry<Integer,String> m:Key) {
					System.out.println(m.getKey()+"value is"+m.getValue());
				}
				
				
			}
			

		}

	}

