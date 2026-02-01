
//Let's assume the items are laptops

public class Item {
    private String name;
    private int id;
    private int quantity;
    private double price;

    public Item( String name,int id, int quantity, double price){

        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int Quantity){
        this.quantity = Quantity;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
