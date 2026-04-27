package skillbox;

import java.io.File;

public class Task {
    public static void main(String[] args) {
        // 82634280522 байт
        File file = new File("C:\\Users\\chika\\Videos\\Chuzhie.dengi.S01.2025.WEB-DL.2160p.SDR.ExKinoRay");
        System.out.println(sizeFile(file, TypeOfValue.GIGABYTES));
    }

    public static double sizeFile(File file, TypeOfValue typeOfValue) {
        // если это конечный файл - ретерн размер, а если это директория - нужно посчитать размер всех файлов
        if (file.isDirectory()) {
            double totalSize = 0;

            for (File f : file.listFiles()) {
                if (!f.isDirectory()) {
                    totalSize += f.length();
                } else {
                    totalSize += sizeFile(f, TypeOfValue.BYTES);
                }
            }
            return convertFromBytes(totalSize, typeOfValue);
        } else {
            return file.length();
        }
    }

    public static double convertFromBytes(double bytes, TypeOfValue typeOfValue) {
        switch (typeOfValue) {
            case BYTES:
                return bytes;
            case KILOBYTES:
                return bytes / 1024;
            case MEGABYTES:
                return bytes / (1024 * 1024);
            case GIGABYTES:
                return bytes / (1024 * 1024 * 1024);
            default:
                throw new IllegalArgumentException("Ошибка");
        }
    }


    // написать метод который принимает значение в байтах, константу тайпОфВалью и возвращает дабл в нужной величине,
    // метод конвертор
}
