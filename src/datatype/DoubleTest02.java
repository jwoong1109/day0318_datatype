package datatype;

public class DoubleTest02 {
	public static void main(String[] args) {
		//(1.4*10^-46 ~ 3.4*10^~38) 부동소숫점 방식으로 표현
		float sum=0; 
		//i변수가 0부터 1씩증가하면서 10이되기전까지 {} 반복해라
		for(int i=0 ; i<100 ; i++) {
			//공간=값: 오른쪽에 있는 값을 왼쪽 공간에 넣어라 
			sum = sum + 0.1f;
		}
		System.out.printf("0.1f를 10번 더한결과: %.6f" , sum); //1.0f
	}
}
