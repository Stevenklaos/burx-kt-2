package Project;

import java.util.HashMap;
import java.util.Map;

class HeaBurger {      
  public void HeaBurks() {                     
    System.out.println("Steveni burxid!");
  }
}
public class main extends HeaBurger{
    public static void main(String[] args) {
        Map<Burger, LisaLisand> Menüü = new HashMap<>();
        Burger ChickenBurger = new Burger("Chicken burger", "kana", 6.25, "valge sai");
        LisaLisand lisand1 = new LisaLisand(new Lisand("juust", 0.60), new Lisand("salat", 0.10),  new Lisand("tomat", 0.20), new Lisand( "majonees", 0.10));

        Burger OldFashionedCheeseburger = new Burger("Old Fashioned Cheeseburger", "Looma liha", 5.99, "Valge sai");
        LisaLisand lisand2 = new LisaLisand(new Lisand("Peekon", 1.69), new Lisand("sibul", 0.20), new Lisand("kurk", 0.30), new Lisand("vürtsikas kaste", 0.10));

        Burger NewYorkBurger = new Burger("New York Burger", "Looma liha", 9.99,"Valge sai");
        LisaLisand lisand3 = new LisaLisand(new Lisand("redis", 4.20), new Lisand("hapukurk", 0.20), new Lisand("Peekon", 0.10), new Lisand("Seened", 0.10));

        Menüü.put(ChickenBurger, lisand1);
        Menüü.put(OldFashionedCheeseburger, lisand2);
        Menüü.put(NewYorkBurger, lisand3);

        System.out.println("MENÜÜ");
        System.out.println("1. " + ChickenBurger);
        System.out.println("2. " + OldFashionedCheeseburger);
        System.out.println("3. " + NewYorkBurger);

        tellimus telli = new tellimus(Menüü);
        telli.BurgerChoice();
        telli.AdditionChoice();
        telli.finalPrice();
        
        ChickenBurger.HeaBurks();
    }
}
