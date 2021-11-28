package BigO;

import java.util.ArrayList;
import java.util.List;

public class dd {
	public static int[] solution(String[] record) {
		int sold_cnt = 0;
		int firstcome =0;
		int lastcome = 0;
		//선입선출
		//판매 총 갯수
		for(int i = 0; i<record.length;i++) {
			if(record[i].startsWith("S")){
				String[] s = record[i].split(" ");
				sold_cnt += Integer.parseInt(s[2]);
			}
		}
		//판매 갯수 5
		for(int i = 0; i<record.length;i++) {
			if(record[i].startsWith("P")){
				String[] s = record[i].split(" ");
				int P_cnt = Integer.parseInt(s[2]);
				if(sold_cnt <= P_cnt) {
					firstcome += Integer.parseInt(s[1])*sold_cnt;
					break;
				}else {
					firstcome += Integer.parseInt(s[1])*P_cnt;
					sold_cnt -= P_cnt;
				}
			}
		}
		
		for(int i = record.length -1 ; i >= 0 ;i--) {
			if(record[i].startsWith("P")){
				String[] s = record[i].split(" ");
				int P_cnt = Integer.parseInt(s[2]);
				if(sold_cnt <= P_cnt) {
					lastcome += Integer.parseInt(s[1])*sold_cnt;
					break;
				}else {
					lastcome += Integer.parseInt(s[1])*P_cnt;
					sold_cnt -= P_cnt;
				}
			}
		}
		
		
		
		int[] answer = {firstcome, lastcome};	
		
		
		
		return answer;
	}
	public static void main(String[] args) {
		String[] record = {"P 300 6", "P 500 3", "S 1000 4", "P 600 2", "S 1200 1"};
		for(int i =0; i<2;i++)
			System.out.println(solution(record)[i]);//1500+1200 2700
	}

}
