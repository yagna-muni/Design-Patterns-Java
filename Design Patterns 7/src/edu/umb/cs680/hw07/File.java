package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
public class File extends FSElement {
    public File(Directory parentDir, String name, int size, LocalDateTime creationTime) {
        super(parentDir, name, size, creationTime);
    }; 
    public boolean isDirectory() {
        return false;
    }
    public boolean isFile() {
        return true;
    }
}
