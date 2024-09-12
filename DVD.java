
public class DVD extends Product{
    private int lenght;
    private String rating;
    private String studio;

    public DVD() {
        number = 0;
        name = "DVD Malam Kedua";
        quantity = 50;
        price = 100000;
        lenght = 100;
        rating = "NC-18";
        studio = "Moreno";
    }

    public void print() {
        System.out.println("Number"+ number);
        System.out.println("Name"+ name);
        System.out.println("quantity"+ quantity);
        System.out.println("Harga"+ price);
        System.out.println("Artist"+ lenght);
        System.out.println("Nama lagu"+ rating);
        System.out.println("Label"+ studio);
    }
}