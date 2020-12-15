package Project;
import java.util.Scanner;

public class LisaLisand {
    Lisand lisa1, lisa2, lisa3, lisa4;

    public LisaLisand(Lisand valik1, Lisand valik2, Lisand valik3, Lisand valik4) {
        this.lisa1 = valik1;
        this.lisa2 = valik2;
        this.lisa3 = valik3;
        this.lisa4 = valik4;
    }
    public boolean ValiLisand(Lisand add){
        System.out.println("Kas the soovite: " + add.getLisa() + " price: " + add.getHind());
        Scanner reader = new Scanner(System.in);
        String vastus = reader.nextLine();
        if(vastus.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }
}