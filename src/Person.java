public abstract class Person {
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
}
