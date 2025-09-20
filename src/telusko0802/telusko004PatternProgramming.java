package telusko0802;

public class telusko004PatternProgramming {
    public static void main(String[] args) {
          //1
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

          //2
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==0 || i==n-1 || j==0 || j==n-1){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //T 3
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==0 || j==(n-1)/2){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //H 4
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j==0 || i==(n-1)/2 || j==n-1){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //I 5
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==0 || j==(n-1)/2 || i==n-1){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //C 6
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==0 || j==0 || i==n-1){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //E 7
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==0 || j==0 || i==n-1 || i==(n-1)/2){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //A 8
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) || i==(n-1)/2 ||  (j==n-1 && i>0 && i<n-1)) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //C 9
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) ||  (i==n-1 && j>0 && j<n-1)) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //10
//        int i, n = 5;
//        for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((i==0 && j<n-1) || j==0 || (j==n-1 && i>0 && i<n-1) || (i==n-1 && j<n-1)) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
        //11
        int i, n = 5;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) || (j==n-1 && i>0 && i<n-1) || (i==n-1 && j<n-1 && j>0)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}