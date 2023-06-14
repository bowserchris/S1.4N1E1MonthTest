package n1e1to3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AppE1MonthTest {

	@Test		//me devuelve 0 el metodo y falla el test pero iniciarlo normal no pasa nada
	void listShouldHave12Months() {
		//todo esto es necesario? pensaba que tenerlo en el main y el metodo solo tengo que llamar con algun parametro?
		/*List<String> months = new ArrayList<>();

		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");	*/
		var monthList = new AppE1Month();
		// or AppE1 monthList = new AppE1();
		//assertEquals(12, months.size());
		assertEquals(12, monthList.checkFullYear(new ArrayList<String>(12)));
		//monthList.checkFullYear(new ArrayList<String>(12)))
	}
	
	@Test		//esto si que funciona facilmente, pero otros dos metodos dan 0 si llamo var monthList = new AppE1Month();
	void listIsNotEmpty() {
		var monthList = new AppE1Month();
		assertNotNull(monthList);
	}

	@Test		//me devuelve 0 el metodo en el test y fall aunque al iniciarlo en el app normal me funciona
	void position7ShouldBeAugust() {
		/*List<String> months = new ArrayList<>();

		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");*/
		var monthList = new AppE1Month();
		assertEquals(7, monthList.indexOfMonth(new ArrayList<String>(12), "August"));
		//);
	}

}


/*
 * Exercise 1

    Create a Java class that inserts the names of the 
    months of the year into an ordered list.
    Verify with jUnit that the list has 12 positions, 
    that it is not null and that position 8 contains 
    the name 'August'.


 * 
 * 
 * */
