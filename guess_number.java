import  java.util.Scanner;
public class guess_number {
    public static void main(String argu[]){
        int generate_number=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int count=0;
        while(true){
            System.out.print("Guess a number(1-100): ");
            int guess=sc.nextInt();
            count=count+1;
            if(guess==generate_number){
                System.out.println("Wooho..Correct Number");
                System.out.println();
                break;
            }
            else if(guess<generate_number){
                System.out.println("Number is too small. Try agin!");
                System.out.println();
            }
            else{
                System.out.println("Number is too large. Try agin!");
                System.out.println();
            }
        }
        
        System.out.print("Number is: "+generate_number);
        System.out.println();
        System.out.println("Guess in "+count+" attempts");
        sc.close();
    }
}