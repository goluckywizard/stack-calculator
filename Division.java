package com.company;

import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Division implements Instruction  {
    public void Execute(Object[] args, CalculatorContext ctx) throws ArithmeticException, InstructionException {
        if (ctx.getStack().isEmpty())
            throw new ArgsException("there isn't such operands in stack");
        Double first = ctx.getStack().pop();
        if (ctx.getStack().isEmpty())
            throw new ArgsException("there isn't such operands in stack");
        Double second = ctx.getStack().pop();
        if (first == 0)
            throw new ArithmeticException();
        ctx.getStack().addFirst(second/first);
        Logger.getGlobal().log(Level.FINEST, second+" DIVIDE "+first);
    }
}
