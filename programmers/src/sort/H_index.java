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
	    	int[] citations = {10,11,8,2};
	    	//지우기
	    	int max=0;
	    	for(int i = 0; i<citations.length;i++) {
	    		if(max<citations[i]) {
	    			max = citations[i];
	    		}
	    	}
	    	List<Integer> a = new ArrayList<Integer>();
	    	a.add(1);
	    	a.size();
	    
	    	//여기까지
	    	System.out.println(h.solution(citations) +" " +max);
	}
}
