package menyu;

import kitchens.Kitchen;

public class Dessert {
    private String name;
    private String price;
    private Kitchen kitchen;

    public Dessert(){}

    public Dessert(String name, String price,Kitchen kitchen) {
        this.name = name;
        this.price = price;
        this.kitchen=kitchen;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price='" + price;
    }
}
