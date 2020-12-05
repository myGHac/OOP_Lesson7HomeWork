package additional_task;

public enum Vehicles {
    BMW(50000), Mitsubishi(25000), Subaru(30000), Toyota(100000);

    private int price;
    private String color;

//    Vehicles() {
//    }

    Vehicles(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
    return color;
    }

    public int getPrice() {
        return price;
    }

     @Override
    public String toString(){

    return this.name() + ": " + " color: " + this.getColor() + ",  price: " + this.price ;
    }
}
