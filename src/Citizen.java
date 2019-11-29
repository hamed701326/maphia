public class Citizen extends Person {
    public Citizen(String id) {
        super(id);
        super.setName("Citizen");
    }

    @Override
    public boolean vote()
    {
        return true;
        //TODO random choosing
    }

}
