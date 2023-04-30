# Food and Drink Ordering System
This is a Java program for a food and drink ordering system that assists the user in making orders and calculating the cost of their order. The program contains a data structure in the form of array variables and methods with detailed system operation to assist the class Order.

# Usage
This program can be executed by running the main method in the Order class. The program will display a list of available foods and drinks, and prompt the user to input their selection. The user can then choose the quantity of their order, and the program will calculate the cost and display the subtotal and total cost of the order. The program also allows the user to input their name, phone number, and room number for delivery.

# Classes
#### FoodDrinks
The FoodDrinks class contains the data structure and methods used in the food and drink ordering system. The class has the following methods:

- displayMenu(int which): Displays the available menu for food or drink.
- newOrder(int i, int j, int which): Registers the user's picked item.
- getQuantity(int which, int fd, int j, int i): Asks the user to input the quantity of the current added item.
- getSubTotal(double quantity, double itemPrice, int j, int i): Calculates and displays the current item's subtotal.
- getTotal(double subTotal, int i): Calculates and displays the total price of the current order number.
- getName(int i): Asks the user to input their name when they choose food delivery.
- getRoomNum(int i): Asks the user to input their room number when they choose food delivery.
- getPhoneNum(int i): Asks the user to input their phone number when they choose food delivery.
- setDetails(int i): Asks the user to input their details when they choose food delivery.

#### Order
The Order class contains the main method and extends the FoodDrinks class. The class has the following methods:

- displayMenu(): Displays the available menu.
- newOrder(int i, int j, int which): Registers the user's picked item.
- displayOrder(int i, int j): Displays items in the current order number until the current item position.

# Authors
- Nur Hazwani Hanum Binti Samsudin
- Muhammad Luqman Bin Khirulnizam
- Maisarah Binti Alias
- Nur Syazwani Binti Nazaruddin
- Siti Hanisah Binti Lakman
- Wan Azfar Aiman Bin Wan Azmi
# Limitations
This program has the following limitations:

- The program does not provide an option to cancel an order once it has been placed.
- The program does not store data for previous orders.
- The program does not handle payments or credit card processing.
- The program does not have a graphical user interface.
