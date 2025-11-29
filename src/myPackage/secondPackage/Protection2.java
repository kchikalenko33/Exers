package myPackage.secondPackage;

import myPackage.firstPackage.Protection;

public class Protection2 extends Protection {
    public  void  test() {
        System.out.println(number_public);
        System.out.println(number_protected);   // OK: protected, доступ через наследование
        // System.out.println(n_def); // ОШИБКА: default из другого пакета не видно
        // System.out.println(n_pri); // ОШИБКА: private не видно нигде вне класса

    }
}
