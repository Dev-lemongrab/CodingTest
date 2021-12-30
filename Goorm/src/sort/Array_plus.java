package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Array_plus {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] n = br.readLine().split(" ");
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		
		int[] newArr = new int[Integer.parseInt(n[0])+Integer.parseInt(n[1])];

		for(int i = 0; i< a.length ; i++) {
			newArr[i] = Integer.parseInt(a[i]);
		}
		for(int i = 0, j = a.length ; i<b.length ; i++, j++) {
			newArr[j] = Integer.parseInt(b[i]);
		}
		Arrays.sort(newArr);
		for(int i =0; i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}

}
