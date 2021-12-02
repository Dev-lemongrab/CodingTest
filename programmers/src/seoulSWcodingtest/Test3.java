package seoulSWcodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	//너무어렵다... 
	// 좌표가 주어졌을때 만들 수 있는 정사각형 중 가장 넓이가 넓은 정사각형의 넓이를 
	//반올림 해서 소수점 3째자리까지 표시  
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = "";
		String[] xy = new String[n];
		while((s = br.readLine())!= null) {
			for(int i =0; i < n;i++) {
				xy[i] = s;//xy[0] 0 2							
			}
		}//0,1/ 2,3/ 4,5/ 6,7/ 8,9

	}

}
