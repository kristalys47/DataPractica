import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String timeConversion(String s) {
		// 07:05:45PM
		// 0123456789 array index
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int first = 0, second = 0, total = 0;

		if (s.charAt(8) == 'p' || s.charAt(8) == 'P') {
			for (int i = 0; i < numbers.length; i++) {
				if (((Integer) numbers[i]).toString().equals(s.substring(0, 1))) {
					first = numbers[i];
				}
				if (((Integer) numbers[i]).toString().equalsIgnoreCase(s.substring(1, 2))) {
					second = numbers[i];
				}
			}
			total = first * 10 + second+12;
			if (total == 24) {
				return "12" + s.substring(2, 8);
			} 
			else if(total<10){
                
				return "0"+((Integer) total).toString() + s.substring(2, 8);
			}
			else {
				
				return ((Integer) total).toString() + s.substring(2, 8);
			}
		} else {

			if (s.charAt(8) == 'a' || s.charAt(8) == 'A') {
				for (int i = 0; i < numbers.length; i++) {
					if (((Integer) numbers[i]).toString().equals(s.substring(0, 1))) {
						first = numbers[i];
					}
					if (((Integer) numbers[i]).toString().equalsIgnoreCase(s.substring(1, 2))) {
						second = numbers[i];
					}
				}
				total = first * 10 + second+12;
				if (total == 24) {
					return "00" + s.substring(2, 8);
				} 
			}	
			return s.substring(0, 8);
			
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}
