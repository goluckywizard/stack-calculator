package com.company;

import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Print implements Instruction{
    public void Execute(Object[] args, CalculatorContext ctx) {
        double temp = ctx.getStack().getFirst();
        System.out.println(temp);
        Logger.getGlobal().log(Level.FINEST, "PRINT");
    }
}
