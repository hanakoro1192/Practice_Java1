class Exercise4{
    public static void main(String[] args) {

        //問題4-1
        for(int i = 0; i < 10; i++){
            System.out.println("SPAM");
        }

        //問題4-2
        for(int j = 0; j <= 9; j++){
            System.out.println((3 * j) + "");
        }
        
        //問題4-3
        int x = 1;
        for(int k = 0; k <= 9; k++){
            x *= 2;
            System.out.println("2の" + x + "乗=" + k);
        }

        //問題4-4
        int y = 1;
        for(int i = 2; i <= 7; i++){
            y *= i;
            System.out.println(y);
        }

    }
}