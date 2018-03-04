public class MyUtilities {
    private int x;
    private String name;

    public MyUtilities() {
        x = 100;
        name = "initialized";
    }

    public void show() {
        System.out.println("\tValue is : " + x + "\n\tname is : " + name);
    }
}
