import java.io.BufferedReader;

import java.io.*;

//ここはコピーを実施
class Dog{
    private String Name;
    //問題７−2
    private int Age;

    //問題７−4
    private String Kind;

    //問題７−2
    public void SetAge(int age){
        Age = age;
    }

    //問題７−4
    public void Setkind(String kind){
        Kind = kind;
    }

    //メソッド1
    public void SetName( String nm ){
        Name = nm;
    }

    //メソッド2
    public void ShowProfile(){
        System.out.println( "名前は、" + Name + "です。年齢は" + Age + "歳です.種類は" + Kind + "県です");
    }
}

//問題7-5
class CoinCase{
    //フィールドの設定：コインの初期値を０にする
    private int YEN500 = 0;
    private int YEN100 = 0;
    private int YEN10 = 0;
    private int YEN5 = 0;
    private int YEN1 = 0;

    //ここでコインを追加する
    public void AddCoin(int kind, int count){ //種類、枚数
        switch (kind){
            case 500:
                YEN500 += count;
                break;
            case 100:
                YEN100 += count;
                break;
            case 10:
                YEN10 += count;
                break;
            case 5:
                YEN5 += count;
                break;
            case 6:
                YEN1 += count;
                break;
        }
    }

    //ここで硬化の総数を取得する
    public int GetCount(int kind){
        switch(kind){
            case 500:
                return YEN500;
            case 100:
                return YEN100;
            case 10:
                return YEN10;
            case 5:
                return YEN5;
            case 1:
                return YEN1;
        }
        return 0;
    }

    //硬貨の総額を取得する。
    public int GetAmount(){
        return (YEN500 * 500) + (YEN100 * 100) + (YEN10 * 10) +(YEN5 * 5) + (YEN1 * 1);
    }
}

    //果物の種類と値段がどうなっているのかを確認

public class Excirese6{
    public static void main(String[] args) throws IOException{
        //問題７−１
        Dog a = new Dog();

        a.SetAge(15);
        a.SetName("くまさんA");
        a.ShowProfile();

        //問題７−3
        Dog b = new Dog();
        b.SetAge(20);
        b.SetName("くまさんB");
        a.ShowProfile();

        //問題７−3
        Dog c = new Dog();
        c.SetAge(20);
        c.SetName("くまさんC");
        c.ShowProfile();

        //問題７−4
        Dog d = new Dog();
        d.SetAge(20);
        d.SetName("くまさんD");
        d.Setkind("バター");
        d.ShowProfile();

        //問題7-5
        //ここはかなり大事
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        CoinCase f = new CoinCase();

        for(int i = 0; i < 10; i++){
            System.out.print( "硬貨の種類は?" );
            int kind = Integer.parseInt( e.readLine() );
            System.out.print( "硬貨の枚数は?" );
            int count = Integer.parseInt( e.readLine() );

            f.AddCoin(kind, count);
        }
        System.out.print( "500円は" +  f.GetCount(500) );
        System.out.print( "100円は" +  f.GetCount(100) );
        System.out.print( "50円は" +  f.GetCount(50) );
        System.out.print( "10円は" +  f.GetCount(10) );
        System.out.print( "1円は" +  f.GetCount(1) );
    }

}