package ProjOOP;

import java.util.Scanner;

//Contains data structure which is array variables and
//methods with detailed system operation to assist class Order
public class FoodDrinks{
	String[][] FoodDrink=new String[][] {{"Nasi Goreng","Char Kuetiau","Bihun Sup","Mee Goreng","Burger","Pizza","Lasagna"},{"Kopi O","Kopi","Teh O","Teh","Sky Juice"}};
	double[][] itemPrice=new double[][] {{5,6,7,6,4,12,15},{2,2.5,1.5,2,0.5}};
		
	String[][] NewOrder=new String[9998][100];
	double[] quantity=new double[100];
	double[] subTotal=new double[100];
	double[] Total=new double[9998];
	
	String[] name=new String[9998];
	String[] phoneNum=new String[9998];
	String[] roomNum=new String[9998];
	String jarak;
	
	Scanner input=new Scanner(System.in);
	
        // To display available menu. Parameter int
	// which to differentiate between food or drink
	public void displayMenu(int which){
		for(int k = 0;k<FoodDrink[which].length;k++){
			int n=k+1;
			System.out.printf("      %d. %-14s   (RM%5.2f)\n",n,
					FoodDrink[which][k],itemPrice[which][k]);
		}
	}
	
        // To register user’s picked item
	// Parameter int i to indicate current order number
	// Parameter int j to indicate current item position
	public void newOrder(int i,int j,int which){

		System.out.println("\nPlease choose what you want to order");
		int fd = input.nextInt();
		fd-=1;
		NewOrder[i][j]=FoodDrink[which][fd];
		System.out.println("\nYou've ordered "+NewOrder[i][j]);
		getQuantity(which,fd,j,i);
	}

        // To asks users to input quantity of current added item
	// Parameter int fd carries user’s input item selection
	public double getQuantity(int which,int fd,int j,int i){
		System.out.println("Enter quantity");
                quantity[j] = input.nextDouble();
                getSubTotal(quantity[j], itemPrice[which][fd],j,i);
                return quantity[j];
	}

        // To calculate and display current item’s subtotal
	public double getSubTotal(double quantity, double itemPrice,int j,int i) {
                subTotal[j] = quantity * itemPrice;
                System.out.printf("\nSubtotal: RM%.2f",subTotal[j]);
                getTotal(subTotal[j],i);
                return subTotal[j];
        }

        // To calculate and display total price of current order number
	public double getTotal(double subTotal,int i) {
                Total[i] = Total[i]+subTotal;
                System.out.printf("\nCurrent total: RM%.2f\n",Total[i]);
                return Total[i];
        }
	
        // Asks users to input their name when they choose food delivery
	public String getName(int i){
		name[i] = input.nextLine();
		return name[i];
	}

        // Asks users to input their room number name when they choose food delivery
	public String getRoomNum(int i){
		roomNum[i] = input.nextLine();
		return roomNum[i];
	}

        // Asks users to input their phone number when they choose food delivery
	public String getPhoneNum(int i){
		phoneNum[i] = input.nextLine();
		return phoneNum[i];
	}

        // Asks users to input their details when they choose food delivery
	public void setDetails(int i){
		jarak = input.nextLine();
		System.out.println("\n\nPlease enter the details;");
		System.out.print("Name        : ");
		getName(i);
		
		System.out.print("Room Number : ");
		getRoomNum(i);
		
		System.out.print("Phone Number: ");
		getPhoneNum(i);
	}
}
