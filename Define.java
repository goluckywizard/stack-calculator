package com.company;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.resource.spi.work.ExecutionContext;

public class Define implements Instruction {
    public void Execute(Object[] args, CalculatorContext ctx) {
        //System.out.println(args[2]);
        ctx.getMap().put(args[1].toString(), Double.valueOf(args[2].toString()));
        //System.out.println(Double.valueOf(args[2].toString())*2);
    }
}
