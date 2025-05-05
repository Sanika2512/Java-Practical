import java.util.*;
class Student {
    protected int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

  
    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

interface Sports {
    int sMarks = 10; 
    void set(); 
}

class Result extends Test implements Sports {
    private int total;

    @Override
    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    public void displayResult() {
        total = sub1 + sub2 + sMarks;
        System.out.println("Roll No: " + rollNo);
        getMarks();
        set();
        System.out.println("Total Marks: " + total);
    }
}

public class ResultTest {
    public static void main(String[] args) {
        Result student1 = new Result();

        student1.setRollNo(133);

        student1.setMarks(85, 90);

        student1.displayResult();
    }
}
