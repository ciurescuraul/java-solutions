package hackerrank.luxoft.vending_machine;

import hackerrank.luxoft.vending_machine.exceptions.InsufficientMoneyException;
import hackerrank.luxoft.vending_machine.exceptions.OutOfStockException;
import hackerrank.luxoft.vending_machine.model.Drink;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class VendingMachine {

    private ServeDrinkSummary serveDrinkSummary = new ServeDrinkSummary();
    Map<Integer, Drink> drinkMap = new HashMap<>();

    void registerDrink(int buttonIdx, Drink drink) {
        out.println("Register " + drink + " on btn " + buttonIdx);
        drinkMap.put(buttonIdx, drink);
    }

    public ServeDrinkSummary dispatch(int buttonPressed, int money)
            throws OutOfStockException, InsufficientMoneyException {

        for (Map.Entry<Integer, Drink> drink : drinkMap.entrySet()) {

            if (buttonPressed == drink.getKey()) {
                serveDrinkSummary.servedDrink = drink.getValue();
                int drinkPrice = drink.getValue().getPrice();

                if (money >= drinkPrice) {
                    money -= drinkPrice;
                    serveDrinkSummary.change = money;

                    if (drink.getValue().getQuantityLeft() > 0) {
                        return serveDrinkSummary;
                    } else {
                        throw new OutOfStockException(drink.getValue().getName() + " is out of stock");
                    }
                } else {
                    throw new InsufficientMoneyException();
                }
            }
        }
        return null;
    }
}