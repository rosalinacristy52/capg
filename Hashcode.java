package com.capg.day6;
	import java.util.HashSet;

	public class Hashcode {
		public static void main(String[] args) {
			
			HashSet<Integer> set=new HashSet<Integer>();
			set.add(101);
			set.add(202);
			set.add(303);
			set.add(404);
			System.out.println(set);
			
			Object[] arr=set.toArray();
			System.out.println(arr.length);
			for(Object obj:arr)
			{
				System.out.println((Integer)obj);
			}
			
			set.clear();
			set.contains(10);
			set.forEach(System.out::println);
			set.isEmpty();
			set.remove(10);
			set.size();
		}

	}

