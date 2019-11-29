public class Citizen extends Person {
    public Citizen(int id) {
        super(id);
        super.setName("Citizen");
    }

    @Override
    public boolean vote(Person person){
        return true;
    }

}
