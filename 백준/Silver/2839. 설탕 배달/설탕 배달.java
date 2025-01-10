import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int res = -1;

        for(int i=N/5; i>=0; i--) {
            if((N-5*i)%3==0) {
                res = i+(N-5*i) / 3;
                break;
            }
        }

        System.out.println(res);
    
        sc.close();
    }
    
}
