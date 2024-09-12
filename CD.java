//subclass

import java.util.Scanner;

public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        number = 10;
        name = "CD Selamat Malam";
        quantity = 100;
        price = 20000.0;
        artist = "Moreno";
        totalSong = 50;
        label = "Sony Music";
    }
    public void print() {
        System.out.println("Number"+ number);
        System.out.println("Name"+ name);
        System.out.println("quantity"+ quantity);
        System.out.println("Harga"+ price);
        System.out.println("Artist"+ artist);
        System.out.println("Nama lagu"+ number);
        System.out.println("Label"+ label);

        
    }
    
}