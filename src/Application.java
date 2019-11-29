import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int counterMaphia = 0;
        int counterCitizen = 0;
        Person[] peopleMaphia = new Person[5];
        for (int i = 0; i < 5; i++) {
            peopleMaphia[i] = (new Maphia(i + 1 + "m"));
        }
        //setting Godfather
        peopleMaphia[3] = new GodFather("godfather");
        //setting natasha
        peopleMaphia[2] = new Natasha("natasha");
        Person[] peopleCitizen = new Citizen[15];
        for (int i = 0; i < 15; i++) {
            peopleCitizen[i] = (new Citizen(i + 1 + "c"));
        }
        do {
            System.out.println("Now is time to sleep!");
            System.out.println("get up  Maphias!!!");
            System.out.println("maphia voting");
            for (int i = 0; i <peopleCitizen.length ; i++) {
                for (int j = 0; j < peopleMaphia.length; j++) {
                    System.out.println(peopleMaphia[j].vote());
                    peopleCitizen[i].setNumberVote(
                            peopleMaphia[j].vote()?
                                    peopleCitizen[i].getNumberVote()+1
                                    :peopleCitizen[i].getNumberVote());
                }
            }

            System.out.println("Now is morning");


        } while (
            //maphia won!
                (counterCitizen == counterMaphia) ||
                        //citizen won!
                        (counterMaphia == 0));
    }
}
