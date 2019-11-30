public abstract class Person implements Comparable<Person> {
    private String id;
    private boolean live=true;
    public abstract boolean vote();
    private boolean talkAble=true;
    private String name;

    public int getNumberVote() {
        return numberVote;
    }

    public void setNumberVote(int numberVote) {
        this.numberVote = numberVote;
    }

    private int numberVote=0;

    public Person(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void setTalkAble(boolean talkAble) {
        this.talkAble = talkAble;
    }
    @Override
    public int compareTo(Person o) {
        //ascending order
        return this.numberVote-o.getNumberVote();
        //descending order
        // return o.getNumberVote()-this.numberVote
    }
}
