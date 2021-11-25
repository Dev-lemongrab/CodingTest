package sort;

import java.util.Arrays;
import java.util.Comparator;

//프로그래머스 가장큰수

public class BiggestNumber {
	
	
	public static void main(String[] args) {
				String answer = "";
			
				int[] numbers = {3, 30, 33, 34,5,9};
		   
		        String[] str = new String[numbers.length];
		    
		        for(int i = 0 ; i < numbers.length ; i++){
		            str[i] = String.valueOf(numbers[i]);   
		        }
		        

		        
		        Arrays.sort(str, new Comparator<String>() {
		        	@Override
		        	public int compare(String o1, String o2) {
		        		return (o2+o1).compareTo(o1+o2); 
		        	}
		        });

		        for(int k = 0 ; k < numbers.length ; k++){
		            answer += str[k];
		        }
		        
		        
		        if(str[0].equals("0")){
		            answer = "0";
		        }
		        System.out.println("23".compareTo("32"));
		        System.out.println(answer);
		       //3,2   23 과  32 비교 -1 내림차순 3,2 그대로
		        
		       
	}
}
