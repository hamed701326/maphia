public class Citizen extends Person {
    public Citizen() {
        super.setName("Citizen");
    }

    @Override
    public boolean vote(Person person){
        return true;
    }

}
