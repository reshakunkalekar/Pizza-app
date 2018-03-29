package pizza2;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {

	Pizza newPizza,newPizza1,newPizza2;
	float total;

	@Before
	public void setUp() throws Exception {
		newPizza = new Pizza("BBQ", 100, 2, "Non-Veg");
		newPizza1 = new Pizza("Paneer", 200, 3, "Veg");
		newPizza2 = new Pizza("Chicken TK", 250, 2, "Non-Veg");

		total=total+newPizza.generatePrice()+newPizza1.generatePrice()+newPizza2.generatePrice();
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		//newPizza.displayDetails();
		//newPizza1.displayDetails();
		//newPizza2.displayDetails();
	}


	@Test
	public void testGetPrice() {
		//fail("Not yet implemented");

		System.out.println("_____________________________________________________________________________________");
		System.out.println("\t\t\t	----HOG & HOGGERS----");
		System.out.println("_____________________________________________________________________________________");

		System.out.println("ITEM NAME	----	ITEM TYPE	----	QUANTITY	----	TOTAL AMOUNT");
		System.out.println("-------------------------------------------------------------------------------------");


		float amount=total;
		float gst;
		float grandTotal;
		gst=(amount*8)/100;
		grandTotal=amount+gst;

		newPizza.displayDetails();
		newPizza1.displayDetails();
		newPizza2.displayDetails();

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Total Amount:-								"+total);
		System.out.println("After Applying (8% GST) on total:					"+gst);
		System.out.println("_____________________________________________________________________________________");
		System.out.println("Grand Total:								"+grandTotal);
		System.out.println("_____________________________________________________________________________________");

	}


	@Test
	public void testGetQuantity() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetFinalRate() {
		//fail("Not yet implemented");

	}
}

