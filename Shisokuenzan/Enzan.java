package Shisokuenzan;

import java.util.Scanner;

//コマンドライン引数を用いたjavaプログラム
public class Enzan{

    int sum;
    int Hikizan;
    int Kakezan;

    //scannerを使ってみる!
    Scanner kumasan = new Scanner(System.in);
    int m = kumasan.nextInt();

    // int a;
    // int b;
    // int c;

    // //コンストラクタ
    // public Enzan(int a, int b, int c){
    //     this.a = a;
    //     this.b = b;
    //     this.c = c;
    // }

    // //コンストラクタ
    public Enzan(int sum, int Hikizan, int Kakezan){
        this.sum = sum;
        this.Hikizan = Hikizan;
        this.Kakezan = Kakezan;
    }

    //メソッドの方法はおかしいset,getはprivateを使用するときだけ

    // メソッドの作成
    // 足し算
    public void sun(int a, int b, int c){
        System.out.println(a + b + c);
    }

    //足し算
    public void Kakezan(int a, int b, int c){
        System.out.println(a - b - c);
    }

    public void Kakezan(){
        System.out.println(Kakezan);
    }

    public void hikizan(){
        System.out.println(m);
    }

    //足し算
    public void Warizan(int a, int b, int c){
        System.out.println(a * b * c);
    }

    //くまさん_割り算
    public void Kumasan_Warizan(){
        System.out.println(m);
    }

    public void Speak(){
        System.out.println("......");
    }
}

class Tasizan extends Enzan{
    //コンストラクタ
    public Tasizan(int sum, int Hikizan, int Kakezan){
        super(sum, Hikizan, Kakezan);
    }

    //メソッド
    public void tasizan(){
        System.out.println(sum + Hikizan + Kakezan);
    }
}

public class Hikizan extends Enzan{
    //コンストラクタ
    public Hikizan(int sum, int Hikizan, int Kakezan){
        super(sum, Hikizan, Kakezan);
    }

    @Override
    public void hikizan(){
        //コンストラクタ２_くまさん流掛け算
        for(int i = 0 ; i < 2; i++){
            System.out.println(m);
        }
    }
}

public class Warizan extends Enzan{
    //コンストラクタ
    public Warizan(int sum, int Hikizan, int Kakezan){
        super(sum, Hikizan, Kakezan);
    }
    @Override
    public void Kumasan_Warizan(){
        for(int i = 0; i < 2; i++){
            Speak();
        }
    }
}
