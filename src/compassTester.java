import java.util.Scanner;

public class compassTester{

    public static void main(String[] args){
        Compass currentDirection = Compass.reset();
        Scanner inp = new Scanner(System.in);
        boolean x = true;
        int command;
        while (x){
            System.out.println("type the corresponding number for the command you want to run");
            System.out.print("1.reset compass 2.turn right 3.exit 4.currentDirection");
            command = inp.nextInt();
            if ((command > 4) || (command < 1)){
                System.out.println("ERROR: COMMMAND NOT FOUND");
            }
            else{
                switch (command){
                    case 1{
                        currentDirection = Compass.reset();
                        System.out.println("Compass has been reset to NORTH");
                    }
                    case 2{
                        int x;
                        System.out.print("How many times would you like to turn right? ");
                        x = inp.nextInt();
                        for (int i = 0; i < x; i++) {
                            currentDirection = Compass.turnRight(currentDirection);
                        }
                        System.out.println("Compass is facing " + currentDirection)
                    }
                }
            }
        }
    }
}