package pl_java.exercise_3;

public class Snake {

    /*
     * Attributes
     */
    private final String color;
    private int length;
    private String direction;

    /*
     * Constructors
     */
    public Snake(String color, int length, String direction) {
        this.color = color;
        this.length = length;
        setDirection(direction);
    }

    public Snake(String direction) {
        this.color = "Green";
        this.length = 3;
        setDirection(direction);
    }

    /*
     * Getters
     */
    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public String getDirection() {
        return direction;
    }

    /*
     * Setters
     */
    private void setDirection(String direction) {
        if (direction == "EAST" || direction == "WEST" || direction == "NORTH" || direction == "SOUTH") {
            this.direction = direction;
        } else {
            System.out.println("Error! Enter valid direction");
        }
    }

    /*
     * Methods
     */
    public void modifyLength(int length) {
        if(length<=0){
            System.out.println("Error! Enter valid Length");
        }
        this.length=length;
    }

    public void turnLeft() {
        if (direction == "EAST") {
            setDirection("NORTH");
        } else if (direction == "NORTH") {
            setDirection("WEST");
        } else if (direction == "WEST") {
            setDirection("SOUTH");
        } else {
            setDirection("EAST");
        }
    }

    public void turnRight() {
        if (direction == "EAST") {
            setDirection("SOUTH");
        } else if (direction == "NORTH") {
            setDirection("EAST");
        } else if (direction == "WEST") {
            setDirection("NORTH");
        } else {
            setDirection("WEST");
        }
    }

}