package com.cap.DAY1;

enum Months {
	January,February,March,April,May,June,July
}
public class Enum {
public static void main(String[]arg) {
	System.out.println(Months.January);
	System.out.println(Months.February);
	System.out.println(Months.March);
	System.out.println(Months.valueOf("April"));
	System.out.println(Months.May);
	System.out.println(Months.June);
	System.out.println(Months.July);

}
}
