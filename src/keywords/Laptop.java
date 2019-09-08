package keywords;

public class Laptop extends  Computer {
    int ramSize;

    public Laptop (){
        super(8);
        System.out.println(ramSize);

    }
    public void displaySize(){
        System.out.println("15 inch");
    }

}
