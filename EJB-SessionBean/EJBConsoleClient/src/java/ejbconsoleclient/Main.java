
package ejbconsoleclient;

import javax.naming.*;
import my.SumInter;

public class Main {

    public static void main(String[] args) {
        
        try {
            InitialContext ctx = new InitialContext();
            SumInter s = (SumInter)ctx.lookup("xyz");
            System.out.println(s.square(11));
            System.out.println(s.getX());
            s.incrementNum();
            System.out.println(s.showNum());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
