package chapter3.s43.test2;

/**
 * 在同一个包中protected相当于与public
 * Created by zhiming.wu on 2017/9/6.
 */
public class Student extends Person {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.a);
        System.out.println(student.getA());
//        student.clone();//可以

        Person person = new Person();
//        person.clone();//编译不通过
        System.out.println("person.a="+person.a);
        System.out.println("person.getA()="+person.getA());
    }
}
