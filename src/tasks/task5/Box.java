package tasks.task5;

public class Box {
int length; 
int breadth;
int height;
public Box(int length, int breadth, int height) {
	super();
	this.length = length;
	this.breadth = breadth;
	this.height = height;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}

public int area() {
	return 2*((length*breadth)+(length*height)+(breadth*height));
}
public int volume() {
	return length*breadth*height;
}

}
