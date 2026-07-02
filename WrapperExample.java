public class WrapperExample {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//
//        swap(a,b);
//      a and b won't be swapped as java is pass by value and not pass by reference
//        System.out.println("a: "+ a +"\tb: "+b);

//        instead of assigning numbers to primitive type int
//        one can assign to Integer which has .methods where it is stored as objects
        Integer num1 = 10;
        Integer num2 = 20;
//        here also won't be swapped
        swap(num1,num2);

//  final keyword assigned to primitive datatype cant be modifies
        final int num = 12;
//        shows error
//        num = 30;

//      where as a class can be made final the values can be modified whereas object cant be reassigned
final A student1 = new A("Ankith");
//error
//student1.name = new A("Raj");



    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }
    static class A{
        final int num = 10;
        String name;

        public A(String name) {
            this.name = name;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object are being destroyed");
    }
}
