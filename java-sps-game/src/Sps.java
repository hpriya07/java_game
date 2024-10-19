import java.util.HashMap;
import java.util.*;
public class Sps {
    public static void game(int r,int t){
        int smp=0,ump=0;
        for(int i=0;i<r;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("------------------------");
            System.out.println("------------------------");
            System.out.println("LET'S BEGIN ROUND"+" "+(i+1));
            System.out.println("------------------------");
            System.out.println("------------------------");
            HashMap<Integer,String>hm=new HashMap<>();
            hm.put(1,"STONE");
            hm.put(2,"PAPER");
            hm.put(3,"SCISSORS");
            int upts=0;int spts=0;
            for(int j=0;j<t;j++) {
                System.out.println("1==STONE" + " " + "2==PAPER" + " " + "3==SCISSORS");
                int u = sc.nextInt();
                int s = (int) (Math.random() * 3) + 1;
                System.out.println("your Option: " + hm.get(u));
                System.out.println("opponent's Option: " + hm.get(s));
                if ((u == 1 && s == 3) || (u == 2 && s == 1) || (u == 3 && s == 2)) {
                    upts++;
                } else if ((u == 1 && s == 2) || (u == 3 && s == 1) || (u == 2 && s == 3)) {
                    spts++;
                } else {
                    continue;
                }
                System.out.println("Your score - " + upts + " " + "points");
                System.out.println("opponent score - " + spts + " " + "points");
            }
            if(upts>spts){
                ump++;
                System.out.println("YOU WON THE ROUND");
            }
            else if(upts<spts){
                smp++;
                System.out.println("OPPONENT WON THE ROUND");
            }
            else {
                System.out.println("MATCH DRAW");
            }
        }
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("MATCH OVER CHECK THE RESULTS");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println((ump>smp)?"YOU WON THE MATCH":"OPPONENT WON THE MATCH");
    }
}
