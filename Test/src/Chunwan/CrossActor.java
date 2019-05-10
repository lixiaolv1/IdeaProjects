package Chunwan;

public class CrossActor extends Actor {
    public CrossActor() {
        super();
    }

    public CrossActor(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println(getName() + "-现在相声不景气了，我只能说：想死你们了");
    }
}
