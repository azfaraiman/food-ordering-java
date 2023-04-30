package ProjOOP;

import java.util.Scanner;

public class ProjOOP{
	public static void main (String[] args){
		Order o = new Order();                       // To call methods from class Order
		for(int i = 0;i<o.NewOrder.length;i++){      // To differentiate each customer
			Scanner input=new Scanner(System.in);
			o.displayMenu();
		
			int n=i+1;                           // Shown to customer as order number
			int j=0;                             // To differentiate position of item in order list
			int choice;
			do
			{
				System.out.printf("\nThis is your order number: %04d",n);
				System.out.println("\n\n\tPress:\n\t1 - add food\n\t2 - add drink"
						+ "\n\t3 - display current order\n\t4 - delete item"
						+ "\n\t5 - cancel order\n\t6 - confirm order");
				choice = input.nextInt();
				
				switch(choice)               //User input choice to select operation from 1 to 
				{
					case 1:
						o.newOrder(i,j,choice);
						j=j+1;
						break;
					case 2:
						o.newOrder(i,j,choice);
						j=j+1;
						break;
					case 3:
						o.displayOrder(i,j);
						break;
					case 4:
						o.deleteItem(i,j);
						j=j-1;
						break;
					case 5:
						o.cancelOrder(i,j);
						i-=1;
						break;
					case 6:
						o.confirmOrder(i,j);
						break;
				}
			}while(choice!=5&&choice!=6);                    // If customer choose to cancel or
			System.out.println("Thank You!");                // confirm order, escape from do-while
			System.out.println("Have a good day\n\n\n\n");   // loop and runs again with increased 
		}                                                        // order number for another customer
	}
}
