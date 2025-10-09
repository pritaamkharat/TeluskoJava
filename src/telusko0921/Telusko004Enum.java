package telusko0921;

enum Result
{
//    PASS,FAIL,NR;
    PASS("Passed");

//    public static final Result PASS = new Result();
//    public static final Result FAIL = new Result();
//    public static final Result NR = new Result();
    String str;
    Result(String str){
        this.str= str;
        System.out.println("Real instance/ Object created"+str);
    }

    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}


enum StatusLevel{
    INFO(1), WARN(2), ERROR(3);

    public int getLevel() {
        return level;
    }

    private final int level;

    StatusLevel(int level) {
        this.level = level;
    }


}

public class Telusko004Enum {
    public static void main(String[] args) {
//        Result pass = Result.PASS;
        Result.PASS.setMarks(50);
        System.out.println(Result.PASS.getMarks());
        System.out.println(Result.valueOf("PASS"));
//        System.out.println(Result.valueOf("PASS1"));     //java.lang.IllegalArgumentException

        System.out.println(StatusLevel.INFO.getLevel());




    }
}
