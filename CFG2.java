//              Garrett Kuns
//              CS 4110 - Online
//              Assignment #2
//              Dr. Rague
//              Due: 10/22/22
//              Version 1.0
//-------------------------------------------------------------------------
// A CFG for alphabet {a,b} that recognizes the language consisting of all 
// strings of length 1 or greater that do not contain the substring aa.  
// Tested with the following input strings:
// abba, abbabaaa, abaabab, bababbab, bbbabba
//-------------------------------------------------------------------------

import java.io.*;

//-------------------------------------------------------------------------
// This is main test code for this program
// Version 1.0
//-------------------------------------------------------------------------
public class CFG2 {
   public static void main(String[] args)
   {
      // Language: all strings of length 1 or greater that do not contain 
      // the substring aa.
      String[] C = {"S=>abS",
                    "S=>bS",
                    "S=>ab",
                    "S=>b",
                    "S=>a",};

      String inString, startWkString;
      boolean accept1;
      CFG CFG1 = new CFG(C);
      if(args.length >= 1)
      {
         // Input string is command line parameter
         inString = args[0];
		   char[] startNonTerm = new char[1];
         startNonTerm[0] = CFG1.getStartNT();
		   startWkString = new String(startNonTerm);
         accept1 = CFG1.processData(inString, startWkString);
         System.out.println("  Accept String?  " + accept1);
      }
   } // end main
} // end class