package fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "| [Папка] " + name);
        for (FileSystemComponent component : components) {
            component.printStructure(indent + "   ");
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    public FileSystemComponent getChild(int index) {
        return components.get(index);
    }
}

