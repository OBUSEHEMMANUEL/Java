package Deitel.Chapter_11;

public class UsingExemption {
    public static void main(String[] args) throws Exception {
        try{
            throwException();
        }catch (Exception e){
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }


    public static void throwException()throws Exception{
try{
    System.out.println("Method throwException");
    throw new Exception();
}catch (Exception e){
    System.err.println("Exception handled in method throwException");
    throw e;
}finally {
    System.err.println("Finally executed in throwException");
}
    }


    public static void doesNotThrowException(){
        try{
            System.out.println("Method doesNotThrowException");
        }catch (Exception e){
            System.err.println(e);
        }finally {
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}