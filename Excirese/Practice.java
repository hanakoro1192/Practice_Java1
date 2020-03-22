package Excirese;

class Practice {
    public static void main(String[] args) {
        //練習問題1-2
        // int x = 11;

        //練習問題1-3
        int x = 13;
        int y = 17;
        System.out.println("x = " + x + "y = " + y);

        int sum = x + y;
        int Hang = x * y;
        System.out.println(Hang);

        int a = x + 7;
        int b = x * 7;
        System.out.println(a + b);

        int c = x / 2;
        System.out.println(c);


        // System.out.println("x = " + x + "y = " + y);

        //練習問題 1 - 7
        int e = 3;
        int f = 7;
        int g;
        g = f;
        e = f;
        g = e;

        System.out.println("e = " + e + "y = " + y);

        //練習問題 1 - 8
        int h = x + 19;
        int i = x + 23;
        int z = h * i;

        System.out.println(z);

        int j = 15;
        System.out.println(j * 2);
        System.out.println(j * 3);
        System.out.println(j * 4);
        //繰り返し分を使ってみる

        int k = 10;
        System.out.println(k * k);
        System.out.println(k * k * k);
        System.out.println(k * k * k * k);
        //繰り返し分を使ってみる

        //練習問題 1 - 11
        int l = 20;
        if(l / 3 == 0){
            System.out.println("OK");
        }else{
            System.out.println("だめ");
        }

        int m = 30;

        System.out.println("商" + (m % 3) + "余り" + (m / 3));

        int o = 40;
        o++;
        System.out.println(o);

        o--;
        System.out.println(o);
    }
}