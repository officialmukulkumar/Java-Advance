package my;

import javax.ejb.*;
//@Stateless
//@Singleton
//@Stateful
@Singleton(mappedName = "xyz")
public class Sum implements SumInter {

    int x;
    int num;

    @Override
    public int square(int a) {
        x = a;
        return a * a;

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void incrementNum() {
        num++;

    }

    @Override
    public int showNum() {
        return num;
    }

}
