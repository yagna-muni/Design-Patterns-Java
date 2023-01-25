package edu.umb.cs680.hw15.fs.util;

import java.util.LinkedList;

import edu.umb.cs680.hw15.fs.Directory;
import edu.umb.cs680.hw15.fs.File;
import edu.umb.cs680.hw15.fs.Link;

public class FileSearchVisitor implements FSVisitor{
	private String fileName = "";
	private LinkedList<File> foundFiles = new LinkedList<File>();

    public FileSearchVisitor(String fileName) {
    	this.fileName = fileName;
	}
    
	public void visit(Link link) { }

    public void visit(Directory dir) { }

    public void visit(File file) {
    	if(file.getName().equals(fileName)){
    		foundFiles.add(file);
    	}
    }
    
    public LinkedList<File> getFoundFiles() {
        return foundFiles;
    }



}
