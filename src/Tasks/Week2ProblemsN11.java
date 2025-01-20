package Tasks;

import java.util.Scanner;

public class Week2ProblemsN11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String request = sc.next();
        if(request.equals("odd")){
            for(int i = 1; i <= 100; i += 2)
                System.out.print(i + " ");
        } else if(request.equals("even")){
            for(int i = 0; i <= 100; i += 2){
                System.out.print(i + " ");
            }
        } else{
            System.out.println("Write even or odd!");
        }
    }
}
