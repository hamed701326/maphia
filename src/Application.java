import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int counterMaphia = 0;
        int counterCitizen = 0;
        List<Person> peopleMaphia = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            peopleMaphia.add(new Maphia(i+1+"m"));
        }
        //setting Godfather
        GodFather godFather =(GodFather)peopleMaphia.get(2);
        //setting natasha
        Natasha natasha = (Natasha)peopleMaphia.get(4);
        List<Person> peopleCitizen = new ArrayList<>();
        for (int i = 0; i < 15 ; i++) {
            peopleCitizen.add(new Citizen(i+1+"c"));
        }
        //setting Doctor
        Doctor doctor=(Doctor) peopleCitizen.get(2);
        //setting detective
        Detective detective= (Detective) peopleCitizen.get(5);
        //setting sniper
        Sniper sniper = (Sniper) peopleCitizen.get(12);
        do {
            System.out.println("Now is time to sleep!");
            System.out.println("get up  Maphias!!!");
            System.out.println("maphia voting");
            for (int i = 0; i < peopleMaphia.size(); i++) {

            }




            System.out.println("Now is morning");


        } while (
            //maphia won!
                (counterCitizen == counterMaphia) ||
                        //citizen won!
            (counterMaphia == 0));
    }
}
