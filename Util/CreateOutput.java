import java.util.*;
public class CreateOutput{
public static int  NUM_STATIONS= 52;
	public static int TIMES_MATRIX[][] = new int[NUM_STATIONS][NUM_STATIONS];
	public static int PATH_MATRIX[][] = new int[NUM_STATIONS][NUM_STATIONS];
   
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      
      for(int i = 0; i< NUM_STATIONS ;i++){
         for(int j = 0; j< NUM_STATIONS ;j++){
            TIMES_MATRIX[i][j] = in.nextInt();
         }
      }
      
      for(int i = 0; i< NUM_STATIONS ;i++){
         for(int j = 0; j< NUM_STATIONS ;j++){
            PATH_MATRIX[i][j] = in.nextInt();
         }
      }
      
       System.out.print("{");  
       for(int i = 0; i< NUM_STATIONS ;i++){
         System.out.print("{"); 
         for(int j = 0; j< NUM_STATIONS ;j++){
            if(j>0)
               System.out.print(",");
            System.out.print(TIMES_MATRIX[i][j]);
         }
         System.out.println("},");
      }
      System.out.println("};"); 
      
      
      System.out.println("________________________________________________"); 
      System.out.print("{");  
       for(int i = 0; i< NUM_STATIONS ;i++){
         System.out.print("{"); 
         for(int j = 0; j< NUM_STATIONS ;j++){
            if(j>0)
               System.out.print(",");
            System.out.print(TIMES_MATRIX[i][j]);
         }
         System.out.println("},");
      }
      System.out.print("};"); 
   }
   
}