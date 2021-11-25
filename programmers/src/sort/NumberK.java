package sort;

import java.util.*;


public class NumberK {
	
	
	    public int[] solution(int[] array, int[][] commands) {
	        int k = 0;
	        int start = 0;
	        int end = 0;
	        int[] answer = new int[commands.length];
	        for(int i = 0 ; i < commands.length ; i++){
	            start = commands[i][0]-1;
	            end = commands[i][1];
	            k = commands[i][2];
	            int[] tmp = new int[end-start];
	            for(int j = 0 ; j < tmp.length ; j++) {
	                tmp[j] = array[start++];
	            }
	            Arrays.sort(tmp);
	            answer[i] = tmp[k-1];
	        }
	        return answer;
	   
	    }
	
}
