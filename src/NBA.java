import java.util.Scanner;

public class NBA {
        //Central Division
        public enum Teams {Bulls("Bul"), Cavaliers("Cav"), Pistons("Pis"), Pacers("Pac"), Bucks("Buc");

            private String abbrev;

            private Teams(String abbrev) {
                this.abbrev = abbrev;
            }

            public String getAbbreviations() {
                return abbrev;
            }
        }

    public static void main(String[] args) {
        System.out.println("What is your favorite team in the Central Division?");
        Scanner keyboard = new Scanner(System.in);

    }
}
