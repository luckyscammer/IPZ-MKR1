package fileSystem;

public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "* [Файл] " + name + " (" + size + " байт)");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }
}

