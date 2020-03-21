import java.util.Scanner;

//コマンドライン引数を用いたjavaプログラム
public class Enzan{

    int sum = 10;
    int Hikizan = 20;
    int Kakezan = 30;

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
    public Enzan(){
        System.out.print(sum);
        System.out.print(Hikizan);
        System.out.print(Kakezan);
    }

    //メソッドの方法はおかしいset,getはprivateを使用するときだけ

    //メソッドの作成
    //足し算
    public void sun(int a, int b, int c){
        System.out.println(a + b + c);
    }

    //足し算
    public void Kakezan(int a, int b, int c){
        System.out.println(a - b - c);
    }

    //足し算
    public void Warizan(int a, int b, int c){
        System.out.println(a * b * c);
    }
}

class Keisan extends Enzan{

}
