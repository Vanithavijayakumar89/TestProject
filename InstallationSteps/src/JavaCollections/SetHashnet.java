package JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class SetHashnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> values = new HashSet<String> ();
		
		values.add("Sujan");
		values.add("Kumar");
		values.add("1");
		values.add("100");
		values.add("100");
		values.add("D");
		values.add("D");
		
		for(String output:values) {
			
			System.out.println(output);
		}

	}

}
