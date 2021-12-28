package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Prime_number {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//7 -> 1,2,3,4, 5, 6, 7가 들어와야함
		//큐에 1,2,3,4,5,6,7 로 저장
		//1, 2, 3, 4, 7, 5, 6
		//1, 2, 3,
//		double sqrt = Math.sqrt(n);
//		for(int i = 2 ; i <= sqrt ; i++) 
//			if(16%i==0) System.out.println(n+"은 소수가 아닙니다.");
//				System.out.println(n+ "은 소수입니다.");
	
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++) arr[i] = i+1;

	
		boolean[] visited = new boolean[n];
		int[] output= new int[n];

		per(arr, 0, n, output, visited);
		
		
		
//		
//		
//		Queue<Integer> q = new LinkedList<Integer>();
//		int[] printArr = new int[n];
//		for(int i = 1 ; i<= n; i++) q.add(i);
//		
//		
//		int a = q.poll();
//		int test = a+q.peek();
//		double sqrt = Math.sqrt(test);
//		for(int j = 2 ; j <= sqrt ; j++) {
//			if(test%j==0) 
//				if(j <= sqrt) 
//				
//		}

		
//		순열 만들기 
		
//		int n = 3;
//		int[] output = new int[n];
//		int[] arr = {1,2,3}; 
//		boolean[] visited = new boolean[n];
//		per(0, output, arr, visited, n);
//	}
//	
//	public static void per(int depth, int[] output, int[] arr, boolean[] visited, int n) {
//		if(depth == n) {
//			print(output);
//		}
//		
//		for(int i = 0 ; i < n; i++) {
//			if(visited[i] != true) {
//				System.out.print(i+"순 ");
//				visited[i] = true;
//				output[depth] = arr[i];
//				
//				per(depth +1, output, arr, visited, n);
//				visited[i] = false;
//				
//			}
//		}
//		
//		
//	}
//	public static void print(int[] output) {
//		for(int i : output ) System.out.print(i+ " ");
//	}
	}
	public static void per( int[] arr, int depth, int n, int[] output, boolean[] visited) {
	
		if(depth == n) {
			print(output);
			return;
		}
		for(int i = 0 ; i < n; i++) {
			if(visited[i]!=true) {
				visited[i] = true;
				output[depth] = arr[i];
				if(output[0]!=1) break;
				per(arr, depth+1, n, output, visited);
				visited[i] = false;
			}
		}
		
	}
	public static void print(int[] output) {
		boolean flag = true;
		int last = output[0]+output[output.length-1]; 
		int num = 0;
		for(int i = 0; i < output.length-1; i++) {
			num =output[i]+output[i+1];
			for(int j = 2; j<=Math.sqrt(num);j++ ) {
				if(num%j==0) {
					flag = false;
				}
			}
			for(int j = 2; j<=Math.sqrt(last);j++ ) {
				if(last%j==0) {
					flag = false;
				}
			}
		}
		
		if(flag) {
			for(int i = 0; i<output.length; i++) {
				if(i == output.length-1) System.out.print(output[i]);
				else System.out.print(output[i]+" ");
			}
			System.out.println();
		}
	}
	
	
}
