package Execire6;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


class Execire6{
    //フィールドの設定

    //問題6-1
    public static void main(String[] args) throws IOException{
        System.out.println("2乗の値は" + Kakeru(3));
        System.out.println("2乗の値は" + Rute(9, 3));
        System.out.println("大きい値は" + Large(9, 3));

        BufferedReader A = new BufferedReader(new InputStreamReader( System.in ));
        int x = Integer.parseInt(A.readLine());
        int y = Integer.parseInt(A.readLine());
        int z = Integer.parseInt(A.readLine());
        System.out.println(kumasan( x, kumasan( y, z )));

        //４つの中でどれが一番大きいのか
        int a;
        int b;
        int c;
        int d;
        // System.out.println(Math.max(a, b));

        Scanner B = new Scanner(System.in); //値を記入することができる
        // int h; //hを定義
        int h = B.nextInt();
        System.out.println("三角形の大きさ");

        for(int i = 0; i <= h; i++){
            for(int j = 0; j <= i; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        //解答のやり方
        Sankaku(3); //メソッドを用意する
        System.out.println();
        Sankaku(4);
        System.out.println();
        Sankaku(5);

        //逆の場合
        Shikaku(6);
        System.out.println();
        Shikaku(7);
        System.out.println();
        Shikaku(8);

        //中央の場合
        Unko(6);
        System.out.println();
        Unko(7);
        System.out.println();
        Unko(8);
        System.out.println();

        //別解
        int n = 5;
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "■";
            System.out.print(str + "\n");
    }

    static void Sankaku(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.println("※");
            }
            System.out.println();
        }
    }


    static void Shikaku(int m){
        for(int i = m; i >= 0; i++){
            for(int j = 0; j <= i; i++){
                System.out.println("※");
            }
            System.out.println();
        }
    }

    static void Unko(int z){
        for(int i = 0; i < z; i++){
            for(int j = 0; j < z-(i + 1); j++){
                System.out.println("※");
            }
            for(int k = 0; k < (i + 1) * 2 - 1; k++){
                System.out.println("※");
            }
        }
    }
    //問題6-1のメソッド
    static int Kakeru(int n){
        return n * n;
    }

    //問題6-2のメソッド
    static int Rute(int x, int y){
        return (x + y) / 2;
    }

    //問題6-3のメソッド
    static int Large(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    //問題6-3のメソッド
    static int kumasan(int x, int v){
        if( x < v){
            return x;
        }else{
            return v;
        }
    }
}