package review;

public interface Filter { 
	public void filterBadWords(String comment);
	int compareTo(review o);

}
