public class ConstructorsExercise {
    public static void main(String[] args) {

        Student s1 = new Student(15,"Ankith",92.3f);
        System.out.println(s1.name);

//        if no arguments are passed to the constructor
        Student s2 = new Student();
        System.out.println(s2.name);

//        Here a reference variable s1 of object can be passed to the constructor
//        such that this.name = other.name
//        that is random.name = s1.name   output: Ankith
        Student random = new Student(s1);
        System.out.println(random.name);

//        Here both ref var user1 and user2 are pointing towards same object in heap
//        so user2.name = user1.name
        Student user1 = new Student(01,"Raghu",82.3f);
        Student user2 = user1;
        System.out.println(user2.name);


    }
}
class Student{
    int rno;
    String name;
    float marks;


// call the default values
    Student(){
//        using this(); to call constructor by passing some default values
        this(0,"default",100.0f);

    }
//    to call this constructor using reference variable of object
    Student(Student other){
        this.name=other.name;
    }
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name = name;
        this.marks = marks;
    }
}
