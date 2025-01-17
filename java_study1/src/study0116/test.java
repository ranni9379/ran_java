package study0116;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주석- 설명이나 메모, 코드 대기, 등등
		/* 여러줄 주석 - 주석은 프로그램으로 실행되지 않는 부분이다.
		 * 주석안에 코드 작성해도 실행 안된다. 각 코드의 설명을 작성하는 용도
		 * 로 사용 하면 되요
		 * 저장 단축키 - ctrl + s
		 * 주석 단축키 - ctrl +/
		 * 실행 단축키 - ctrl + f11
		 */		 
		//System.out.println("자바 이클립스 테스트");
		
		// 데이터를 사용하려면 변수를 선언 해야 한다.
		// 변수를 선언 할 때는 반드시 데이터 타입을 정해야한다.
		// 변수의 이름은 저장할 데이터에 맞는 의미 있는 이름으로 짓기
		// 타입 먼저나오고 변수 이름이 나와야 한다.
		// 정수 : byte(가장작은거), short, int, long
		// 실수 : float, double
		// 문자 : char 문자 한 자
		// 논리 : boolean 참, 거짓
		// -> 기본데이터 타입
		
		int age;
		age = 100; // 오른쪽에 있는 것을 왼쪽에 저장 // age 변수에 100 저장(대입연산), =: 같다가 아님, 비교연산자가 아님
		age = 27; // 100이 있는 곳에서 27로 덮어쓰기 형태로 이전 데이터형태(100)는 없어짐.
		//age ='가'; // 자바에서 ''표현은 문자를 의미
				  // "" 표현은 문자열 의미 , cf. javascript에서는 "", ''에서도 문자열로 표현
		//System.out.println(27);
		byte num1 =120;
		System.out.println(num1);
		//num1 =130;		
		
		int num2 = 20; //변수를 선언하면서 데이터 저장- 변수 초기화
		int num3 = 43; 
		// num3은 43이다. 라고 하면 안됨 num3과 43이 같다는 표현이라
		// num3에 43을 저장했다, num3에 43을 대입했다. 라고 표현
		
		int sum = num2+num3;
		System.out.println(sum);
		
		
		// 사각형의 너비와 높이 값으로 넓이를 구하세요.
		
//		int area = width * height;
//		int width=20;
//		int height= 30;
       // 코드가 변수 작성순이기 때문에 오류가 뜸.
		
//		int width;
//		int height;
//		int area = width * height;
//		width =20;
//		height =32;
		// 변수에 데이터 값이 없어도 오류가 뜸.
		
		//int width;
		//int height;
		//width =20;
		//height=32;
		//int area = width * height;
		//System.out.println(area);
		
		int blue =20;
		int red =15;
		int white=0;
		//파란컵에 오렌지 주스가 20ml 있다.
		//빨간컵에 딸기주스가 15ml 있다.
		//파란컵에 딸기주스를, 빨간컵에 오렌지 주스를 담으려면 어떻게 해야하는가?
		//blue와 red 값 출력
		//blue=15, red=20 이 방법은 아님
		//섞이지 않게 white를 넣은것
		// 두 변수가 있는 것을 교체하기(위치를 바꾸기) 위해(->정렬) 하나의 변수를 새롭게 넣는다. 
		white = blue;
		blue=red;
		red=white;		
		System.out.println(blue);
		System.out.println(red);
	
		//var a=10;
		//var a=20;
		//javascript에서는 서로 다른 a임 //
		//let c=10;
		//let c=20;
		//javascript에서 let은 재선언이 안되기 때문에 이렇게 쓰면 안됨//
		
		int birthYear =1991;
		// 김철수가 태어난 년도를 birth_year에 저장했다.
		// 올해 나이는?
		//int year=2025;
		//System.out.println(year-birth_year);//
		
		int myAge = 2025 - birthYear;
		System.out.println(myAge);
		
		//변수란 데이터(값)을 저장할 수 있는 메모리 공간
		// 변수의 공간에는 데이터타입에 맞는 데이터만 저장할 수 있게 해줘야 한다.
		// 변수의 선언은 데이터 타입 변수명 (예- int num;)
		// 변수이름은 카멜 표기법이 일반적이다.
		// 변수이름은 변수의 사용목적에 맞는 이름으로 한다.(길어도 됨.)
		
		float fnum = 2.156f;
		//java에서는 실수 데이터를 기입할 때 숫자뒤에f를 넣는다.
		System.out.println(fnum);
		fnum= 2.123456789f;
		System.out.println(fnum);
		// java에서는 float(실수)에서 7자리까지
		double dnum =1.1234567890123456189;
		System.out.println(dnum);
		// java에서 dnum 16자리까지
		
		char ch ='a';
		System.out.println(ch);
		ch = '가';
		System.out.println(ch);
		// java 문자 ch는 '' 문자열(string)은 "" //
		ch =97;
		System.out.println(ch);
		// 십진수로 97은 문자 소문자 a로 표현됨 아스키코드 //
		ch = 'H';
		System.out.println(ch-'A');
		System.out.println(ch-64);
		System.out.println('J'-64);
		System.out.println('가' - 64);
		
		String name="홍길동";
		//java에서 문자열은 string이라는 클래스타입을 사용//
		
		boolean isApple = true; //참, 거짓 값을 가지는 타입 규칙으로 is를 붙여서 사용
		System.out.println(isApple);
		
	}

}
