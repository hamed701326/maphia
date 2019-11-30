import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int numberOfmaphia = 15;
        int numberOfCitizen = 5;
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
                                    :peopleCitizen[i].getNumberVote()
                    );
                }
            }
            System.out.println("Now is morning");
            System.out.println("Voting Step");

            Person [] voters=concatenateArray(peopleCitizen,peopleMaphia);
            for(int i=0;i<voters.length;i++){
                System.out.println("Person "+(i+1)+":");
                //voting to person
                for(Person person:voters){

                       voters[i].setNumberVote(
                               person.vote()?
                                       voters[i].getNumberVote()+1
                                       :voters[i].getNumberVote()
                       );

                }
                System.out.println(" Number Votes: "+voters[i].getNumberVote());
            }
            // kill voters result
            killChoice(voters);
            // determine number of live people for each group:
            numberOfCitizen=counterLive(peopleCitizen);
            numberOfmaphia=counterLive(peopleMaphia);

        } while (
            //maphia won!
                (numberOfCitizen == numberOfmaphia) ||
                        //citizen won!
                        (numberOfmaphia == 0));
        //todo condition terminate game mus be change
    }
    public static Person [] concatenateArray(Person [] first,Person []second){

        List<Person> total= new ArrayList<>();
        Collections.addAll(total,first);
        Collections.addAll(total,second);
        return total.toArray(new Person[total.size()]);
    }
    public static void killChoice(Person[] people){
        Arrays.sort(people);
        int l=people.length;
        if (people[l-1]==people[l-2]){
            // TODO: revoke voking
        }
        Person person=people[l-1];// this person is going to die
        person.setLive(false);// person died
    }
    public static int counterLive(Person[] people){
        int counter=0;
        for(Person person:people){
            counter=person.isLive() ? counter+1:counter;
        }
        return counter;
    }

}
