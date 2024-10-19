import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("HOW MANY ROUNDS - ");
        int n=sc.nextInt();
        System.out.print("HOW MANY TIMES IN A ROUND - ");
        int t=sc.nextInt();
        Sps obj=new Sps();
        obj.game(n,t);
    }
}