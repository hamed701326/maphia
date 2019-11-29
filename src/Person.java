public abstract class Person {
    private int id;
    private boolean live=true;
    public abstract boolean vote(Person person);
    private boolean talkAble=true;
    private String name;

    public Person(int id) {
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
