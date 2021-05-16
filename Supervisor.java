package com.company;
import com.company.instructionexception.InstructionException;
import com.company.instructions.Instruction;
import com.company.instructions.*;

import java.io.*;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Supervisor {
    CalculatorContext ctx = new CalculatorContext();
    Supervisor(String[] args) {

        InstructionFactory uff = new InstructionFactory("C:\\Users\\sasha\\IdeaProjects\\Calculator\\src\\com\\company\\InstructionConfig.txt");
        try {
            if (args.length == 0) {
                Scanner in = new Scanner(System.in);
                while (in.hasNext()) {
                    String line = in.nextLine();
                    if (line.charAt(0) == '#') {
                        continue;
                    }
                    String[] comArgs;
                    String delimeter = " ";
                    comArgs = line.split(delimeter);
                    Instruction next = uff.makeInstruction(comArgs[0]);
                    try {
                        next.Execute(comArgs, ctx);
                    }
                    catch (Exception e) {
                        Logger.getGlobal().log(Level.WARNING, e.toString());
                    }
                    //next.Execute(comArgs, ctx);
                }
            }
            else {
                File file = new File(args[0]);
                FileReader fileReader = new FileReader(file);
                BufferedReader buf = new BufferedReader(fileReader);
                String line = buf.readLine();

                while (line != null) {
                    if (line.charAt(0) == '#') {
                        line = buf.readLine();
                        continue;
                    }
                    String[] comArgs;
                    String delimeter = " ";
                    comArgs = line.split(delimeter);
                    Instruction next = uff.makeInstruction(comArgs[0]);
                    try {
                        next.Execute(comArgs, ctx);
                    }
                    catch (InstructionException e) {
                        Logger.getGlobal().log(Level.WARNING, e.toString());
                    }

                    line = buf.readLine();
                }
                //BufferedReader reader = new
            }
        }
        catch (FileNotFoundException fileNotFoundErr) {
            fileNotFoundErr.printStackTrace();
        }
        catch (IOException ioErr) {
            ioErr.printStackTrace();
        }

        //Instruction abab = uff.makeInstruction("DEFINE");
        //abab.Execute(args, ctx);
    }
}
