package study0211;

public class JavaHomework {

	public static void main(String[] args) {
//		과제
//		랜덤범위 1~50까지 
//		랜덤 숫자 중에서 짝수 15개를 배열에 저장
//		15개 전부 저장되면 배열 출력하시오.
//		숫자 중복 상관없음
		int [] num = new int[15];
		int idx =0;
		while(true) {
			int temp = (int)(Math.random()*50+1);
			if(temp%2==0) { //2나누기 했을때 나머지가 0이면 짝수
				boolean isSame= false; // 같으면 true, 다르면 false
				for(int i=0; i<idx; i++) {
					if(num[i] == temp) {
						isSame=true;						
					}			
			}if(!isSame)
				num[idx++] = temp; 
			if(idx == num.length)break; // idx의 값이 배열크기와 같으면 배열의 마지막공간까지 데이터 저장완료
		}
		
		}
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
	}
}
	

