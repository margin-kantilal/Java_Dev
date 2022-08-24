import java.util.Random;
import java.util.Scanner;

public class Person{
		
		private String name;
		private int id;
		Random  rand = new Random();
				
		public static int maxCalories = 0;
		public static boolean hasExceedLimit = false;
		public static Scanner sc = new Scanner(System.in);

	public Person(String name) {
		this.name = name;
		 this.id = rand.nextInt(100);
	}
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		 this.id = rand.nextInt();

	}
	public String toString() {
		return "name:  " + name + " id:  " + id;
	}
	
	public void PersonTarget() {
		
		System.out.println("Add your target: ");
		int userCalLimit = sc.nextInt();
		System.out.println("Maxium calories: " + userCalLimit );
		maxCalories = userCalLimit;
		
		while(!hasExceedLimit) {
			CalculateCal(maxCalories);
			
		}
		
		
		
	
//		 while(userCalLimit <= maxCalories){
//			
//			System.out.println("Can eat more");
//			System.out.println("Enter you calories");
//			
//			userCalLimit++;
			
		
	}			
	
		
	
	
	public void CalculateCal(int totalCal) {
	
		int items;
		int amount = 0;
		System.out.println("Number of Item: " );
		items = sc.nextInt();
		System.out.println(items);
	//	int numOfItem[] = new int [items];
		for (int i = 0; i < items; i++) {
			System.out.println("Calories amount: ");			
			int userInput = sc.nextInt();
			amount +=userInput;
			
			if(amount >= maxCalories ) {
				hasExceedLimit = true;
				System.out.println("Can't eat more Total Contained: "+ amount + " Calories");
				break;
			}
			else {
				System.out.println("Can eat more Total Contained: "+ amount + " Calories");
			}
			
		}
		
		
	
	}
	
	
	
	private void getTotalCalories(int max) {
		
	}

	public String addFood(String food) {
		return food;
		
	}
}