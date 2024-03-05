package hackerrank.luxoft.vending_machine;

import hackerrank.luxoft.vending_machine.exceptions.InsufficientMoneyException;
import hackerrank.luxoft.vending_machine.exceptions.OutOfStockException;
import hackerrank.luxoft.vending_machine.model.Coke;
import hackerrank.luxoft.vending_machine.model.Drink;
import hackerrank.luxoft.vending_machine.model.Fanta;
import hackerrank.luxoft.vending_machine.model.Sprite;

import java.io.IOException;

import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String arr[];
//        int quantity[] = new int[3], pricePerUnit[] = new int[3], buttonAssigned[] = new int[3];
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter out = new PrintWriter(System.out);
//
//        arr = br.readLine().split(" ");
//        for(int i = 0; i < 3; i++){
//            quantity[i] = Integer.parseInt(arr[i]);
//        }
//
//        arr = br.readLine().split(" ");
//        for(int i = 0; i < 3; i++){
//            pricePerUnit[i] = Integer.parseInt(arr[i]);
//        }
//
//        arr = br.readLine().split(" ");
//        for(int i = 0; i < 3; i++){
//            buttonAssigned[i] = Integer.parseInt(arr[i]);
//        }

        int[] pricePerUnit = {10, 20, 30};
        int[] quantity = {3, 5, 5};
        int[] buttonAssigned = {1, 2, 3};

        int totalNumberOfRequests = 2;
        int buttonPressed = 1;
        int money = 20;

        VendingMachine vendingMachine = new VendingMachine();

        Drink coke = new Coke(pricePerUnit[0], "Coke", quantity[0]);
        Drink fanta = new Fanta(pricePerUnit[1], "Fanta", quantity[1]);
        Drink sprite = new Sprite(pricePerUnit[2], "Sprite", quantity[2]);


        vendingMachine.registerDrink(buttonAssigned[0], coke);
        vendingMachine.registerDrink(buttonAssigned[1], fanta);
        vendingMachine.registerDrink(buttonAssigned[2], sprite);


        out.println("Vending machine set up");

//        int totalNumberOfRequests = Integer.parseInt(br.readLine().trim());
        while (totalNumberOfRequests-- > 0) {
//            arr = br.readLine().split(" ");
//            int buttonPressed = Integer.parseInt(arr[0]), money = Integer.parseInt(arr[1]);
            try {
                ServeDrinkSummary serveDrinkSummary = vendingMachine.dispatch(buttonPressed, money);
                serveDrinkSummary.servedDrink.serveDrink();
                out.println(serveDrinkSummary.servedDrink.getName() + " " + serveDrinkSummary.change);
            } catch (OutOfStockException e) {
                out.println(e.getMessage());
            } catch (InsufficientMoneyException e) {
                out.println("Insufficient money");
            }
        }

        out.flush();
        out.close();
    }
}
