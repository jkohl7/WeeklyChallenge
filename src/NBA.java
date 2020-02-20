import java.util.Scanner;

public class NBA {
    //Central Division
    public enum Teams {
        Bulls("Bul", "Chicago", "Bulls"),
        Cavaliers("Cav", "Cleveland", "Cavaliers"),
        Pistons("Pis", "Detroit", "Pistons"),
        Pacers("Pac", "Indiana", "Pacers"),
        Bucks("Buc", "milwaukee", "Bucks");

        private String abbrev;
        private String city;
        private String name;


        Teams(String abbrev, String city, String name) {
            this.abbrev = abbrev;
            this.city = city;
            this.name = name;
        }

        public String getAbbrev() {
            return abbrev;
        }

        public String getCity() {
            return city;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        System.out.println("What is your favorite team in the Central Division?");
        Scanner keyboard = new Scanner(System.in);
        String favorite = keyboard.nextLine();
        boolean notFound = true;

        for (Teams NBA : Teams.values()) {
            if (favorite.substring(0, 3).equalsIgnoreCase(NBA.getCity().substring(0, 3))) {
                favorite = NBA.getName();
                notFound = false;
            }
        }
        if (notFound)
        {
            System.out.println("The team you entered is not in the Central Division");
        } else {
            System.out.println(favorite + " are your favorite team? Cool!");
        }
    }
}
