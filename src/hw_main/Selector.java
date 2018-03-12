package hw_main;
import java.util.Scanner;
import java.util.ArrayList;

public class Selector {
	
	public static void main(String[] args){
		boolean turnedOn = true;
		System.out.println("Select 1, 2, or 3. 1: Put X at the end of ArrayList. 2: Remove all Y's from ArrayList. 3: Print the size of ArrayList.  4: End");
		Scanner in = new Scanner(System.in);
		HW_IndexList arr = new HW_IndexList();
		int option = in.nextInt();
		
		while(turnedOn){
			if(option == 1){
				System.out.println("Input what number to add to array");
				int x = in.nextInt();
				arr.add(x);
				for(int i = 0; i < arr.size() ; i++){
					System.out.println(arr.get(i));
				}
			}	
			else if(option == 2){
				System.out.println("Input what number to completely eliminate from the array");
				int x = in.nextInt();
				arr.remove(x);
				for(int i = 0; i < arr.size() ; i++){
					System.out.println(arr.get(i));
				}
			}
			else if(option == 3){
				int arrSize = arr.size();
				System.out.println("The size of the array is: "+arrSize);
			}
			else if(option == 4){
				in.close();
				turnedOn =false;
				System.out.println("Terminating operation");
				break;
			}
			else {
				System.out.println("Invalid number, please select from the available options");
			}
			System.out.println("Awaiting next command, master");
			option = in.nextInt();
		}
		
	}

}
