class PassArray {
    public static void main(String[] args) {
        String [] text = {"a","d","c","q","p","o","t","u","h","f","b","m",};

        byte   [] bt;
        short  [] sh;
        int    [] month_day = new int[10];
        long[] lon = new long[20];
        long lon2[] = new long[20];
        long []lon3 = new long[20];

        float  [] fl = new float[200];
        double [] db;

        char   [] ch = new char[23];
        boolean[] bl = new boolean[10];

        int[] month_days = {31,28,31, 30,31,30, 31,31,30, 31,30,31};

        // initialized :
        // for byte - double - 0
        // for boolean - false
        // for String - null
       /* for(int i = 0 ; i < 12; i++){
            System.out.println("[In month - " + (i+1) +" ] = " + month_days[i] + " days");
        } */

        for(int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < text.length/2; i++) {
            String test;
            test = text[i];
            text[i] = text[text.length-i-1];
            text[text.length-i-1] = test;
        }

        for(int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");
        }
    }
}