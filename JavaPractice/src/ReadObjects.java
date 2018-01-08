import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args){
        System.out.println("Reading objects...");
        try(FileInputStream fi = new FileInputStream("people.bin")){
            ObjectInputStream oi = new ObjectInputStream(fi);
            Person p1 = (Person)oi.readObject();
            System.out.println(p1);
            Person p2 = (Person)oi.readObject();
            System.out.println(p2);
            oi.close();
        }
        catch(FileNotFoundException e){

            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
