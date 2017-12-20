package JavaIODecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class InputTest {
    public static void main(String[] args){
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("DecoratorPattern/src/JavaIODecorator/test.txt")));
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
