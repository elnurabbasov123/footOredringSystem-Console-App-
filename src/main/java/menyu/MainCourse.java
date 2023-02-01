package menyu;

import kitchens.Kitchen;

public class MainCourse {
    private String name;
    private String price;
    private Kitchen kitchen;

    public MainCourse() {
    }

    public MainCourse(String name, String price, Kitchen kitchen) {
        this.name = name;
        this.price = price;
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

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price='" + price ;
    }
}
