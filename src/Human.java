public class Human implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Людина " + name + " пробігла " + distance + " метрів.");
            return true;
        } else {
            System.out.println("Людина " + name + " не змогла пробігти " + distance + " метрів.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Людина " + name + " перестрибнула " + height + " метрів.");
            return true;
        } else {
            System.out.println("Людина " + name + " не змогла перестрибнути " + height + " метрів.");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}