package Project;

import java.util.Map;
import java.util.Scanner;

public class tellimus {
    Map<Burger, LisaLisand> menu;
    private Burger burger;
    private Double BurgeriHind;
    private LisaLisand BurgeriLisa;

    public tellimus(Map<Burger, LisaLisand> Menüü) {
        this.menu = Menüü;
    }
    public void BurgerChoice(){
        while(true){
            System.out.println("Mis burxi soovite?: ");
            Scanner reader = new Scanner(System.in);
            String kliendiValik = reader.nextLine();
            for (Map.Entry<Burger, LisaLisand> entry : menu.entrySet()) {
                if(entry.getKey().getNimetus().matches(kliendiValik)){
                    this.burger = entry.getKey();
                    this.BurgeriHind = entry.getKey().getHind();
                    this.BurgeriLisa = entry.getValue();
                }
            }
            if(this.burger != null && this.BurgeriLisa != null) {
                break;
            } else {
                System.out.println("Sellist burxi pole olemas");
            }
        }
    }
    public void AdditionChoice(){
        if(BurgeriLisa.ValiLisand(this.BurgeriLisa.lisa1))
        {
            this.BurgeriHind = this.BurgeriHind + this.BurgeriLisa.lisa1.getHind();
        };
        if(BurgeriLisa.ValiLisand(this.BurgeriLisa.lisa2)){
            this.BurgeriHind = this.BurgeriHind + this.BurgeriLisa.lisa2.getHind();
        }
        if(BurgeriLisa.ValiLisand(BurgeriLisa.lisa3)){
            this.BurgeriHind = this.BurgeriHind + this.BurgeriLisa.lisa3.getHind();
        }
        if(BurgeriLisa.ValiLisand(BurgeriLisa.lisa4)){
            this.BurgeriHind = this.BurgeriHind + this.BurgeriLisa.lisa4.getHind();
        }
    }
    public void finalPrice(){
        this.BurgeriHind = Math.round(this.BurgeriHind * 8) / 8.00;
        System.out.println("Teie burgeri hind: " + this.BurgeriHind + "€");
    }

}