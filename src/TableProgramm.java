import java.util.Scanner;

public class TableProgramm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 =sc.nextInt();
        for (int i=0;i<=10;i++)
            System.out.println(num1+ "*" + (i+1) +"=" + (num1*(i+1)) );

    }
}
