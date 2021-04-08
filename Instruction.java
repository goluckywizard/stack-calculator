package com.company;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.resource.spi.work.ExecutionContext;

public interface Instruction {
    public void Execute(Object[] args, CalculatorContext ctx) throws InstructionException;
}

class InstructionException extends Exception {
    InstructionException(String message) {
        super("Problem with executing Instruction: "+message);
    }
}

class ArgsException extends InstructionException {
    ArgsException(String message) {
        super("Problem with arguments: "+message);
    }
}

class DefineException extends InstructionException {
    DefineException(String message) {
        super("Problem with define: "+message);
    }
}
