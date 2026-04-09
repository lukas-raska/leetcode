package leetcode.medium.task_2069_walking_robot_simulation_II;


public class Robot {

    private final int width;
    private final int height;
    private int x;
    private int y;
    private int directionIndex;
    private final int perimeter;
    private final static String[] directions = {"East", "North", "West", "South"};
    private final static int[][] dXdY = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};


    public Robot(int width,
                 int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
        this.directionIndex = 0;
        this.perimeter = 2 * (width + height - 2);
    }

    public void step(int num) {

        num %= perimeter;

        if (x == 0 && y == 0 && num == 0){
            this.directionIndex = 3;
            return;
        }


        while (num > 0) {

            int dx = dXdY[directionIndex][0];
            int dy = dXdY[directionIndex][1];

            int possibleSteps = switch (directionIndex) {
                case 0 -> (width - 1) - x;//east
                case 1 -> (height - 1) - y; //north
                case 2 -> x; //west
                case 3 -> y; //south
                default -> 0;
            };

            if (possibleSteps <= num) {
                x += dx * possibleSteps;
                y += dy * possibleSteps;
                num -= possibleSteps;
                if (num != 0) {
                    directionIndex = (directionIndex + 1) % directions.length;
                }
            } else {
                x += dx * num;
                y += dy * num;
                num = 0;
            }
        }
    }


    public int[] getPos() {
        return new int[]{x, y};
    }

    public String getDir() {
        return Robot.directions[directionIndex];
    }
}
