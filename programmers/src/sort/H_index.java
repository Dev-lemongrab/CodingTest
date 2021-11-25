package sort;
import java.util.*;
public class H_index {

	    public int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.sort(citations);
	        
	        for(int i = 0 ; i < citations.length; i++) {
	        	if(citations.length-i <= citations[i]) {
	        		answer = citations.length-i;
	        		break;//브레이크를 안해주면 계속 간다.
	        	}
	        }
	        return answer;
	    }
	
	    public static void main(String[] args) {
	    	H_index h = new H_index();
	    	int[] citations = {10,11,8,2};//2,8,10,11
	    	System.out.println(h.solution(citations));
	}
}
