package JavaCollections;

import java.util.ArrayList;


public class ArrayListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> var = new ArrayList <String> ();
		var.add("Sujan");
		var.add("Kumar");
		var.add("D");
		var.add("Sujan");
		
		for(String value:var) {
			
			System.out.println(value);
		}
		
	}

}
