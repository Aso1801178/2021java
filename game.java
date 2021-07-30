import java.util.Random;
import java.util.Scanner;

public class game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("         戦艦ゲーム         ");
        System.out.println("**************************");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int nokori = 0;
        while(nokori < 3){
            ship(x,y);
        }

    }


    public static int ship(int x,int y){
        int [][] haiti = new int[5][5];
        int cnt = 0;
        int fune = 3;
        while(cnt < 3){
            int a = new Random().nextInt(5);
            int b = new Random().nextInt(5);
            if(haiti[a][b] != 1){
                haiti[a][b] = 1;
                cnt++;
            }
        }
        if(haiti[x][y] == 1){

        }
    }
}