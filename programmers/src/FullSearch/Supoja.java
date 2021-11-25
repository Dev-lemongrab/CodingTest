package FullSearch;

import java.util.*;

public class Supoja {
	
}

class Solution {
    public int[] solution(int[] answers) {
        
        //수포자들 
        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        //수포자들 맞춘 갯수 추가
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == supoja1[i%supoja1.length])
                cnt[0]++;
            if(answers[i] == supoja2[i%supoja2.length])
                cnt[1]++;
            if(answers[i] == supoja3[i%supoja3.length]) 
                cnt[2]++;
        }
        
        int max = 0;
        
        List<Integer> answerList = new ArrayList<Integer>();    
        //맞춘 최대갯수 구하기
        for(int i = 0 ; i<cnt.length;i++){
            if(max < cnt[i])
                max = cnt[i];
        }
        //최대갯수랑 수포자찍은 갯수랑 같으면 리스트에 맞춰서 1,2,3 추가
        for(int i = 0; i <cnt.length ; i++){
            if(max == cnt[i]) answerList.add(i+1);
        }
        //리스트에서 배열로 빼줌
        int[] answer = new int[answerList.size()];
        for(int i = 0; i <answer.length ; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer; 
        
    }
}
