import java.util.Scanner;

public class NBA {
        //Central Division
        public enum Teams {Bulls("Bul", "Chicago", "Bulls"), Cavaliers("Cav", "Cleveland", "Cavaliers"), Pistons("Pis", "Detroit", "Pistons"), Pacers("Pac", "Indiana", "Pacers"), Bucks("Buc", "milwaukee", "Bucks");

            private String abbrev;
            private String city;
            private String name;


            Teams(String abbrev, String city, String name){
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
        }M

    public static void main(String[] args) {
        System.out.println("What is your favorite team in the Central Division?");
        Scanner keyboard = new Scanner(System.in);
        String favorite = keyboard.nextLine();

        for(Teams)

    }
}
