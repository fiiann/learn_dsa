package com.fian.learn.coding.pattern;

public class Pattern {
//    case 1
    static void pattern1(int jumlah){
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    case 2

    //INCREASE
    static void pattern21(int jumlah){
        for (int i = 0; i < jumlah+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    alternatif
    static void pattern22(int jumlah){
        for (int i = 0; i < jumlah+1; i++) {
            for (int j = 0; j < jumlah+1; j++) {
                if(i==j){
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    case 3
//    DECREASE
    static  void pattern31(int jumlah){
//        jumlah = jumlah+1;
        for (int i = 0; i < jumlah; i++) {
            for (int j = jumlah ; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern32(int jumlah){
        jumlah = jumlah+1;
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                if(i+j == jumlah-1){
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int jumlah){
        jumlah = jumlah+1;
        for (int i = 1; i < jumlah; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static  void pattern41(int jumlah){
        jumlah = jumlah+1;
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                if(i==j){
                    break;
                }
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int jumlah){
        jumlah = jumlah+1;
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < jumlah; i++) {
            for (int j = jumlah; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int jumlah){
        jumlah = jumlah+1;
        for (int i = 1; i < jumlah; i++) {
            for (int j = 1; j < jumlah; j++) {
                if(i+j > jumlah-1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void  pattern7(int jumlah){
        System.out.println("DECREASE - INCREASE - INCREASE - DECREASE");
        for (int i = 0; i < jumlah; i++) {
            for (int j = jumlah; j > i; j--) {
                System.out.printf("  ");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.printf(" *");
            }


            for (int j = 0; j < i; j++) {
                if(j==0){
                    System.out.printf(" * ");
                }else{
                    System.out.printf("* ");
                }
            }
            for (int j = jumlah; j > i; j--) {
                System.out.printf("  ");
            }
            System.out.println();
        }
    }
    static void mainPattern(int jumlah){
        jumlah = jumlah+1;
        // decrease - increase
        for (int i = 0; i < jumlah; i++) {
            for (int j = jumlah; j > i; j--) {
                System.out.printf("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("================");
        System.out.println();

//        INCREASE - DECREASE
        for (int i = 0; i < jumlah-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("  ");
            }
            for (int j = jumlah-1; j > i; j--) {
                System.out.printf(" *");
            }
            System.out.println();
        }
        pattern7(jumlah);
    }

}
