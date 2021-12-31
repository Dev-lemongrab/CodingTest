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
			boolean flag = true;//정렬이 완료되면 반복문을 끝낼 표식
			for(int j = 0 ; j<arr.length-1-i ; j++) {
				if(arr[j]>arr[j+1]) {//앞이 뒤보다 크면
					tempVar=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tempVar;//값 바꿔주기
					flag = false;//한번이라도 자리교환을 해주면 아직 정렬이 안된것..	
				}
			}
			if(flag) break;//한번도 자리교환을 안해주면 그대로 true일것. 그럼 종료
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
