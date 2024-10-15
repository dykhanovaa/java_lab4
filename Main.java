import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double srAr;
        try {
            for(int i=0; i < arr.length+3; i++) {

                sum+= arr[i];
            }

//            srAr = (double) sum/(arr.length);
            srAr = (double) sum/0;
            System.out.println(srAr);
        } catch (ArithmeticException ArEx) {
            System.out.println("Возникла арифметическая ошибка (возможно деление на ноль)");
            ArEx.printStackTrace();
            srAr=0;
        }catch (ArrayIndexOutOfBoundsException OutOfBoundEx) {
            System.out.println("Где-то индекс массива вышел за его пределы");
            OutOfBoundEx.printStackTrace();
            srAr=0;
        }catch (ArrayStoreException ArStEx) {
            System.out.println("Присвоение элементу массива несовместимого типа");
            ArStEx.printStackTrace();
            srAr=0;
        }
    }
}