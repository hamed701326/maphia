public abstract class Person {
    private boolean live;
    public abstract boolean vote(Person person);

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
