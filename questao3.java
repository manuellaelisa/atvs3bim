import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
j==m
i==a
x==z
y==w
public class Ex3 {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        String v, e = scan.nextLine();
        BufferedReader bastaler = new BufferedReader(new FileReader(e));
        int m = 0;
        int z[][] = new int[2][2];
        int w[][] = new int[2][2];

        for (int a = 0; a < 2; a++) {
            for (m = 0; m < 2; m++) {
                v = bastaler.readLine();
                z[a][m] = Integer.parseInt(v);
            }
        }

        for (int a = 0; a < 2; a++) {
            for (m = 0; m < 2; m++) {
                v = bastaler.readLine();
                w[a][m] = Integer.parseInt(v);
            }
        }
        if ((z[0][1] < z[1][0]) || (z[1][1] < z[0][0]) || (w[0][1] < w[1][0]) || (w[1][1] < z[1][1])
                || (z[1][0] > z[0][1]) || (w[0][0] > w[1][1]) || (w[1][0] > w[0][1])) {
            System.out.print('1');
        } else {
            System.out.print('0');
        }
        scan.close();
        bastaler.close();
    }

}