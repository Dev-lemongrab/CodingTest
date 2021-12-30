package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubblesort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] temp = br.readLine().split(" ");
		int[] arr = new int[temp.length]; 
		for(int i = 0 ; i< temp.length ; i++) arr[i] = Integer.parseInt(temp[i]);
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		int tempVar = 0;
		for(int i = 0; i < arr.length-1 ; i++) {
			for(int j = 0 ; j<arr.length-1-i ; j++) {
				if(arr[j]>arr[j+1]) {//앞이 뒤보다 크면
					tempVar=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tempVar;//값 바꿔주기
				}//4,5,3,1,2 -> 4,3,1,2,5 -> 
			}
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
