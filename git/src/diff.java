import java.util.Scanner;

public class diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a : ");
        a=sc.nextInt();
        System.out.print("Enter b : ");
        b=sc.nextInt();

        System.out.println("(a-b) = "+(a-b));
    }
}
