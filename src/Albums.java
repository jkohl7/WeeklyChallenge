import java.time.*;

public class Albums {
    public static void main(String[] args) {
        LocalDate current = LocalDate.of(2020, 2, 19); //The current date is 2/19/2020
        LocalDate theJoshuaTree = LocalDate.of(1987, 3,9);
        LocalDate rattleAndHum = LocalDate.of(1988, 10, 9);
        LocalDate thirdAlbum = LocalDate.of(1990, 5,9);



        Period p1 = Period.between(theJoshuaTree, current);
        Period p2 = Period.between(theJoshuaTree, rattleAndHum);
        Period p3 = Period.between(rattleAndHum, thirdAlbum);

        System.out.println("The Joshua Tree came out " + p1.getYears() + " years, " + p1.getMonths() + " months, and " + p1.getDays() + " days ago.");
        System.out.println("Rattle and Hum came out " + p2.getYears() + " years, " + p2.getMonths() + " months, and " + p2.getDays() + " days after The Joshua Tree.");
        System.out.println("U2's third album came out " + p3.getYears() + " years, " + p3.getMonths() + " months, and " + p3.getDays() + " days after Rattle and Hum");
    }
}
