import java.util.*;
//by this programe , user can calculate his/her grade based upon his/her obtained pecentage 
public class gradingsystem {
   

    public static void main (String[]args){
        System.out.println("enter your obtained percentage");

         // make a scanner class for taking input from the user

        Scanner sc = new Scanner(System.in);  
        double percentage = sc.nextDouble();
        //nextDouble is used for making the user to give input in decimal digits also 
        //now we should check if input percentage is lying in a specific range
        if (percentage<=100 && percentage>=0) {
            //now we ae making grades based upon the input percentage
            if (percentage>33) {
                System.out.println("pass");
                if (percentage <=100 && percentage >90) {
                    System.out.println("YOU OBTAINED GRADE 'A' ");
                    
                } else if( percentage<=90 && percentage >80) {
                    System.out.println("YOU OBTAINED GRADE'B' ");
    
                } else if( percentage<=80 && percentage >60) {
                    System.out.println("YOU OBTAINED GRADE 'C' ");
    
                } else if( percentage<=60 && percentage >50) {
                    System.out.println("YOU OBTAINED GRADE 'D' ");
    
                }else  {
                    System.out.println("YOU OBTAINED GRADE 'E' ");
                }
                }else{
            System.out.println("fail");
    
        } 
        }
        else{
            System.out.println( "OBTAINED parcentage SHOULD BE <=100 AND percentage>=0");
        }
       
}

}
