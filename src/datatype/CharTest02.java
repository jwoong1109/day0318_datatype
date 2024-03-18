package datatype;
import java.io.IOException;
//java.lang.* : 
import java.util.Scanner;

public class CharTest02 {
	public static void main(String[] args) throws IOException {
		//
		Scanner sc = new Scanner(System.in);
		//클래스 : 변수, 메서드(방법/기능), 생성자
		
		int readData; //read()메서드는 int형으로 리턴해주기 때문에 int로 변수 할당
		//readData=System.in.read(); //키보드에서 읽는 기능 (클래스.변수.메서드)
		//System.out.print(readData); //아스키코드로 출력
		
		readData = sc.nextInt();
		System.out.print(readData);
		
	}
}
