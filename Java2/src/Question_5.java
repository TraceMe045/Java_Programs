import java.util.*;
public class Question_5 {
    //to check whether entered number is perfect square or not.
    static boolean perfect_square(double n){
        double sr= Math.sqrt(n);
        return(sr-Math.floor(sr)==0);
    }
    public static void main(String[] args){
        double n;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number :");
        n = in.nextDouble();
        if(perfect_square(n)) {
            System.out.println("Its a Perfect Square");
        }
        else {
            System.out.println("Its not a perfect square");
        }

            }


        }


        


