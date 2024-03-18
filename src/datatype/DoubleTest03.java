package datatype;

public class DoubleTest03 {
	public static void main(String[] args) {
		double sum=0;
		for(int i=0;i<1000;i++) {
			sum=sum + 0.1;
		}
		//출력서식 문자 sum을 %.6f에 치환하세요(소숫점 6자리까지 표현)
		System.out.printf("0.1을 10번 더하면? %.6f" , sum);
	}
}
