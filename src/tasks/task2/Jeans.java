package tasks.task2;

public class Jeans {
private String brand;
private Color color;
private int price;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}



public Jeans(String brand, Color color, int price) {
	super();
	this.brand = brand;
	this.color = color;
	this.price = price;
}
@Override
public String toString() {
	return "Jeans [brand=" + brand + ", color=" + color + ", price=" + price + "]";
}



}
