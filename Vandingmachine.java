import java.util.Scanner;
public class Vandingmachine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
        
        Item [][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
           { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };
        
         Machine machine = new Machine(items);
         System.err.println(machine);

         while(true){

            System.err.println("pick a row");
            int row = kb.nextInt();

            System.err.println("pick up the spot in the row");
            int spot = kb.nextInt();

             boolean dispensed = machine.dispense(row, spot);
            System.err.println(" \n"+machine);

            if(dispensed == true){
                System.err.println("\n Enjoy your drink! press 1 to purchase another: ");

            }
            else {
                System.err.println(" \n Sorry, we are out of this item! press 1 to purchase another: ");
            }

            if(kb.nextInt() != 1){
                break;
            }
        }       
    }
}