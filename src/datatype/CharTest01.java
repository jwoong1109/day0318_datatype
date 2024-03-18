package datatype;

public class CharTest01 {

	public static void main(String[] args) {
		//클래스만 대문자로 시작. (메서드,변수는 소문자로 네이밍)
		//변수선언
		/*범위 주석*/ 
		//대입연산자 없이 사용하면 값(공간안에 저장된)
		//등호 기준 왼쪽 대입연산자 있이 사용하면 공간
		char ch1='0'; //한글자만 표현 '' ,
		int num=0; 
		String str1="0"; //String 클래스를 데이터타입으로 사용, 문자열 ""
		
		//문자열과 + 연산은 문자열 결합
		System.out.println("문자타입: " + ch1); //메모리 공간에서 읽어라
		System.out.println("숫자타입: " + (int)ch1); //0~65535, (int)로 캐스팅

	}

}
