package com.company.clase1.TT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort
{
	private static void fillRadixMap(Map<Character, List<String>> radixMap, String[] strArray, int step) {
		for (String s : strArray) {
			Character currentDigit = s.charAt(s.length() - 1 - step);
			List<String> aux = radixMap.getOrDefault(currentDigit, new ArrayList<>());
			aux.add(s);
			radixMap.put(currentDigit, aux);
		}
	}

	private static void resetRadixMap(Map<Character, List<String>> radixMap) {
		for (int i = 0; i < 10; ++i) {
			radixMap.put(Character.forDigit(i, 10), new ArrayList<>());
		}
	}

	private static void radixStep(Map<Character, List<String>> radixMap, String[] strArray) {
		int arrayIndex = 0;
		for (int i = 0; i < 10; ++i) {
			for (String s: radixMap.get(Character.forDigit(i, 10))) {
				strArray[arrayIndex] = s;
				arrayIndex ++;
			}
		}
	}

	public static int[] radixSort(int []arr)
	{
		String[] strArray = StringUtil.toStringArray(arr);
		StringUtil.lNormalize(strArray, '0');

		Map<Character, List<String>> radixMap = new HashMap<>();
		resetRadixMap(radixMap);
		int maxLength = StringUtil.maxLength(strArray);
		for (int i = 0; i < maxLength; ++i) {
			fillRadixMap(radixMap, strArray, i);
			radixStep(radixMap, strArray);
			resetRadixMap(radixMap);
		}

		return StringUtil.toIntArray(strArray);
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		arr = radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
