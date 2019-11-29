

public class Doctor extends Citizen  {

    public Doctor(String id) {
        super(id);
    }

    public void voteSafe(Person person){
        person.setLive(true);
    }

}
