package review;

import java.util.ArrayList;

public class Management extends review {
	private ArrayList<review> reviews;
	
	public Management() {
		this.reviews = new ArrayList<>();
	}
	public void addReview(review review) {
		if(review.getRating()<1||review.getRating()>5) {
			System.out.println("오류: 평점은 1~5 사이여야 한다.");
			 return;
		}
		review.getRating();
		reviews.add(review);
	}
	public void sort() {
		System.out.println("정렬되었다!");
	}
}
