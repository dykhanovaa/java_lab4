import java.io.*;

public class Files {
    public static void main(String[] args){
        InputStream inStream = null;
        OutputStream outStream = null;
        try{
            File inFile = new File("C:\\Users\\Alina\\Desktop\\uni\\java\\files\\f1.txt");
            File outFile = new File("C:\\Users\\Alina\\Desktop\\uni\\java\\files\\f2.txt");

            inStream = new FileInputStream(inFile);
            outStream = new FileOutputStream(outFile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inStream.read(buffer)) > 0){
                outStream.write(buffer, 0, length);
            }

            inStream.close();
            outStream.close();

            System.out.println("File is copied successful!");

        }catch (IOException ex){
            System.out.println("Возникли проблемы при работе с файлами");
            ex.printStackTrace();
        }finally {
            try{inStream.close();}catch(IOException e){};
            try{outStream.close();}catch(IOException e){};
        }


    }

}
