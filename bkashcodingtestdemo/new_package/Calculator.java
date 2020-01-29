/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import bkashcodingtestdemo.*;

/**
 *
 * @author OMI
 */
public class Calculator {
    
    private Command command;
    

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void calculate()
    {
        this.command.execute();
    }
    
}
