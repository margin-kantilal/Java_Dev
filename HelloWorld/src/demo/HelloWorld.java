package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		//Array with fixed size of 5
		int[] intArr = new int[5];	
		
		// For loop
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i * 2;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("For loop: " + intArr[i]);
		}
		
	//For each
		for (int i : intArr) {
			System.out.println("For each: " + i*2);
			
		}
		
	//While loop
		int i = 0;
		while(i<intArr.length) {
			System.out.println("While Loop " + intArr[i]);
			i++;
		}
		
		int j = 0;
		do {
			System.out.println("Do loop: " + intArr[j]);
			j++;
		}
		while (j<intArr.length);
		
		
		//Two 2D array
		int[][] int2DArr = new int[2][2];
		// For loop
				for (int a = 0; a < int2DArr.length; a++) {
					for (int k = 0; k < int2DArr[a].length; k++) {
						int2DArr[a][k] = a * 2;
						
						System.out.println(int2DArr[a][k]);
					}
					System.out.println("\n");
				}
				
				
				//List
/*
				List<String> listName = new ArrayList<String>();
				String value1 = "Alpha";
				String value2 = "Beta";
				String value3 = "Gamma";
				listName.add(value1);
				listName.add(value2);
				listName.add(value3);
				listName.add(value1);
				
				if(listName.containsAll(listName)) {
					System.out.println("Value Found");
					System.out.println(listName.size());

;				}
				System.out.println(listName.toString());
*/
				
				LinkedList<String> linkedList = new LinkedList<String>();
				String value1 = "Alpha";
				String value2 = "Beta";
				String value3 = "Gamma";
				linkedList.add(value1);
				linkedList.add(value2);
				linkedList.add(value3);
				linkedList.add(value1);
				linkedList.add(value2);	
			//	System.out.println(linkedList.toString());
	
				String sampleOutput = "Hi Hello There World How Are You";
				
				// --Sample Output--
				// H: Hello How
				// W : World
				// A: Are
				// Y : You
				
				
				display(formatTheInput(sampleOutput));

	}

	private static void display(String outputString) {
		System.out.println(outputString);
		
		
	}

	private static String formatTheInput(String sampleInput) {
		
		
	      //Step 1: split the string
        String[] seperatedWords = sampleInput.split(" ");
 
        HashMap<String, HashSet<String>> wordDictionary = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
      //Step 2: Extract first Char of each word
        for(int i = 0; i < seperatedWords.length; i++) {
            char firstCharacter = seperatedWords[i].charAt(0);
            HashSet<String> wordSet = wordDictionary.getOrDefault(String.valueOf(firstCharacter), new HashSet<>());
            wordSet.add(seperatedWords[i]);
            wordDictionary.put(String.valueOf(firstCharacter), wordSet);
        }
        
        for (String key : wordDictionary.keySet()) {
            sb.append(key + " : ");
            for(String value : wordDictionary.get(key)) {
                sb.append(value + " ");
            }
            sb.append("\n");
        }
 
        
        
		String StringToReturn = " ";
		HashMap<Character, String> table = new HashMap<Character, String>();
		String[] arrOfStr = sampleInput.split(StringToReturn);
		  

       
	
        for (String s: arrOfStr) {
        	
        		String word = table.get(s.charAt(0)); //Getting the index 
        		
        		if(word == null) {
        			table.put(s.charAt(0), s);
        		}else {
        			table.put(s.charAt(0), word + " " + s);
        		}
        }
        		
        		for(Map.Entry<Character, String> entry: table.entrySet()) {
        			StringToReturn = StringToReturn + entry.getKey() + ": " + entry.getValue() + "\n";
        		}
        		
        		
      //  System.out.println(table);
        
      
        
        
		
        return  StringToReturn;


		
		
	}

	

}
