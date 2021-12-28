package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maze44 {
	static int[][] solution = new int[4][4];
	static int[][] maze = new int[4][4];
	static int size = 4;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//2차원 배열
		int[] numbers = new int[16];
		int i =0;
		while(true) {
			int n = br.read()-48;
			if(n==0|| n==1) {
				numbers[i] = n;
				i++;
			}
			if(i==16) break;
		}
		int a = 0;
		for(int j = 0; j < 4; j++) {
			for(int k = 0; k < 4; k++) {
				maze[j][k]=numbers[a];
				a++;
			}
		}
		Maze(0,0);
//		출력
//		for(int j = 0; j < 4; j++) {
//			System.out.println();
//			for(int k = 0; k < 4; k++) {
//				System.out.print(maze[j][k]+" ");
//			}
//		}
		
		for(int j = 0; j < 4; j++) {
			for(int k = 0; k < 4; k++) {
				System.out.print(" "+solution[j][k]+" ");
			}
			System.out.println();
		}
//		초기화 완료
		
	}
	public static void Maze(int x, int y) {
		if(x<0||y<0|| x>size-1||y>size-1) return;
		if(maze[x][y]!=1) return;
		
		solution[x][y]=1;
		Maze(x+1, y);
		Maze(x, y+1);
	}

}
