import java.util.ArrayList;
import java.util.Scanner;

public class ListExercises
{
   public static void main(String[] args)
   {  
      ArrayList<Integer> values = new ArrayList<Integer>();
      values.add(10);
	  values.add(7);
	  values.add(5);
	  values.add(9);
	  values.add(2);
	  values.add(3);
	  values.add(7);
     for (int e: values){
         System.out.print(e);
      // Find the largest value
     }
	  System.out.println("Largest value: "+getLargest(values));
	  
      // Add all the values
	  System.out.println("Sum of the values: "+getSum(values));
	   
      // Values at even indices
	  System.out.println("Values at even indices: "+getElementsAtEvenIndices(values));

      // Remove all elements equal to 7
	  removeElements(values, 7);
	  System.out.println("After removing elements: " + values);
   }

   public static int getLargest(ArrayList<Integer> vals){
   	int largest = vals.get(0);
   	for (int e: vals){
   		if (e>largest){
   			largest = e;
   		}
   	}
   	return largest;
   }

   public static int getSum(ArrayList<Integer> vals){
   	int sum = 0;
   	for (int e: vals){
   		sum+=e;
   	}
   	return sum;
   }

   public static ArrayList<Integer> getElementsAtEvenIndices(ArrayList<Integer> vals){
   	ArrayList<Integer> evenIndexes = new ArrayList<Integer>();
   	for (int i = 0; i < vals.size(); i++){
   		if (i%2==0){
   			evenIndexes.add(vals.get(i));
   		}
   	}
   	return evenIndexes;
   }

   public static ArrayList<Integer> removeElements(ArrayList<Integer> vals, int val){
   	for (int i = 0; i < vals.size(); i++){
   		if (vals.get(i) == val){
   			vals.remove(i);
   		}
   	}
   	return vals;
   }
}