public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item laptop1 = new Item("MacBook Pro", 101, 10, 999.99);
        Item laptop2 = new Item("MacBook Air M2", 102, 5, 1199.99);

        inventory.addLaptop(laptop1);
        inventory.addLaptop(laptop2);
        inventory.updateLaptop(101, 8, 949.99);

        inventory.removeLaptop(102);

        inventory.displayLaptops();
    }
}
