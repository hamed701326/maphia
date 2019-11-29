public class Natasha extends Maphia {
    public void voteShutup(Person person){
        person.setTalkAble(false);
    }

    public Natasha(String id) {
        super(id);
    }
}
