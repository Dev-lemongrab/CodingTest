package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		Stack<String> st = new Stack<String>();
		String[] printArr = {};
		
		for(int i = 0; i < cnt ; i++) {
			String cmd = br.readLine();
			switch (cmd) {
			case "0" :
				if(st.size()==10) st.push("overflow\n");
				else st.push(br.readLine());
				break;
			case "1" :
				if(st.size()==0) st.push("underflow\n");
				else st.pop();
				break;
			default : 
				cnt = i;
				break;
			}
		}
		printArr = new String[st.size()];
		for(int i = st.size()-1 ; i >= 0 ; i--) printArr[i] = st.pop()+" ";
		for(int i = 0 ; i < printArr.length ; i++) {
			System.out.print(printArr[i]);
		}
	}

}
