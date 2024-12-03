public class Robot implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Робот " + name + " пробіг " + distance + " метрів.");
            return true;
        } else {
            System.out.println("Робот " + name + " не зміг пробігти " + distance + " метрів.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Робот " + name + " перестрибнув " + height + " метрів.");
            return true;
        } else {
            System.out.println("Робот " + name + " не зміг перестрибнути " + height + " метрів.");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}