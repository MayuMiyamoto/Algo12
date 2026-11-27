import java.util.Scanner;

class Algo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//マス目の一辺のマス数N

        int sum = 0;
        int[][] a = new int[n + 1][n + 1];//マス目の整数A(i,j)
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                a[i][j] = sc.nextInt();

                if(i == j) {
                    sum += a[i][j];
                } else if(i + j == n + 1) {
                    sum += a[i][j];
                }
            }
        } 
        System.out.println(sum);
    }
}