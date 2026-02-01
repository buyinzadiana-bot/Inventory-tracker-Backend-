import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> laptops = new ArrayList<>();

    public void addLaptop(Item laptop) {
        laptops.add(laptop);
        System.out.println("Laptop added to inventory.");
    }

    public void removeLaptop(int id) {
        for (Item laptop : laptops) {
            if (laptop.getId() == id) {
                laptops.remove(laptop);
                System.out.println("Laptop removed.");
                return;
            }
        }
        System.out.println("Laptop not found.");
    }

    public void updateLaptop(int id, int quantity, double price) {
        for (Item laptop : laptops) {
            if (laptop.getId() == id) {
                laptop.setQuantity(quantity);
                laptop.setPrice(price);
                System.out.println("Laptop updated.");
                return;
            }
        }
        System.out.println("Laptop not found.");
    }

    public void displayLaptops() {

        if (laptops.isEmpty()) {
            System.out.println("No laptops in inventory.");
            return;
        }

        for (Item laptop : laptops) {
            System.out.println(
                    "ID: " + laptop.getId() +
                            ", Model: " + laptop.getName() +
                            ", Stock: " + laptop.getQuantity() +
                            ", Price: $" + laptop.getPrice()
            );
        }
    }
}
