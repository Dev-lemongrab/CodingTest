package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Match_parentheses {

	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String[] input  = br.readLine().split("");
		Stack<String> st = new Stack<String>();
		boolean answer = true;
		//닫힘괄호로 시작하는 경우 바로 false 출력
		//열림괄호로 시작하는 경우 스택에 계속 넣다가 닫힘괄호가 되는 순간 바로 pop해서 계속 비교
		for(String s : input) {
			if(answer == false) break;
			switch (s) {
			case "(":
				st.push(s);
				break;
			case "{":
				st.push(s);
				break;
			case "[" :
				st.push(s);
				break;
			case ")" :
				if(!("(".equals(st.pop()))) answer = false;
				break;
			case "}" :
				if(!("{".equals(st.pop()))) answer = false;
				break;
			case "]" :
				if(!("[".equals(st.pop()))) answer = false;
				break;
			}
		}
		System.out.println(answer);
	}

}
