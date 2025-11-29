package myPackage.secondPackage;

import myPackage.firstPackage.Protection;

public class OtherPackage {
    public void test() {
        Protection p = new Protection();
        System.out.println(p.number_public);   // OK: public
        // System.out.println(p.n_pro); // ОШИБКА: protected из другого пакета
        // System.out.println(p.n_def); // ОШИБКА: default из другого пакета
        // System.out.println(p.n_pri); // ОШИБКА: private
    }
}
