package com.company;

import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Push implements Instruction {
    private boolean isNumber(String s) {
        for (char c : s.toCharArray())
        {
            if (!Character.isDigit(c) && !(c == '.'))
                return false;
        }
        return true;
    }

    public void Execute(Object[] args, CalculatorContext ctx) {
        if (!isNumber(args[1].toString())) {
            Double newVar = ctx.getMap().get(args[1].toString());
            ctx.getStack().addFirst(newVar);
        }
        else {
            ctx.getStack().addFirst(Double.valueOf(args[1].toString()));
        }
        Logger.getGlobal().log(Level.FINEST, "PUSH");
    }
}
