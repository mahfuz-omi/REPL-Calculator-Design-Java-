/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

/**
 *
 * @author OMI
 */
public class MemoryDataManipulator implements DataManipulator{
    
    private Memory memory;

    public MemoryDataManipulator(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void add(String data) {
        int oldData = Integer.parseInt(memory.get());
        int increment = Integer.parseInt(data);
        int newData = oldData + increment;
        memory.set(String.valueOf(newData));
    }

    @Override
    public void sub(String data) {
        int oldData = Integer.parseInt(memory.get());
        int decrement = Integer.parseInt(data);
        int newData = oldData - decrement;
        memory.set(String.valueOf(newData));
    }

    @Override
    public void clear() {
        memory.set(String.valueOf(0));
    }

    @Override
    public String get() {
        return memory.get();   
    }

    @Override
    public void set(String data) 
    {
        memory.set(data);
    }
    
    

    

    
    
}
