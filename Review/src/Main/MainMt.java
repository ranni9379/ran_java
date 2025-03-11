package Main;

import review.Management;
import review.review;

public class MainMt {

	public static void main(String[] args) {
		Management management = new Management();
		
		management.addReview(new review("좋은 제품이에요.", 5));
		management.addReview(new review("괜찮은 품질입니다.",4)); // 유효한 메시지 출력
		
		
		management.addReview(new review("별로에요.", 0));
		management.addReview(new review("최악이에요.",6)); // 오류 메시지 출력
		
		management.sort();
		

	}

}
