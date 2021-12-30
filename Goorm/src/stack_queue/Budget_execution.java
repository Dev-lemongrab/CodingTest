package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Budget_execution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String budget = bf.readLine();
		//활동비 갯수
		int n = Integer.parseInt(bf.readLine());
		//예산을 넘지 않는 최대값 
		int max = 0;
		//활동비 int형 배열에 넣기
		String[] input = bf.readLine().split(" ");
		int[] cost = new int[n];
		for(int i =0 ; i<n ;i++) cost[i] = Integer.parseInt(input[i]);
		
	}

}
