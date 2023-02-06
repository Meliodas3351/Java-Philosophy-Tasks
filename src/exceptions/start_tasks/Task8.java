package exceptions.start_tasks;

public class Task8 {
    public static void main(String[] args) throws MyException {
        Test test = new Test();
        try {
            test.test();
        }catch (MyException e){
            e.printStackTrace();
        }
    }


}

class Test {
    void test() throws MyException {
        throw new MyException();
    }
}

