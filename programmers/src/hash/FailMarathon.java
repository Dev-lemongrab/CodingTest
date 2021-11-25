package hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FailMarathon {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] participant = {"he", "she","he"};
		String[] completion = {"he","she"};
		System.out.println(s.solution(participant, completion));
		
	}
}
class Solution{
	public String solution(String[] participant, String[] completion){
		
		
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String player : participant) {
			map.put(player, map.getOrDefault(player, 0)+1);
		}
		for(String player : completion) {
			map.put(player, map.get(player)-1);
		}
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			if(entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
		
	}
}
