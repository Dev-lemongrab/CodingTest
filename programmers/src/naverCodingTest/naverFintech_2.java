package naverCodingTest;
//배열 A자 모양 부분 배열이 몇개 있는지 알아보려 합니다.
public class naverFintech_2 {
	
	
	public static int solution(int[] arr) {
		int answer = 0;
		int cnt=0;
		
		for(int i = 0 ; i<arr.length-1; i++) {
			boolean flag = true;
			for(int j = i+1 ; j<arr.length-2;j++) {
				if(arr[i]>arr[i+1]) {
					continue;
				}else {
					if(arr[j]<arr[j+1]) {
						if(arr[j-1]>arr[j]) {
							flag = false;
						}
						continue;
					}else if(arr[j]>arr[j+1]&&flag==true) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,3,2,4,5,2,1,5,4,2,3,4,5,5,2};
		int[] arr2 = {1,2,3,2,1,4,3,2,2,1};
		int[] arr3 = {1,2,3,2,2};
		System.out.println(solution(arr));
	}
}
