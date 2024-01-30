import java.util.jar.JarEntry;
import java.util.ArrayList;
import java.util.List;

public class Training{
    public static void main(String[] args) {

        //1. Create 10 students Objects
        Student s1=new Student(1, "Aditi", "aditi@gmail.com", "1234561231");
        System.out.println(s1);
        Student s2=new Student(1, "Amol", "amol@gmail.com", "1234561232");
        Student s3=new Student(1, "Bhavya", "bhavya@gmail.com", "1234561233");
        Student s4=new Student(1, "Chirag", "Chirag@gmail.com", "1234561234");
        Student s5=new Student(1, "Devang", "devnag@gmail.com", "1234561235");
        Student s6=new Student(1, "Ridhdhi", "ridhdhi@gmail.com", "1234561236");
        Student s7=new Student(1, "Viha", "viha@gmail.com", "1234561237");
        Student s8=new Student(1, "Yashvi", "yashvi@gmail.com", "1234561238");
        Student s9=new Student(1, "Uday", "uday@gmail.com", "1234561239");
        Student s10=new Student(1, "Zallari", "zallari@gmail.com", "1234561299");

        //2.Create 3 trainers
        TechStack ts11=new TechStack(1, "Cpp", "Google uses Cpp");
        TechStack ts12=new TechStack(2, "Java", "Java is amazing");
        TechStack ts21=new TechStack(3, ".NET", "Most people do not like this language");
        TechStack ts22=new TechStack(4, "Ruby", "Ruby on Rails is famous");
        TechStack ts31=new TechStack(5, "Python", "It is in a boom");
        List<TechStack> tl1=new ArrayList<>();
        tl1.add(ts11);
        tl1.add(ts12);
        List<TechStack> tl2=new ArrayList<>();
        tl2.add(ts21);
        tl2.add(ts22);
        List<TechStack> tl3=new ArrayList<>();
        tl3.add(ts21);
        tl3.add(ts11);
        Trainer t1=new Trainer(1, "Jay", "jay@Gmail.com", "5637489123", tl1);
        System.out.println(t1);
       
       
        Trainer t2=new Trainer(2, "Jeni", "jeni@Gmail.com", "6637489123", tl2);
        System.out.println(t2);
        Trainer t3=new Trainer(3, "Suryadip", "suryadip@Gmail.com", "7637489123", tl3);
        System.out.println(t3);

        // creating ans 

        Answer a11=new Answer(11, "ans11");
        Answer a12=new Answer(12, "ans12");
        Answer a13=new Answer(13, "ans13");
        Answer a14=new Answer(14, "ans14");

        Answer a21=new Answer(21, "ans21");
        Answer a22=new Answer(22, "ans22");
        Answer a23=new Answer(23, "ans23");
        Answer a24=new Answer(24, "ans24");

        Answer a31=new Answer(31, "ans31");
        Answer a32=new Answer(32, "ans32");
        Answer a33=new Answer(33, "ans33");
        Answer a34=new Answer(34, "ans34");

        Answer a41=new Answer(41, "ans41");
        Answer a42=new Answer(42, "ans42");
        Answer a43=new Answer(43, "ans43");
        Answer a44=new Answer(44, "ans44");

        List<Answer> a1=new ArrayList<>();
        a1.add(a11);
        a1.add(a12);
        a1.add(a13);
        a1.add(a14);

        List<Answer> a2=new ArrayList<>();
        a2.add(a21);
        a2.add(a22);
        a2.add(a23);
        a2.add(a24);

        List<Answer> a3=new ArrayList<>();
        a3.add(a31);
        a3.add(a32);
        a3.add(a33);
        a3.add(a34);
        // private int questionId;
        // private List<Answer> answers;
        // private String answerKey;
        // private int score;
        // private int techStackId;
        // private int assignmentId;
        // Questions:
        Question q11=new Question(1, a3, "1", 3, 3, 2);
        Question q12=new Question(1, a3, "1", 3, 3, 2);



    }
}