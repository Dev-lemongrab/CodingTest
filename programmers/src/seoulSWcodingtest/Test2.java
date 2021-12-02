package seoulSWcodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
		//등차수열인지 등비수열인지 확인해서 빈 값 출력해주기
		
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] StringArr = input.split(" ");
		int[] arr = new int[StringArr.length];
		//숫자배열로 바꿔주기 
		for(int i = 0 ; i < StringArr.length; i++){
			arr[i] = Integer.parseInt(StringArr[i]);
		}
		//등차인지 등비인지 확인할 변수
		boolean arithmetic=false;
		boolean geometric=false;
		//총 수
		int N = arr.length;
		//빈 값
		int emptyNum = 0;
		//등비,등차 값
		int d =0;
		for(int i = 0; i < N; i++) {
			if(arr[i]== -1) {
				emptyNum=i;
				break;
			}
		}
		
		for(int i =0 ; i < N-2 ; i++) {
			if(arr[i]== -1 && i!=2) {
				continue;
			}else if (arr[i] == -1 &&i==2) {
				if(arr[1]-arr[0]==arr[4]-arr[3]) {
					emptyNum=i;
					arithmetic = true;
					d=arr[1]-arr[0];
					break;
				}else if(arr[1]/arr[0] == arr[4]/arr[3]){
					geometric = true;
					d=arr[1]/arr[0];
					break;
				}
			}else {
				if(arr[i+1]-arr[i]==arr[i+2]-arr[i+1]) {
					arithmetic = true;
					d=arr[i+1]-arr[i];
					break;
				}else if(arr[i+1]/arr[i] == arr[i+2]/arr[i+1]){
					geometric = true;
					d=arr[i+1]/arr[i];
					break;
				}
			}
		}
		if(arithmetic) {
			if(emptyNum<4)
				arr[emptyNum] = arr[emptyNum+1]-d;
			else 
				arr[emptyNum] = arr[emptyNum-1]+d;
		}else {
			if(emptyNum<4)
				arr[emptyNum] = arr[emptyNum+1]/d;
			else 
				arr[emptyNum] = arr[emptyNum-1]*d;
			
		}		
		System.out.println(arr[emptyNum]);
	}
		
}
