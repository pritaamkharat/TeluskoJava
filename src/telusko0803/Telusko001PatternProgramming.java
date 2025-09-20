package telusko0803;

public class Telusko001PatternProgramming {
    public static void main(String[] args) {
        int n=9;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
//                if (i==j || i+j==n-1)  //12
//                if (i+j==n-1)  //13
//                if (i==j || i+j==n-1 || i==0 || i==n-1 || j==0 || j==n-1) //14
//                if (i==j || i+j==n-1 || i==0 || i==n-1 || j==0 || j==n-1 || i+j==(n-1)/2) //15
//                if (i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)*1.5) //16
//                if (i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/2) //17
//                if (i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/2 || (j==0 && i>(n-1)/2) || (j==n-1 && i>(n-1)/2) || i==n-1)  //18
//                if (i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)*1.5 || i==0 || j==0 || i==n-1 || j==n-1)  //19
//                if (j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) //20
//                if ((i==j && i<=(n-1)/2) || (i+j==n-1 && i<=(n-1)/2) || (j==(n-1)/2 && i>=(n-1)/2)) //  Y // 21
//                if (j==0 || j==n-1 || i==j) //22
//                if (j==0 || j==n-1 || (i==j && i<=(n-1)/2) || (i+j==n-1 && i<=(n-1)/2)) //23
//                if((i==0 && j>0 && j<0.75*(n-1)) || (i==n-1 && j>0 && j<0.75*(n-1))
//                        || (j==0 && i>0 && i<n-1) || (j==(n-1)*0.75 && i>0 && i<n-1) || (i==j && i>=(n-1)/2)) //24
                    if (i+j>=(n-1)/2 && (j-i)<=(n-1)/2 && i<=(n-1)/2)  //25
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
