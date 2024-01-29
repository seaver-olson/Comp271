import java.util.Arrays;

public enum Compass{
    NORTH, SOUTH, EAST, WEST, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST;

    public static void main(String[] args){
        Compass[] myFavDirections = {EAST,NORTHEAST};
        Compass x = NORTH;
        Compass y = NORTHWEST;
        Compass z = EAST;
        System.out.println("All the directions: "+Arrays.toString(Compass.values()));
        System.out.print("You are on an adventure\n First, ");
        switch (x){
            case NORTH:
                System.out.println("You are going North");
                break;
            case SOUTH:
                System.out.println("You are going South");
                break;
            case EAST:
                System.out.println("You are going East");
                break;
            case WEST:
                System.out.println("You are going West");
                break;
            case NORTHEAST:
                System.out.println("You are going Northeast");
                break;
            case NORTHWEST:
                System.out.println("You are going Northwest");
                break;
            case SOUTHEAST:
                System.out.println("You are going Southeast");
                break;
            case SOUTHWEST:
                System.out.println("You are going Southwest");
                break;
        }
        System.out.print("Next, ");
        switch (y){
            case NORTH:
                System.out.println("You are going North");
                break;
            case SOUTH:
                System.out.println("You are going South");
                break;
            case EAST:
                System.out.println("You are going East");
                break;
            case WEST:
                System.out.println("You are going West");
                break;
            case NORTHEAST:
                System.out.println("You are going Northeast");
                break;
            case NORTHWEST:
                System.out.println("You are going Northwest");
                break;
            case SOUTHEAST:
                System.out.println("You are going Southeast");
                break;
            case SOUTHWEST:
                System.out.println("You are going Southwest");
                break;
        }
        System.out.print("Finally, ");
        switch (z) {
            case NORTH:
                System.out.println("You are going North");
                break;
            case SOUTH:
                System.out.println("You are going South");
                break;
            case EAST:
                System.out.println("You are going East");
                break;
            case WEST:
                System.out.println("You are going West");
                break;
            case NORTHEAST:
                System.out.println("You are going Northeast");
                break;
            case NORTHWEST:
                System.out.println("You are going Northwest");
                break;
            case SOUTHEAST:
                System.out.println("You are going Southeast");
                break;
            case SOUTHWEST:
                System.out.println("You are going Southwest");
                break;
        }
        System.out.println("Your favorite directions are: "+Arrays.toString(myFavDirections));
}}