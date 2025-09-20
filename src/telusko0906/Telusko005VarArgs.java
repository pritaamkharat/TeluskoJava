package telusko0906;

class Telusko{
    public void courses(String course1, String course2){
        System.out.println("Name of courses are : "+course1+","+course2);

    }

    public void newCourses(String [] courses){
        for (String course : courses){
            System.out.println(course);
        }
    }

    //variable number of arguments
    public void aiCourses(String...courses){
        for (String course : courses){
            System.out.println(course);
        }
    }

    //can not have multiple var args
//    public void aiCourses2(String...courses,int...num){   //compile time error
//        for (String course : courses){
//            System.out.println(course);
//        }
//    }

    public void aiCourses3(String course,int...num){  //This is valid

    }
}

public class Telusko005VarArgs {
    public static void main(String[] args) {
        Telusko t = new Telusko();
        t.courses("samrat","sara");
        String [] c = {"Java","Selenium"};
        t.newCourses(c);

        t.aiCourses("GenAI","ML","DL","BigData");
    }
}
