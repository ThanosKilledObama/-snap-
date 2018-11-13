package comsci20;

import java.util.ArrayList;

public class arraylist {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> listOfInts = new ArrayList<>(); //useful method of ArrayList
		
		listOfInts.add(98); //adding to ArrayList
		listOfInts.add(55); //adding to ArrayList
		listOfInts.add(1, 80); //inserts to index 1 in this case
		listOfInts.remove(0); //remove item at first index
		listOfInts.get(0); //returns item at index 0
		listOfInts.size(); //returns size of ArrayList
		
		//print arrayList
		listOfInts.add(98);
		listOfInts.add(24);
		
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		
		listOfInts.remove(listOfInts.size()-1); //removes last element
		//print new arrayList
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		
	}

}
