package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;



import edu.umb.cs680.hw07.Directory;
import edu.umb.cs680.hw07.File;
import edu.umb.cs680.hw07.FileSystem;

import org.junit.jupiter.api.Test;

public class FileTest {
	Directory root = new Directory(null, "root", LocalDateTime.now());
	
	Directory Apps = new Directory(root, "Apps", LocalDateTime.now());
	File xfile = new File(Apps, "x", 10, LocalDateTime.now());
    File yfile = new File(Apps, "y", 15, LocalDateTime.now());
    
    @Test
    public void verifyDirectoryEqualityRoot(){
		assertEquals(true, xfile.isFile()); 
	}
}
