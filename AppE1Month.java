package n1e1to3;

import java.util.ArrayList;
import java.util.List;

public class AppE1Month {
	
	public static void main(String[] args) {
		
		//los metodos me funcionan aqui pero no en el testing. creo los mismo variables en el test
		//pense que no hacia falta hacer eso y solo meter los parametros?
		
		List<String> months = new ArrayList<>();

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
		months.add("December");		

		System.out.println(checkFullYear(months));

		System.out.println(indexOfMonth(months, "August"));


	}
	
	public int checkFullYear(List<String> months) {
		return months.size();
	}
	
	public int indexOfMonth(List<String> months, String name) {
		int index = 0;
		if (months.size() != 0) {
			while (!months.get(index).equalsIgnoreCase(name) && index < months.size()) {
				index++;
			}
		}
		return index;
	}

}
