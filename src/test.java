public class test {

    public void method1(){
        System.out.println("a");
    } // method

    public test(){
        System.out.println("b");
    } //constructor

    static {    System.out.println("c"); //block
    }
     }


       class test2 {

       public static void main(String[]args){

       test test = new test();
       test.method1();
//c b a
        }
        }
