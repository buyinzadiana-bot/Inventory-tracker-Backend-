
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> laptops = new ArrayList<>();

    public void addLaptop(Item laptop) {
        laptops.add(laptop);
        System.out.println("laptop added to inventory.");
    }

    public void removeLaptop(int id) {
        for (Item laptop : laptops) {
            if (laptop.getId() == id) {
                laptops.remove(laptop);
                System.out.println("Laptop Removed.");
                return;
            }

        }
        System.out.println("Laptop not found.");
    }
}


