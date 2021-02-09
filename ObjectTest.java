package Test1;

public class ObjectTest {
    public static void main(String[] args) {
        Student1 student1=new Student1("hh");
        System.out.println(student1.getName().getClass());
    }
}

class Student1{
    private Object name;

    public Student1(Object name) {
        this.name = name;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }
}
