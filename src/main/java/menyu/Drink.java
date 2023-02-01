package menyu;

public class Drink {
    private String name;
    private String price;

    public Drink() {
    }

    public Drink(String name, String price) {
        this.name = name;
        this.price = price;
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
        return
                "name='" + name + '\'' +
                ", price='" + price ;
    }
}
