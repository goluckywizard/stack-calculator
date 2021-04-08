package com.company;

import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pop implements Instruction {
    public void Execute(Object[] args, CalculatorContext ctx) {
        ctx.getStack().pop();
        Logger.getGlobal().log(Level.FINEST, "POP");
    }
}
