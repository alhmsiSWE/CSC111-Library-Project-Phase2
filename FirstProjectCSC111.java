package fahad;

import java.util.Scanner;
public class FirstProjectCSC111 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name1 = "fahad";
		String name2 = "yazeed";
		String name3 = "saif";
		int id1 = 110011001;
		int id2 = 220022002;
		int id3 = 330033003;
		int borrowedFahad = 0;
		int borrowedYazeed = 0;
		int borrowedSaif = 0;
		int returnFahad = 0;
		int returnYazeed = 0;
		int returnSaif = 0;
		int borrowedbook = 0;
		int returnbook = 0;
		float total_fees = 0.0f;
		String Choice_3 = " ";
		char choice_3 = ' ';
		float total_Fahad = 0.0f;
	     float total_Yazeed= 0.0f;
	      float total_Saif = 0.0f;
	      float borrowed_fee=0.5f;
    System.out.println("\t Welcome To King Fahad Library");
    String Choice_1 = " ";
    char choice_1 = ' ';
    do { 
    	System.out.println("1. Login as user account");
    	System.out.println("2. Login as administrator");
    	System.out.println("3. Exit");
    	System.out.print("What you want to do ? Please choose a number: ");
    	Choice_1 = in.next();
    	choice_1 = Choice_1.charAt(0);
    	System.out.println(""); 
    	switch (choice_1) {
    	
    	case '1':
    		borrowedbook = 0;
    		total_Fahad = 0.0f;
    		total_Yazeed = 0.0f;
    		total_Saif = 0.0f;
    		returnbook = 0;
    		
    		System.out.println(" You just have three accounts available ");
    		System.out.println("1. " + name1 + "-" + id1);
    		System.out.println("2. " + name2 + "-" + id2);
    		System.out.println("3. " + name3 + "-" + id3);
    		System.out.print(" Enter the name please: ");
    		String choice_2 = in.next().toLowerCase();
        	System.out.println(""); 
        	
        	if(choice_2.equals(name1) || choice_2.equals(name2) ||choice_2.equals(name3) ) {
        		
        		
        		do {
        			System.out.println("1. Show how many borrowed books for " + choice_2);
        			System.out.println("2. Borrow a book");
        			System.out.println("3. Return a book");
        			System.out.println("4. Summary for what happend");
        			System.out.println("5. Go to main menu");
        			
        			System.out.print("What you want to do ? Please choose a number: ");
        			
        			
        			Choice_3 = in.next();
        			choice_3 = Choice_3.charAt(0);
        			
        			System.out.println("");
        			switch (choice_3) {
        			case '1' : 
        				if (choice_2.equals(name1) ) {
        				System.out.println("The number of borrowed books for " + choice_2 + " is " + borrowedbook); }
        				
        				else if ( choice_2.equals(name2) ) {
        					System.out.println("The number of borrowed books for " + choice_2 + " is " + borrowedbook); 
        					}
        				else {
        					System.out.println("The number of borrowed books for " + choice_2 + " is " + borrowedbook); }
        			    break;
        			
        			case '2' :
        				
        					if (choice_2.equals(name1)) {
        					
        					if (borrowedbook < 5) {
        						System.out.print("Successfully borrowed book ");
        						borrowedbook++;
        						borrowedFahad++; 
        						total_Fahad+=borrowed_fee;
        						System.out.println(borrowedbook);
        						break;
        						
        					}
        					else { 
        						System.out.println("You can not borrow more than 5 books");
        						}
        					}
        					
        					else if (choice_2.equals(name2)) {
        					if (borrowedbook < 5) {
        						System.out.print("Successfully borrowed book ");
        						borrowedbook++;
        						borrowedYazeed++;
        						total_Yazeed+=borrowed_fee;
        						System.out.println(borrowedbook);
        						break;
        					}
        					else { 
        						System.out.println("You can not borrow more than 5 books");
        						}
        					}
        					else if (choice_2.equals(name3)) {
        						if (borrowedbook < 5) {
        							System.out.print("Successfully borrowed book ");
        							borrowedbook++;
        							borrowedSaif++; 
        							total_Saif+=borrowed_fee;
        						System.out.println(borrowedbook);
        						break;
        						
        					}
        					else { 
        						System.out.println("You can not borrow more than 5 books");
        						}
        					}
        			
        				
        				
        			    break;
        			
        			case '3':
        					if (choice_2.equals(name1)) {
        					
        					if (borrowedbook > 0) {
        						System.out.print("Successfully return book ");
        						borrowedbook--;
        						borrowedFahad--; 
        						returnFahad++;
        						returnbook++;
        						System.out.println(returnbook);
        						break;
        						
        					}
        					else { 
        						System.out.println("You have not enough books to return");
        						}
        					}
        					
        					else if (choice_2.equals(name2)) {
        						if (borrowedbook > 0) {
            						System.out.print("Successfully return book ");
            						borrowedbook--;
            						borrowedYazeed--; 
            						returnYazeed++;
            						returnbook++;
            						System.out.println(returnbook);
            						break;
            						
            					}
            					else { 
            						System.out.println("You have not enough books to return");
            						}
        					}
        					else if (choice_2.equals(name3)) {
        						if (borrowedbook > 0) {
            						System.out.print("Successfully return book ");
            						borrowedbook--;
            						borrowedSaif--; 
            						returnSaif++;
            						returnbook++;
            						System.out.println(returnbook);
            						break;
            						
            					}
            					else { 
            						System.out.println("You have not enough books to return");
            						}
        					}
        			
        				
        				
        			    break;
        			
        			case '4' :
        				if (choice_2.equals(name1)) {
        				System.out.println("Summary for what happend:");
        				System.out.println("Books borrowed by " + name1 + " :" + borrowedbook);
        			    System.out.println("Books returned by " + name1 + " :" + returnbook);
        			    System.out.printf("The total fees: %.2f SAR\n", total_Fahad); 
        			    }
        				else if (choice_2.equals(name2) )	{
            				System.out.println("Summary for what happend:");
            				System.out.println("Books borrowed by " + name2 + " :" + borrowedbook);
            			    System.out.println("Books returned by " + name2 + " :" + returnbook);
            			    System.out.printf("The total fees: %.2f SAR\n", total_Yazeed); 
            			    }
        				else if (choice_2.equals(name3) )	{
            				System.out.println("Summary for what happend:");
            				System.out.println("Books borrowed by " + name3 + " :" + borrowedbook);
            			    System.out.println("Books returned by " + name3 + " :" + returnbook);
            			    System.out.printf("The total fees: %.2f SAR\n", total_Saif); 
            			    }
        				
        			    break;
        			    
        			case '5':
        				System.out.println("You are going to exit the menu ...");
        				break;
        				
        			default : 
        				System.out.println("Invalid option, please try again ");
        				
        			}
        		}
        		while ( !Choice_3.equals("5") );
        	
        	}
        	else 
        		System.out.println("Please enter the correct name ");
        	System.out.println("");



    	break;
    	case '2' : // Yazeed work
    		
    		
    		break;
    	case '3' :
    		System.out.println("You are going to logout");
    		break;
    	default : 
    		System.out.println("Invalid option, try again ... ");
    	break;
    	
    	
    	}


    
    	
    }
    while (!Choice_1.equals("3") ) ;
    System.out.println("Thank you, have a nice day!!");
    		
	}

}