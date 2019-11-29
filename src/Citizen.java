public class Citizen extends Person {
    public Citizen(String id) {
        super(id);
        super.setName("Citizen");
    }

    @Override
    public int vote()
    {
        return 1;
        //TODO random choosing
    }

}
