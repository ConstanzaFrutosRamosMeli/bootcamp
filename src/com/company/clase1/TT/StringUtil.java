package com.company.clase1.TT;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	public static String replicate(char c,int n)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			result.append(c);
		}
		return result.toString();
	}
	
	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	public static String lpad(String s, int n, char c)
	{
		int charsToAdd = n - s.length();
		return replicate(c, charsToAdd) + s;
	}
	
	// Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		int length = arr.length;
		String[] result = new String[length];
		for (int i = 0; i < length; ++i) {
			result[i] = String.valueOf(arr[i]);
		}
		return result;
	}
	
	// Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int length = arr.length;
		int[] numeros = new int[length];
		for (int i = 0; i < length; ++i) {
			numeros[i] = Integer.parseInt(arr[i]);
		}
		return numeros;
	}
	
	
	// Retorna la longitud del elemento con mayor cantidad 
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLength = 0;
		for (String aux : arr) {
			if (aux.length() > maxLength)
				maxLength = aux.length();
		}
		return maxLength;
	}
	
	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maxLength = maxLength(arr);
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = lpad(arr[i], maxLength, c);
		}
	}
}
