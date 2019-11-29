public abstract class Person {
    private boolean live;
    public abstract boolean vote(Person person);
    private boolean talkAble;

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
