import java.util.Scanner;

public class calculator{
    
    public static void main(String[] args){
        boolean flag = true;
        int num;
        Scanner inp = new Scanner(System.in);
        while (flag){
            
            System.out.println("how many numbers are in the equation"); 
            num = inp.nextInt();
            int[] nums = new int[num];
            char[] symbols = new char[num-1];
            for (int i = 0; i < num;i++){
                System.out.println("Enter next num");
                nums[i] = inp.nextInt();
                if (i+1 != num){
                    System.out.println("Enter next symbol");
                    symbols[i] = inp.next().charAt(0);
                }
            }
            System.out.println(nums[0]);
            System.out.println(symbols[0]);

        }
    }

}