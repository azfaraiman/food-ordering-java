package ProjOOP;

import java.util.Scanner;

//Contains method user’s selection of operation assisted by class FoodDrinks
public class Order extends FoodDrinks{
	int deletem;
	int DelPick;

	Scanner input=new Scanner(System.in);

        // To display available menu
	public void displayMenu(){
		System.out.println("      Welcome to Tun Fatimah Cafe");
		System.out.println("---------------------------------------");
		System.out.println("-----------------Foods-----------------");
		super.displayMenu(0);
		System.out.println("---------------------------------------");
		System.out.println("-----------------Drinks----------------");
		super.displayMenu(1);
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
	}

        // To register user’s picked item
	// Parameter int i to indicate current order number
	// Parameter int j to indicate current item position
	// Parameter int which to differentiate between food or drink
	public void newOrder(int i,int j,int which){
		which-=1;
		switch(which)
		{
		case 0:
			super.newOrder(i,j,which);
			break;
		case 1:
			super.newOrder(i,j,which);
			break;
		}
	}
	
        // To display items in current order number (int i)
	// until current item position (int j)
	public void displayOrder(int i,int j){
		int n=i+1;
		System.out.printf("\n\tCurrently in Order Number %04d:",n);
		for(int k = 0;k<j;k++){
			n=k+1;
			System.out.printf("\n\t%d. %-12s x%.0f  (RM%.2f)",n,NewOrder[i][k],quantity[k],subTotal[k]);
		}
		System.out.printf("\n\n\tTotal RM%.2f\n",Total[i]);
	}
	
        // For users to delete one item from current order (int i)
	// Data array related to selected item (int deletem) will be converted into
	// next index of item position (int j) and so on
	public void deleteItem(int i,int j){
		displayOrder(i,j);
		System.out.println("\nEnter the item number you want to delete");
		deletem = input.nextInt();
		deletem = deletem-1;
		NewOrder[i][deletem]=NewOrder[i][deletem+1];
		Total[i] = Total[i] - subTotal[deletem];
		for(int k = deletem;k<j;k++){
			NewOrder[i][k]=NewOrder[i][k+1];
			subTotal[k] = subTotal[k+1];
			quantity[k] = quantity[k+1];
		}
		
		NewOrder[i][j]="null";
	}
	
        // For users to cancel current order (int i)
	// Nullify all data array related to current order
	public void cancelOrder(int i,int j){
		for(int k = 0;k<j;k++){
			NewOrder[i][k]="null";
			quantity[k]=0;
			subTotal[k]=0;
		}
		Total[i]=0;
		System.out.println("\nOrder cancelled");
	}
	
        // For users to confirm current order (int i)
	// Users will be asked to either dine-in, self-pickup or delivery
	public void confirmOrder(int i,int j){
		System.out.println("\nOrder confirmed");
		System.out.println("Dine-in, Self-pickup or Room delivery\n" + "1 for Dine-in\n2 for Self-pickup\n3 for Room delivery");
		DelPick = input.nextInt();
		String jarak = input.nextLine();
		
		switch(DelPick)
		{
		case 1:
			System.out.println("Please wait for the screen to show your Order Number");
			displayOrder(i,j);
			break;
		case 2:
			System.out.println("Please wait for the screen to show your Order Number");
			displayOrder(i,j);
			break;
		case 3:
			super.setDetails(i);
			displayOrder(i,j);
			System.out.println("\nPlease prepare the " + "appropriate amount of cash to pay");
			break;
		}
	}
}