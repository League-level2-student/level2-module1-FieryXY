package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> arr = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
			arr.add("dog");
			arr.add("chocolate");
			arr.add("another thing");
			arr.add("purple");
			arr.add("potato");
		//3. Print all the Strings using a standard for-loop
			for(int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i)+"\n");
				
			}
		//4. Print all the Strings using a for-each loop
			for(String j: arr) {
				
				System.out.println(j+"\n");
				
			}
			
			
		//5. Print only the even numbered elements in the list.
			for(int i = 0; i < arr.size(); i = i+2) {
				System.out.println(arr.get(i)+"\n");
				
			}
		//6. Print all the Strings in reverse order.
			for(int i = arr.size()-1; i >= 0; i--) {
				System.out.println(arr.get(i)+"\n");
				
			}
		
		//7. Print only the Strings that have the letter 'e' in them.
			for(int i = 0; i  < arr.size(); i++) {
				String value = arr.get(i);
				int e = value.indexOf("e");
				
				if(e >= 0) {
					
					System.out.println(arr.get(i)+"\n");
				}
			}
	}
}
