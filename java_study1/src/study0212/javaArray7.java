package study0212;

import java.util.Scanner;

public class javaArray7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] board = new int[][]
				{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1} //13줄 15칸
				
				};//[13][15]
				
				int x=0, y=0;
				while(true) {
				
			for(int i=0; i<board.length; i++) {
				for (int k=0; k<board[i].length; k++) {
					if(board[i][k] ==1 )
						System.out.printf("■");
					if(board[i][k] ==0)
						System.out.printf(" ");
					if(board[i][k] ==2) {
						System.out.printf("@");
						x=k; y=i;
				 }
				}
				System.out.println();
			}	// 화면 그리기 반복문 끝
// 이동시키기 w, a, s, d
			System.out.print("방향 입력 : ");
			char key = input.nextLine().charAt(0);
			
			board[y][x]=0; // 현재위치에 0으로 변경
			switch(key) {
			case 'w'://y축 감소- 위로 이동
				if(board[y-1][x] !=1) y--;
				break;
			case 's':// 아래이동 -y축 증가
				if(board[y+1][x] !=1) y++;
				break;
			case 'a':// 왼쪽이동 -x축 감소
				if(board[y][x-1] !=1) x--;
				break;
			case 'd':// 오른쪽 이동 -x축 증가
				if(board[y][x+1] !=1) x++;
				break;
			default:
				System.out.println("잘못입력");
			}
			board[y][x]=2;// 이동할 위치에 2로 변경
			
				}
	}

}
