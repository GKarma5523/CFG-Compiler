//              Garrett Kuns
//              CS 4110 - Online
//              Assignment #2
//              Dr. Rague
//              Due: 10/22/22
//              Version 1.0
//-------------------------------------------------------------------------
// This program is a CFG class that will verify if a string is accepted 
// based on the production rules given.
//-------------------------------------------------------------------------

// Complier directives
import java.util.*;

public class CFG {
    String[] Code;
    char startNT;
    String newString;
    
    //-------------------------------------------------------------------------
    // This is the main constructor method for the CFG class.
    // Version 1.0
    //-------------------------------------------------------------------------
    public CFG(String[] C) {
        Code = C;
        setStartNT(Code[0].charAt(0));
    }
    
    //-------------------------------------------------------------------------
    // This method will get the starting non-terminal.
    // Version 1.0
    //-------------------------------------------------------------------------
    public char getStartNT() {
        return startNT;     // return the start symbol
    }
    
    //-------------------------------------------------------------------------
    // This method will set the starting non-terminal.
    // Version 1.0
    //-------------------------------------------------------------------------
    public void setStartNT(char stNT) {
        this.startNT = stNT;     // set the start symbol
    }
    
    //-------------------------------------------------------------------------
    // This method will get the production rules and calculate if the string is
    // accepted or not.
    // Version 1.0
    //-------------------------------------------------------------------------
    public boolean processData(String inString, String wkString) {
        if (inString == wkString) {    // if the input string is equal to the working string
            return true;
        }
        if (wkString.length() > inString.length()) {    // verify the working string is no longer than the input string
            return false;
        }
        for (int j = 0; j < wkString.length(); j++) {
            if(Objects.equals(wkString, inString)) {    // compare the working string to the input string during loop
                return true;
            }
            if (Character.isUpperCase(wkString.charAt(j))) {
                for (int i = 0; i < Code.length; i++) {
                    if (Code[i].charAt(0) == wkString.charAt(j)) {
                        newString = wkString.substring(0, j) + Code[i].substring(3) + wkString.substring(j + 1);
                        if (processData(inString, newString) == true) {
                            return true;
                        }
                    }
                }
            }
            else if (j > wkString.length()) {
                return false;
            }
        }
        return false;
    }
}
