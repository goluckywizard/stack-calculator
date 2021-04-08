package com.company;

import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Plus implements Instruction {
    public void Execute(Object[] args, CalculatorContext ctx){
        Double first = ctx.getStack().pop();
        Double second = ctx.getStack().pop();
        ctx.getStack().addFirst(first+second);

        Logger.getGlobal().log(Level.FINEST, second+"PLUS"+first);
    }
}
