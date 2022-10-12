import java.util.*;

public class DrinkAlchol {

    private static int MAX = 20;
    private static long Miter = 50;
    private static String HAPPY = "happy";
    private static String SAD = "sad";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int testcase = 0; testcase < testCases; testcase++) {
            List<Position> markets = new LinkedList<>();
            int marketNum = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            Position home = new Position(x, y);
            for (int position = 0; position < marketNum; position++) {
                x = sc.nextInt();
                y = sc.nextInt();
                markets.add(new Position(x, y));
            }
            x = sc.nextInt();
            y = sc.nextInt();
            Position festival = new Position(x, y);

            System.out.println(solution(home, festival, markets));

        }


    }

    public static String solution(Position home, Position festival, List<Position> markets) {
        List<Position> otherMarket = new LinkedList<>();
        Queue<Position> queue = new LinkedList<>();
        Set<Position> visit = new HashSet<>();
        if (home.calculate(festival) <= Miter * MAX) {
            return HAPPY;
        }
        for (Position market : markets) {
            if (market.calculate(home) <= Miter * MAX) {
                queue.add(new Position(market.x, market.y));
            } else {
                otherMarket.add(market);
            }
        }
        while (!queue.isEmpty()) {
            Position current = queue.poll();
            if (current.calculate(festival) <= Miter * MAX) {
                return HAPPY;
            }
            for (Position market : otherMarket) {
                if (!visit.contains(market)) {
                    if (current.calculate(market) <= Miter * MAX && !market.equals(current)) {
                        Position newPosition = new Position(market.x, market.y);
                        queue.add(newPosition);
                        visit.add(market);
                    }
                }
            }
        }

        return SAD;
    }


    private static class Position {
        long x;
        long y;


        public Position(long x, long y) {
            this.x = x;
            this.y = y;
        }


        public long calculate(Position position) {
            long distanceX = this.x >= position.x ? this.x - position.x : position.x - this.x;
            long distanceY = this.y >= position.y ? this.y - position.y : position.y - this.y;
            return distanceX + distanceY;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Position) {
                Position position = (Position) obj;
                return this.x == position.x && this.y == position.y;
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return "Position{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
