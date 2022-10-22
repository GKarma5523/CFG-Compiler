//              Garrett Kuns
//              CS 4110 - Online
//              Assignment #2
//              Dr. Rague
//              Due: 10/22/22
//              Version 1.0
//-------------------------------------------------------------------------
// A CFG for alphabet {x,y,z} that recognizes the language consisting of 
// all strings that start with z, followed by N x's (N >= 0), followed by 
// twice as many y's, and ending with z. Test your program with the 
// following input strings:
// zz, zxxyyz, zxxyyyy, zxyyz, zxxyyyyz
//-------------------------------------------------------------------------

import java.io.*;

//-------------------------------------------------------------------------
// This is main test code for this program
// Version 1.0
//-------------------------------------------------------------------------
public class CFG4 {
   public static void main(String[] args)
   {
      // Language: all strings that start with z, followed by N x's (N >= 0), 
      // followed by twice as many y's, and ending with z. 
      String[] C = {"S=>zTz",
                    "S=>zz", 
                    "T=>xTyy",
                    "T=>xRyy",
                    "T=>R",
                    "R=>xyy",};

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