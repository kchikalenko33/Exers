package reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectApi {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<String> stringClass = String.class;
        String phrase = "dsgdfh";
        Class<?> s = phrase.getClass();
        Class<?> class1 = Class.forName("java.util.ArrayList");
        Parcel parcel = new Parcel(1.0, "pp", true);

        Class<Parcel> parcelClass = Parcel.class;
        Field field = parcelClass.getDeclaredField("isInsured");
      //  Field field1 = parcelClass.getField("isInsured"); // только публичные методы
        System.out.println(field);
        field.setAccessible(true); // отключение проверки доступа
        System.out.println(field.get(parcel));
        System.out.println(field);

        Method method = parcelClass.getDeclaredMethod("parcelMood");
        method.setAccessible(true);
        System.out.println(method);
        method.invoke(parcel);

        Method method1 = parcelClass.getDeclaredMethod("parcelCalc", int.class, int.class);
        method1.setAccessible(true);
        int res = (int) method1.invoke(parcel, 5, 2);
        System.out.println(res);

        Field fieldFinal = parcelClass.getDeclaredField("NAME");
        fieldFinal.setAccessible(true);
        fieldFinal.set(parcel, "pwd");
        System.out.println(fieldFinal.get(parcel));

        System.out.println("Constructors");

        for (Constructor<?> constructor : parcelClass.getConstructors()) {
            Parameter[] parameters = constructor.getParameters();
            Class<?>[] types = constructor.getParameterTypes();
            System.out.println(constructor.getName());
            System.out.println(Arrays.toString(parameters));
            System.out.println(Arrays.toString(types));
        }

        System.out.println("-");
        superClass(class1);
        System.out.println("___________");
        getInterfaces(class1);
        System.out.println("-------");

        Field[] publicFields = parcelClass.getFields();
        System.out.println(Arrays.toString(publicFields));
        System.out.println(publicFields[0].getModifiers());

        Parcel parcel2 = parcelClass.getDeclaredConstructor(double.class, String.class, boolean.class).newInstance(10.00, "dgds", false);

        System.out.println(parcel2.toString());

    }

    public static void superClass(Class<?> class1) {
        while (class1 != null) {
                System.out.println(class1.getSuperclass());
                class1 = class1.getSuperclass();
        }
    }

    public static void getInterfaces(Class<?> class1) {
        Class<?>[] classes = class1.getInterfaces();
        for (Class<?> class2 : classes) {
            System.out.println(class2);
        }
    }
}
