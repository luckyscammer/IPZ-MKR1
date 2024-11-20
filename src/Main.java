import fileSystem.*;

public class Main {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Коренева папка");
        File file1 = new File("Файл1.txt", 1200);
        File file2 = new File("Файл2.txt", 800);

        rootFolder.addComponent(file1);
        rootFolder.addComponent(file2);

        Folder subFolder = new Folder("Підпапка1");
        File file3 = new File("Файл3.txt", 500);
        subFolder.addComponent(file3);

        Folder nestedFolder = new Folder("ВкладенаПідпапка");
        File file4 = new File("Файл4.txt", 300);
        nestedFolder.addComponent(file4);

        subFolder.addComponent(nestedFolder);
        rootFolder.addComponent(subFolder);

        System.out.println("Структура файлової системи:");
        rootFolder.printStructure("");

        System.out.println("\nЗагальний розмір кореневої папки: " + rootFolder.getSize() + " байт");

        nestedFolder.rename("ПереіменованаПідпапка");
        file4.rename("НовийФайл4.txt");
        System.out.println("\nСтруктура після перейменування файлу:");
        rootFolder.printStructure("");
    }
}
