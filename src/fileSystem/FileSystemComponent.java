package fileSystem;

public interface FileSystemComponent {
    void printStructure(String indent);
    int getSize();
    void rename(String newName);
}
