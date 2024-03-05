package hackerrank.luxoft.vending_machine.model;

public class Coke implements Drink {
    private int price;
    private String name;
    private int quantityLeft;

    public Coke(int price, String name, int quantityLeft) {
        this.price = price;
        this.name = name;
        this.quantityLeft = quantityLeft;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getQuantityLeft() {
        return this.quantityLeft;
    }

    @Override
    public void serveDrink() {
        if (this.quantityLeft > 0)
            this.quantityLeft -= 1;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", quantityLeft=" + quantityLeft +
                '}';
    }
}
