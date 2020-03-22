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
    public void AddCoin(int money_kind, int count){ //種類、枚数
        switch (money_kind){
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
            case 1:
                YEN1 += count;
                break;
        }
    }

    // //このように引数を変えから同じメソッドでも使える
    // public void AddCoin(int money_kind){
    //     //処理
    // }

    //ここで硬化の総数を取得する 引数がある場合
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

    //練習問題 7 - 6 引数がない場合
    public int GetCount(){
        return YEN500 + YEN100 + YEN100 + YEN10 + YEN1;
    }

    //メソッドは別に異なっていても良い
    //硬貨の総額を取得する。
    public int GetAmount(){
        return (YEN500 * 500) + (YEN100 * 100) + (YEN10 * 10) +(YEN5 * 5) + (YEN1 * 1);
    }

    //練習問題 7 - 6
    //指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。
        public int GetAmount(int money_kind){
            switch(money_kind){
                case 500:
                    return 500 * YEN500;
                case 100:
                    return 100 * YEN100;
                case 10:
                    return 10 * YEN10;
                case 5:
                    return 5 * YEN5;
                case 1:
                    return 1 * YEN1;
            }
            return 0;
        }
}

    //果物の種類と値段がどうなっているのかを確認
    //1.まずどんな果実があるのかを確認する。みかん、ぶどう、キュウイ、りんご、マンゴー
    //2.果実を追加する
    //3.果実の総数を取得する

    class Kazitu{
        //フィールドの指定
        private int orange = 0;
        private int grape = 0;
        private int kyui = 0;
        private int apple = 0;
        private int mango = 0;

        //コンストラクタの設定
        //まずどんな果実があるのかを確認する
        //ここの値段は初期値をゼロにしている
        public void AddFruits(int kinds, int counts){
            switch(kinds){
                case 1000: //みかんの値段
                    orange += counts;
                    break;
                case 500: //ぶどうの値段
                    grape += counts;
                    break;
                case 100: //キュウイの値段
                    kyui += counts;
                    break;
                case 50: //りんごの値段
                    apple += counts;
                    break;
                case 10: //マンゴーの値段
                    mango += counts;
                    break;
            }
        }

        //メソッド１：フルーツを獲得
        public int GetFruits(int kinds){
            switch(kinds){
                case 1000:
                    return orange;
                case 500:
                    return grape;
                case 100:
                    return kyui;
                case 50:
                    return apple;
                case 10:
                    return mango;
            }
            return 0;
        }

        //メソッド２：すべての総数を獲得する　
        public int GetAmounts(){
            return (orange * 1000) + (grape * 500) + (kyui * 100) + (apple * 50) + (mango * 10);
        }
    }

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

        // //問題7-5
        // //ここはかなり大事
        // BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        // CoinCase f = new CoinCase();

        // for(int i = 0; i < 10; i++){
        //     System.out.print( "硬貨の種類は?" );
        //     int kind = Integer.parseInt( e.readLine() );
        //     System.out.print( "硬貨の枚数は?" );
        //     int count = Integer.parseInt( e.readLine() );

        //     f.AddCoin(kind, count);
        // }
        // System.out.print( "500円は" +  f.GetCount(500) );
        // System.out.print( "100円は" +  f.GetCount(100) );
        // System.out.print( "50円は" +  f.GetCount(50) );
        // System.out.print( "10円は" +  f.GetCount(10) );
        // System.out.print( "1円は" +  f.GetCount(1) );

        // Kazitu g = new Kazitu();

        //問題7-6
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        CoinCase f = new CoinCase();
        for(int i = 0; i < 10; i++){
            System.out.println("硬貨の種類はなんですか？");
            int kind = Integer.parseInt(e.readLine());
            System.out.println("硬貨の枚数は？");
            int count = Integer.parseInt(e.readLine());

            f.AddCoin(kind, count);
        }

        System.out.print( "500円は" +  f.GetCount(500) );
        System.out.print( "100円は" +  f.GetCount(100) );
        System.out.print( "50円は" +  f.GetCount(50) );
        System.out.print( "10円は" +  f.GetCount(10) );
        System.out.print( "1円は" +  f.GetCount(1) );

        System.out.print( "総枚数は" + f.GetCount());

        System.out.print( "総額は" + f.GetAmount());

        //これでもOK
        f.GetCount(100);

        //メソッドには引数が存在する場合と存在しない場合とがある


            //備考
        Kazitu g = new Kazitu();
        for(int j = 0; j < 10; j++){
            System.out.println("果実の種類は？");
            int kinds = Integer.parseInt(e.readLine());
            System.out.println("硬化の値段は？");
            int counts = Integer.parseInt(e.readLine());

            g.AddFruits(kinds, counts);
        }

        System.out.print( "1000円は" +  g.GetFruits(1000));
        System.out.print( "500円は" +  g.GetFruits(500));
        System.out.print( "100円は" +  g.GetFruits(100));
        System.out.print( "50円は" +  g.GetFruits(50));
        System.out.print( "10円は" +  g.GetFruits(10));

        g.GetAmounts();
    }

}