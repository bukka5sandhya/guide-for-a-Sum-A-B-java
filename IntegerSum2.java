import java.util.Scanner;

class IntegerSum2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Two numbers for addtion: ");  
        int a= input.nextInt();
        int b = input.nextInt();
        System.out.println("The sum of a and b is ="+Integer.sum(a,b));
    }
}