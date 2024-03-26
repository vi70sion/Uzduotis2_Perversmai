import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        char vardoRaide = 'E';
        int raidesSkaicius = vardoRaide;
        System.out.println("Vardo pirmos raidės \'" + vardoRaide + "\' skaitinė reikšmė: " + raidesSkaicius);
        System.out.println();

        // Užduotis- primityvai į objektus
        BigDecimal degaluKaina = new BigDecimal("22.00"); //20 litrų degalų kaina
        Integer rangeMin = 15;
        Integer rangeMax = 30;
        BigDecimal pinigaiPinigineje = new BigDecimal(rangeMin + (int)(Math.random() * ((rangeMax - rangeMin) + 1)));
        System.out.println("Turime pinigų piniginėje: " + pinigaiPinigineje);
        System.out.println("20 litrų degalų kainuoja: " + degaluKaina);

        if (pinigaiPinigineje.compareTo(degaluKaina) < 0) {
            System.out.println("Trūksta pinigų nupirkti 20 litrų kuro: " + degaluKaina.subtract(pinigaiPinigineje));
        } else if (pinigaiPinigineje.compareTo(degaluKaina) > 0) {
            System.out.println("Lieka pinigų nupirkus 20 litrų kuro: " + pinigaiPinigineje.subtract(degaluKaina));
        } else {
            System.out.println("Turite pinigų nupirkti lygiai 20 litrų kuro.");
        }

    }
}