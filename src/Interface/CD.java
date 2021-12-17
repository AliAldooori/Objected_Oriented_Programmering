package Interface;

public class CD  implements Ratiall_Item , Displayable{
double price ;
String title ;
String artist ;
public CD(double price, String title, String artist) {
	super();
	this.price = price;
	this.title = title;
	this.artist = artist;
}
@Override
public String toString() {
	return "CD [price=" + price + ", title=" + title + ", artist=" + artist + "]";
}
@Override
public double get_item_price() {

	return this.price;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
@Override
public double discount_price () {

return this.price - ( 0.25 * this.price) ;
}
@Override
public void print(CD cd) {
	
	System.out.println("CD [price=" + price + ", title=" + title + ", artist=" + artist + "]");
}
@Override
public void display() {
	System.out.println(this.storename + "CD [price=" + price + ", title=" + title + ", artist=" + artist + "]");
	
}


}
