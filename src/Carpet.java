public class Carpet {

    public String color;
    public int size;
    public double price;

    public static boolean isPersian;

    public Carpet(String color){
        this.color=color;
    }

    public Carpet(String color, int size){
        this(color);
        this.size=size;
    }

    public Carpet(String color, int size, double price){
        this(color, size);
        this.price=price;
    }

    static{
        isPersian = true;
    }

}
