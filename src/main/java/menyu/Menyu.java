package menyu;

public enum Menyu {
    Lunch(1),Drink(2);

    private int number;

     Menyu(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Menyu{" +
                "number=" + number +
                '}';
    }
}
