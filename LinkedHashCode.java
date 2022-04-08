package com.capg.day6;
 import java.util.LinkedHashSet;

	public class LinkedHashCode {
		
		public static void main(String[] args) {
			
			LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
			set.add(10);
			set.add(20);
			set.add(30);
			set.add(40);
			System.out.println(set);
			
			Object[] arr=set.toArray();
			System.out.println(arr.length);
			for(Object obj:arr)
			{
				System.out.println((Integer)obj);
			}
			
			set.contains(10);
			set.forEach(System.out::println);
			set.size();
			}

	}

