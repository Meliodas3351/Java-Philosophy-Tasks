package exceptions.start_tasks;

public class Task25 {
    public static void main(String[] args) {
        ParentC parentC = new ParentC();
        ParentA parentA = new ParentA();
        try {
            parentA.throwException();
        }catch (ExceptionC e){
            e.printStackTrace();
        }catch (ExceptionB e){
            e.printStackTrace();
        }catch (ExceptionA e){
            e.printStackTrace();
        }
    }
}

class ParentA {
    public void throwException() throws ExceptionA {
        throw new ExceptionA();
    }
}

class ParentB extends ParentA {
    @Override
    public void throwException() throws ExceptionB {
        throw new ExceptionB();
    }
}

class ParentC extends ParentB {
    @Override
    public void throwException() throws ExceptionC {
        throw new ExceptionC();
    }
}

class ExceptionA extends Exception {

}

class ExceptionB extends ExceptionA {

}

class ExceptionC extends ExceptionB {

}