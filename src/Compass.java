import java.util.Arrays;
import java.util.Scanner;

public enum Compass{
    NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST;
    
    
    public static Compass turnRight(Compass currentDirection) {
        if (currentDirection == NORTHWEST) {
            return NORTH;
        } else {
            return Compass.values()[currentDirection.ordinal() + 1];
        }
    }
    public static Compass reset(){return NORTH;}
}