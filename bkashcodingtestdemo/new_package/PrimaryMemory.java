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
public class PrimaryMemory implements Memory{
    
    private String data = "0";

    @Override
    public String get() {
        return this.data;
    }

    @Override
    public void set(String data) {
        this.data = data;
    }
    
}
