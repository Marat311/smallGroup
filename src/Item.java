public class Item {
    public String name;
    public int price;

    public static String nameOfShop;

    public Item(String name){
        this.name=name;
    }

    public Item(String name, int price){
        this(name);
        this.price= price;
    }
    static {
        nameOfShop = "Stop & Shop";
    }

}
