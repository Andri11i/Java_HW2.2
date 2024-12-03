public class RunningTrack implements Obstacle {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        System.out.println("Перешкода: Бігова доріжка, дистанція: " + distance);
        return participant.run(distance);
    }
}
