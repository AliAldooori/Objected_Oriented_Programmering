package inheritance_Method;

public class Shape {
	
	int length ;
	int width ;
	public Shape(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Shape [length=" + length + ", width=" + width + "]";
	}
	

}
