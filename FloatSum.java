import java.util.Scanner;
public class FloatSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("First Number:");
        float a = input.nextFloat();
        System.out.print("Second Number:");
        float b = input.nextFloat();
        System.out.println("The sum of the a and b is = "+Float.sum(a,b));
    }
    
}
