/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import java.io.File;

/**
 *
 * @author OMI
 */
public class ResourceSingleton {
    private Memory memory;
    private File file;
    private static ResourceSingleton instance;
    
    private ResourceSingleton()
    {
        
    }
    
    public static ResourceSingleton getInstanceUsingDoubleLocking()
    {
        if(instance == null)
        {
            synchronized (ResourceSingleton.class) 
            {
                if(instance == null)
                {
                    instance = new ResourceSingleton();
                    instance.setMemory(new PrimaryMemory());
                    instance.setFile(new File("file.txt"));
                }
            }
        }
        return instance;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
        
}
