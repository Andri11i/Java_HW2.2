public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Андрій", 500, 2),
                new Cat("Мурзик", 300, 3),
                new Robot("R2-D2", 1000, 1)
        };


        Obstacle[] obstacles = {
                new RunningTrack(200),
                new Wall(2),
                new RunningTrack(400),
                new Wall(3)
        };


        for (Participant participant : participants) {
            System.out.println("\nУчасник: " + participant.getName());
            boolean passedAll = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println("Учасник " + participant.getName() + " вибуває!");
                    passedAll = false;
                    break;
                }
            }
            if (passedAll) {
                System.out.println("Учасник " + participant.getName() + " пройшов всі перешкоди!");
            }
        }
    }
}