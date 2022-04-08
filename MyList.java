package com.capg.day6;
	import java.util.*;
	public class MyList {

		public static void main(String[] args) {
	       ArrayList<Integer> ls =new ArrayList<Integer>();
	       ls.add(10);
	       ls.add(20);
	       ls.add(40);
	       System.out.println(ls);
	       //ls.clear();
	      // System.out.println(ls);
	       ls.remove(0);
	       System.out.println(ls);
	       System.out.println(ls.contains(10));
		}

	}

