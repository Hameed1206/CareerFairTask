package org.java.guviprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class GuviTask {
	
	public void reverseString() {
		System.out.println("-------String Programs-------");
		System.out.println("QUE 1 -> Reverse a String");
		String s = "GuviGeek";
		String output = "";
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			output= output+c;
		}  System.out.println(output);
		System.out.println("");
	}
	public void checkIfPalindrome() {
		System.out.println("QUE 2 -> "+"Palindrome Check");
		String s = "rotator";
		String output = "";
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			output= output+c;
		}  System.out.println("Given string "+output);
		if (s.equals(output)) {
			System.out.println(s+" : Given string is palindrome");
		} else {
			System.out.println(s+" : Given string is not a palindrome");
		}System.out.println("");
	}
	public void countAlphabetType() {
		System.out.println("QUE 3 -> "+"Count Vowels and Consonants");
		String s ="education";
		int vowels=0;
		int consonants =0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels++;
			} else {
              consonants++;
			}
		} System.out.println("Count of vowels in "+s+" is "+vowels);
	      System.out.println("Count of consonants in "+s+" is "+consonants);
	      System.out.println("");
	}
	public void stringToInteger() {
		System.out.println("QUE 4 -> "+"String to Integer Conversion");
		String s = "123";
		System.out.println(s+1+" here + operation not performs addition, just adding the number next to string");
		
		int i = Integer.parseInt(s);
		System.out.println(i+1+" here since datatype is int, so + operation performs addition");
		System.out.println("");
	}

	public void duplicatesFromString() {
		System.out.println("QUE 5 -> "+"Remove Duplicates");
		String s = "minimum";
		String output = "";
		//Using LinkedHashSet to print in insertion order
		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			set.add(c);
		}  System.out.println("Characters in set "+set);
		for (Character character : set) {
			output=output+character;
		}System.out.println(output);
		System.out.println("");
	}
	public void checkIfAnagram() {
		System.out.println("QUE 6 -> "+"Anagram Check");
		String s1 = "listen";
		String s2 = "silent";
		String s3 = "Listen";
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();
		char[] cs3 = s3.toCharArray();
		Arrays.sort(cs1);
		Arrays.sort(cs2);
		Arrays.sort(cs3);
		if (Arrays.equals(cs1, cs2)) {
			System.out.println("Both "+s1+" and "+s2+" are anagrams");
		} else {
			System.out.println("Both "+s1+" and "+s2+" are not anagrams");
		} 
		if (Arrays.equals(cs1, cs3)) {
			System.out.println("Both "+s1+" and "+s3+" are anagrams");
		} else {
			System.out.println("Both "+s1+" and "+s3+" are not anagrams");
		}System.out.println("");
	}
	public void countCharacterFrequency() {
		System.out.println("QUE 7 -> "+"Character Frequency");
		String s = "GuviGeek";
		Map<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				Integer count = map.get(c);
				map.put(c, count+1);
			} else {
				map.put(c, 1);
			}
		}System.out.println(map);
		System.out.println("");
	}
	public void removeWhiteSpaces() {
		System.out.println("QUE 8 -> "+"Remove Whitespaces");
		String s = " Guvi Geek IIT Madras !";
		String s1 = s.replace(" ", "");
		System.out.println(s1);
		System.out.println("");
	}
	public void firstNonRepeatedCharacter() {
		System.out.println("QUE 9 -> "+"First Non-Repeated Character");
		String s = "GuviGeek";
		Map<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				Integer count = map.get(c);
				map.put(c, count+1);
			} else {
				map.put(c, 1);
			}
		}
		for (char c: s.toCharArray()) {
			if (map.get(c)==1) {
				System.out.println(c);
				break;
			}
		}System.out.println("");
	}
	public void longestSubString() {
		System.out.println("QUE 10 -> "+"Longest Substring Without Repeating Characters");
		String s = "GuviGeeks";
		String longestSubString = null;
		int lengthOfLongestSubString = 0;
		
		Map<Character, Integer> map = new LinkedHashMap();
		char[] cs = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, i);
			} else {
				i=map.get(c);
				map.clear();
			}
			if (map.size()>lengthOfLongestSubString) {
				lengthOfLongestSubString=map.size();
				longestSubString = map.keySet().toString();
			}
		} System.out.println("longest SubString is "+longestSubString+" and its length is "+lengthOfLongestSubString);
		System.out.println("");
	}
	public void maxAndMinOfArray() {
		System.out.println("-------Array Programs-------");
		System.out.println("QUE 11 -> "+"Find the Maximum and Minimum Elements in an Array");
		int[] irr = {30, 20, 40, 10, 50 };
		int max = irr[0];
		int min = irr[0];
		for (int i = 0; i < irr.length; i++) {
			if (irr[i]>max) {
				max=irr[i];
			} if (irr[i]<min) {
				min=irr[i];
			}
		} System.out.println("Maximum value is "+max+" and Minimum value is "+min);
		System.out.println("");
	}
	public void reverseArray() {
		System.out.println("QUE 12 -> "+"Reverse an Array");
		int[] irr = {2, 4, 5, 7, 8, 9};
		int[] output = new int[irr.length];
		int j = 0;
		for (int i = irr.length-1; i>=0; i--) {
			output[j] = irr[i];
			j++;
		} for (int i : output) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("");
	}
	public void sumOfArray() {
		System.out.println("QUE 13 -> "+"Sum of All Elements in an Array");
		int[] irr = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int i = 0; i < irr.length; i++) {
			sum=sum+irr[i];
		} System.out.println("Sum of array is "+sum);
		System.out.println("");
	}
	public void averageOfArray() {
		System.out.println("QUE 14 -> "+"Average of Elements in an Array");
		int[] irr = {1, 2, 3, 4, 5, 6, 7};
		int sum = 0;
		for (int i = 0; i < irr.length; i++) {
			sum=sum+irr[i];
		} int average = sum/2;
		System.out.println("Average of array is "+average);
		System.out.println("");
	}
	public boolean logicsToCheckifArrayContainsValue(int k) {
		int[] irr = {1, 2, 3, 4, 5, 6, 7};
		for (int i = 0; i < irr.length; i++) {
			if(irr[i]==k) {
				return true;
			}
		} return false;
	}
	public void CheckifArrayContainsValue() {
		System.out.println("QUE 15 -> "+"Check if an Array Contains a Given Value");
		int j=8;
		int l=5;
		boolean containsValue = logicsToCheckifArrayContainsValue(j);
		System.out.println("Arrays contains "+j+" : "+containsValue);
		
		boolean containsValue1 = logicsToCheckifArrayContainsValue(l);
		System.out.println("Arrays contains "+l+" : "+containsValue1);
		System.out.println("");
	}
	public int logicToFindArrayIndex(int k) {
		int[] irr = {1, 2, 3, 4, 5, 6, 7};
		for (int i = 0; i < irr.length; i++) {
			if(irr[i]==k) {
				return i;
			}
		} return -1;
	}
	public void findArrayIndex() {
		System.out.println("QUE 16 -> "+"Find the Index of a Given Value in an Array:");
		int j = 7;
		int l = 8;
		int index = logicToFindArrayIndex(j);
		System.out.println("Index of "+j+" is "+index);
		int index1 = logicToFindArrayIndex(l);
		System.out.println("Index of "+l+" is "+index1);
		System.out.println("");
	}
	public void removeDuplicatesFromArray() {
		System.out.println("QUE 17 -> "+"Remove Duplicates from an Array");
		int[] irr = {1, 2, 2, 1, 3, 4, 5, 4, 5, 3};
		Set<Integer> set = new LinkedHashSet();
		System.out.println("Values in old array");
		for (int i = 0; i < irr.length; i++) {
			int a = irr[i];
			set.add(a);
			System.out.print(a+" ");
		} System.out.println("");
		System.out.println("Values in set "+set);
		int[] output = new int[set.size()];
		int k = 0;
		for (int i : set) {
			output[k]=i;
			k++;
		} System.out.println("Values in new array");
		for (int i : output) {
			System.out.print(i+" ");
		}System.out.println("");
		System.out.println("");
	}
	public void mergeArrays() {
		System.out.println("QUE 18 -> "+"Merge Two Arrays");
		int[] irr = {1, 2, 3, 4};
		int[] jrr = {5, 6, 7, 8};
		int[] output = new int[irr.length+jrr.length];
		int a = 0;
		System.out.println("First Array");
			for (int j = 0; j < irr.length; j++) {
				output[a] = irr[j];
				System.out.print(irr[j]+" ");
				a++;
			}
			System.out.println("");
			System.out.println("Second Array");
			for (int j = 0; j < jrr.length; j++) {
				output[a] = jrr[j];
				System.out.print(jrr[j]+" ");
				a++;
			}
			System.out.println("");
			System.out.println("Merged Array");
		for (int i : output) {
			System.out.print(i+" ");
		}System.out.println("");
		System.out.println("");
	}
	public void findSecondLargestArray() {
		System.out.println("QUE 19 -> "+"Find the Second Largest Element in an Array");
		int[] irr = {10, 20, 50, 40, -40};
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		
		for (int i = 0; i < irr.length; i++) {
			if (irr[i]>max) {
				second_max = max;
				max = irr[i];
			} else if(irr[i] > second_max && irr[i] < max) {
				second_max = irr[i];
			}
		}System.out.println("Second maximum value is "+second_max);
		System.out.println("");
	}
	public void rotateArray() {
		System.out.println("QUE 20 -> "+"Rotate an Array by K Positions");
		int[] irr = {1, 2, 3, 4, 5, 6, 7};
		int h=3;
		for (int i : irr) {
			System.out.print(i+" ");
		}
		reverse_Array(irr, 0, irr.length-1);
		reverse_Array(irr, 0, h-1);
		reverse_Array(irr, h, irr.length-1);
		System.out.println("");
		System.out.println("After reverse operation");
		for (int i : irr) {
			System.out.print(i+" ");
		}
	}
	public void reverse_Array(int[] irr, int right, int left) {
		while(right<left) {
			int newRight = irr[right];
			irr[right]=irr[left];
			irr[left]=newRight;
			right++;
			left--;
		}
	}
	public static void main(String[] args) {
		GuviTask g = new GuviTask();
		g.reverseString();
		g.checkIfPalindrome();
		g.countAlphabetType();
		g.stringToInteger();
		g.duplicatesFromString();
		g.checkIfAnagram();
		g.countCharacterFrequency();
		g.removeWhiteSpaces();
		g.firstNonRepeatedCharacter();
		g.longestSubString();
		g.maxAndMinOfArray();
		g.reverseArray();
		g.sumOfArray();
		g.averageOfArray();
		g.CheckifArrayContainsValue();
		g.findArrayIndex();
		g.removeDuplicatesFromArray();
		g.mergeArrays();
		g.findSecondLargestArray();
		g.rotateArray();
		
		
		
		
		

	}
}
