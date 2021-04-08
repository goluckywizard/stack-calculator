package com.company;

import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQRT implements Instruction {
    public void Execute(Object[] args, CalculatorContext ctx) {
        Double operand = ctx.getStack().pop();
        ctx.getStack().addFirst(Math.sqrt(operand));
        Logger.getGlobal().log(Level.FINEST, "SQRT"+operand);
    }
}
