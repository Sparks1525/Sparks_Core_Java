package chapter7.demo1;

public class Test1 {
    public static void main(String[] args){
        Test1 test1 = new Test1();
        try {
            test1.algExc();
        } catch (Exception e){
            System.out.println("Zero Exception");
        }
    }

    public void algExc() throws ArithmeticException{
        int a = 1;
        int b = 0;
        int result;
        result = a / b;
        System.out.println(result);
    }
}
