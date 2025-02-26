package testMain;

public abstract class Shape { //도형클래스
	protected int width;
	protected int height;
	
	public Shape() {
		
	}
	
	public Shape(int w, int h) {
		this.width =w;
		this.height=h;
	}
	
	public abstract void draw();	
	
	
	

}
