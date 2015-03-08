import java.util.*;

public class CreateInitialTimesMatrix{
public static int INFINITE =99999;
public static int TIMES_MATRIX[][] = new int[47][47];
public static int PATH_MATRIX[][] = new int[47][47];

   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      
      // starting all distances/times as INFINITE or 0(if is betw itself)
      for(int i = 0 ; i< 47 ; i++){
         for(int j = 0 ; j< 47 ; j++){
            if(i==j){ // in the matrix this means it is a station comparing with itself so the time is 0 and next station is itself
               TIMES_MATRIX[i][j] = 0;
               PATH_MATRIX[i][j] = i;
               
            }
            else{
               TIMES_MATRIX[i][j] = INFINITE; // time betw. St(i) and St(j) is unknown yet
               PATH_MATRIX[i][j] = -1; // means no next station to create a path yet
            }
            
         }
      }
      // the input will be something like:  1 3 10 which means the time betw. station 1 and 3 is 10 min
      int line;
      do{
         line = in.nextInt();
         int col = in.nextInt();
         int time = in.nextInt();
         if(line>=0){
            TIMES_MATRIX[line][col] = time;
            TIMES_MATRIX[col][line] = time; // it is a bi-directional graph w/ same values
            PATH_MATRIX[line][col] = col;
            PATH_MATRIX[col][line] = line;
         }   
            
         
      }while(line>=0);
    //finding the shortest times betw. every edge/station using floyd warshall implementation 
     for(int k = 0 ; k <47 ; k++){
        for(int i = 0; i <47 ; i++){
            for(int j = 0; j <47 ; j++){
               if( TIMES_MATRIX[i][k] + TIMES_MATRIX[k][j] < TIMES_MATRIX[i][j]){
                  
                  TIMES_MATRIX[i][j] = TIMES_MATRIX[i][k] + TIMES_MATRIX[k][j];
                  PATH_MATRIX[i][j] = PATH_MATRIX[i][k];
               
               }
              }
        }
     }  
      
      
      
    //the output to be used in the floyd marshal algorithm
    System.out.println("TIMES_MATRIX");
    for(int i = 0 ; i< 47 ; i++){
         for(int j = 0 ; j< 47 ; j++){
            System.out.print(TIMES_MATRIX[i][j]+"\t");
            
         }
         System.out.println();
      }  
    System.out.println("PATH_MATRIX");  
    for(int i = 0 ; i< 47 ; i++){
         for(int j = 0 ; j< 47 ; j++){
            System.out.print(PATH_MATRIX[i][j]+"\t");
            
         }
         System.out.println();
      }    
   
   }


}