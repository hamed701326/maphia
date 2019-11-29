public class Sniper extends Citizen{
    public void voteShot(Person person){
        person.setLive(false);
    }

    public Sniper(String id) {
        super(id);
    }
}
