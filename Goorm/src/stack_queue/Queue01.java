package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = Integer.parseInt(input);
		String uf = "";
		Queue<String> q = new LinkedList<String>();
		
		
		
		for(int i = 0; i < cnt; i++) {
			if(cnt > 10 ) {
				System.out.println("overflow");
				break;
			}
			String cmd = br.readLine();
			if(cmd.equalsIgnoreCase("e")) {
				String num = br.readLine();
				q.add(num);
			}else if(cmd.equalsIgnoreCase("d")) {
				if(q.peek()==null) uf = "underflow";
				else q.poll();
			}else {
			
				for(int j = 0; j< q.size();) {
					if(q.peek().equals("underflow"))
						System.out.println(q.poll());
					else if(q.size() == 1) 
						System.out.print(q.poll());
					else 
						System.out.print(q.poll()+" ");
				}
				
				break;
			}
		}
		
		System.out.println(uf);
		for(int j = 0; j< q.size();) {			
			if(q.size() == 1) 
				System.out.print(q.poll());
			else 
				System.out.print(q.poll()+" ");
		}
	
		

	}

}
