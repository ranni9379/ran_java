package review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class review implements Filter{
	private String comment;
	private int rating;
	
	@Override
	public void filterBadWords(String comment) {
		System.out.println("욕설 주의 욕설 필터");
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	};
	
	public int compareTo(review o) {
		return 0;
	};

	



}
