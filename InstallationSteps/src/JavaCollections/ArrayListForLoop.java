package JavaCollections;

import java.util.ArrayList;


public class ArrayListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arl = new ArrayList();
		arl.add(1000);
		arl.add("Sujan");
		arl.add(200);
		arl.add("Kumar");
		arl.add(500);
		arl.add(500);
		
		for(int i=0; i<arl.size(); i++) {
			
			System.out.println(arl.get(i));
		}

	}

}
