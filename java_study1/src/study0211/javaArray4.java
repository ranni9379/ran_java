package study0211;

import java.util.Arrays;
import java.util.Scanner;

public class javaArray4 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int[] game = new int[25];
		// game배열에 값 채우기
		for(int i=0; i<game.length; i++)
			game[i] = (int)(Math.random()*50+1);
//		System.out.println(Arrays.toString(game));

//		System.out.println("┌────┬────┬───┬───┐");
		// 5줄 5칸 출력
		
		while(true) {
		for(int i=0; i<=4; i++) {
			for(int k=0; k<=4; k++) {
				if(game[i*5+k] == 0)
					System.out.printf(" %2s", "■");
				else
				System.out.printf( " %2d ", game[i*5+k]); //%2d 2자리확보하고 오른쪽 정렬
			}
			System.out.println();
		}
		
		System.out.print("숫자 입력 :");
		int num= scan.nextInt();// 빙고판에 있는 숫자 입력
		for(int i=0; i<game.length; i++) {
			if(game[i] == num) {// 내가 입력한 숫자를 배열에서 찾기}
				game[i]=0;
			}
		}
		}
	}

}
