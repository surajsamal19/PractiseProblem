import java.util.Scanner;

public class FLipCoin {
    public static void main(String[] args) {
        int headcount = 0, tailcount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of times you want to flip the coin");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            double random = Math.random();
            if (random < 0.5) {
                tailcount++;
                System.out.println("Tails");
            } else {
                headcount++;
                System.out.println("Head");

            }
        }
    }
}
System.out.println("No of times head flip the coin" +headcount);
System.out.println("No of times tail flip the coin" +tailcount);
double headpercentage=headcount/(double)n*100;
double tailpercenrage=tailcount/(double)n*100;
System.out.println("percentage of head is:" +headPercentage);
System.out.println("percentage of tail is:" +tailpercentage);
        }
        }
