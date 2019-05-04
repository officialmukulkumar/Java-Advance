
package my;

import javax.ejb.Remote;

@Remote
public interface SumInter {
    public int square(int a);
    public int getX();
    public void incrementNum();
    public int showNum();
}
