public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        System.out.println("Перешкода: Стіна, висота: " + height);
        return participant.jump(height);
    }
}