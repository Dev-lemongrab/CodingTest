package seoulSWcodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	//문자열 거꾸로 출력하
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		while((str=br.readLine())!= null){
			String reverse ="";
			for(int i = str.length()-1; i>=0 ;i--){
				reverse += str.charAt(i);
			}
			if(reverse.equals(str))
				System.out.println("YES");
			else
				System.out.println("NO");
			}
		}
}
