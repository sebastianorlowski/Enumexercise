import java.awt.*;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        boolean appOn = true;
        Scanner scan = new Scanner(System.in);

        for(TshirtSize tshirtSize : TshirtSize.values()) {
            System.out.println("T shirt: " + (tshirtSize.ordinal()+1) + ". " + tshirtSize.name() + ", " + tshirtSize.getHeight() + ", " + tshirtSize.getChestLength() + ", " + tshirtSize.getWaistLength());
                    }

        while(appOn) {
            String size;
            System.out.println("Please give my name of size");
            System.out.println("You can choose XS, S, M, L, XL");
            System.out.println("Please enter 0 if you want to exit");
            size = scan.nextLine();


            switch (size.toUpperCase()) {

                case "XS":
                    System.out.println((TshirtSize.XS.ordinal()+1) + " " + TshirtSize.XS.name());
                    break;

                case "S":
                    System.out.println((TshirtSize.S.ordinal()+1) + " " + TshirtSize.S.name());
                    break;

                case "M":
                    System.out.println((TshirtSize.M.ordinal()+1) + " " + TshirtSize.M.name());
                    break;

                case "L":
                    System.out.println((TshirtSize.L.ordinal()+1) + " " + TshirtSize.L.name());
                    break;

                case "XL":
                    System.out.println((TshirtSize.XL.ordinal()+1) + " " + TshirtSize.XL.name());
                    break;

                case "0":
                    appOn = false;
                    break;

                default:
                    System.out.println("Wrong letter!");
                    break;

            }
        }
    }

}
