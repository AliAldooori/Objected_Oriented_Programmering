package Interface;

public class Ratiallitem_main {

	public static void main(String[] args) {

		
		CD cd = new CD(500, "Beaveheart", "mil gibson") ;
		
	System.out.println(cd.get_item_price());	
	
	cd.print(cd);
	System.out.println(cd.discount_price());
	
	Ratiall_Item r1 = new CD(350, "Zoro","Antonio Bandiras") ;
System.out.println(r1.discount_price());	
System.out.println(r1.get_item_price());
	Displayable d1 = new CD(750, "Lion Heart", "VanDam");
	d1.display();
	
	
	}

}
