public class NewExceptions{
    public static void main(String[] args){
        try{
            //System.out.println(Operations.summ(1, 2));
            System.out.println(Operations.summ(1, 3));
            //System.out.println(Operations.subtr(0, 2));
            System.out.println(Operations.subtr(5, 2));
            //System.out.println(Operations.mult(1, 2));
            System.out.println(Operations.mult(8, 2));
            //System.out.println(Operations.divis(4, 2));
            System.out.println(Operations.divis(10, 5));

        }
        catch(CustomUnsupportedOperationException ex){

            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }


}

class Operations{

    public static int summ(int a, int b) throws CustomUnsupportedOperationException{
        if(a==2 || b==2) throw new CustomUnsupportedOperationException("Мы не выполняем сложение с числом 2");
        return a+b;
    }

    public static int subtr(int a, int b) throws CustomUnsupportedOperationException{
        if(a==0) throw new CustomUnsupportedOperationException("Мы не можем вычитать из 0");
        return a-b;
    }

    public static int mult(int a, int b) throws CustomUnsupportedOperationException{
        if(a==1 || b==1) throw new CustomUnsupportedOperationException("Умножать на 1 скучно!");
        return a*b;
    }

    public static int divis(int a, int b) throws CustomUnsupportedOperationException{
        if(b!=5) throw new CustomUnsupportedOperationException("Делить можно только на 5");
        return a/b;
    }

}

class CustomUnsupportedOperationException extends Exception{

    public CustomUnsupportedOperationException(String message){
        super(message);
    }
}