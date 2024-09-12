import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        
        String ryu = "";
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner moreno = new Scanner (System.in);

        System.out.println("Mau membeli apa?");
        ryu = moreno.next();

        if(ryu.equalsIgnoreCase("CD")) {
            cd.print();
        }else if(ryu.equalsIgnoreCase("DVD")) {
            dvd.print();


        }
    }
}