package seoulSWcodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 데이터 갯수 좌표 하나가 주어짐 ex) 10 8 2 -> 10이 데이터 갯수, 8 2가좌표
		// 좌표와 0혹은 1이 주어짐 0은 블루 1은 레드 ex) 6 4 0 -> 6 4는 좌표 0은 블루
		// 거리가 가까운 k개 계산
		// k가 3일때, 블루가 많은지 레드가 많은지 계산
		// k가 5일때, 블루가 많은지 레드가 많은지 계산 
		// 후 갯수까지 같이 출력 
		// 예) BLUE 2 
		//	  RED 3
		
		//일단 좌표가 주어짐
		
		//d (1,2,5,6,3,2,4,5,1);//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] standard = br.readLine().split(" ");
		String xy = "";
		
		int n = Integer.parseInt(standard[0]);
		int x = Integer.parseInt(standard[1]);
		int y = Integer.parseInt(standard[2]);
		ArrayList<Double> listB = new ArrayList<Double>();
		ArrayList<Double> listR = new ArrayList<Double>();
		ArrayList<String> list = new ArrayList<String>();
		
 		
		while(!((xy = br.readLine()).equals(" "))) {
			String[] xxx = xy.split(" ");
			int x1=Integer.parseInt(xxx[0]);
			int	y1=Integer.parseInt(xxx[1]);
			int x3=Integer.parseInt(xxx[2]);
			double d = getDistance(x, y, x1, y1);
			if(x3==0) list.add(d+ " BLUE");
			else list.add(d+" RED");
			
		}
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] ar1 = o1.split(" ");
				double num = Double.parseDouble(ar1[0]);
				String[] ar2 = o2.split(" ");
				double num2 = Double.parseDouble(ar2[0]);
				return num>num2?1:num<num2?-1:0;
			}
		});
		
		int cnt = 0;
		int blue_cnt3 =0;
		int red_cnt3 =0;
		int blue_cnt5 =0;
		int red_cnt5 =0;
		for(String i : list) {
			if(cnt<=2) {
				if(i.contains("BLUE")) blue_cnt3++; 
				else red_cnt3++;
			}
			if(cnt <= 4){
				if(i.contains("BLUE")) blue_cnt5++; 
				else red_cnt5++;
			}
			cnt++;
		}
		if(blue_cnt3>red_cnt3) System.out.println("BLUE "+blue_cnt3);
		else System.out.println("RED "+red_cnt3);
		if(blue_cnt5>red_cnt5) System.out.println("BLUE "+blue_cnt5);
		else System.out.println("RED " + red_cnt5);
	
	
		
	}
	public static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(Math.abs(x1-x),2)+Math.pow(Math.abs(y1-y), 2));
	}

}
