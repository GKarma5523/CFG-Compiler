//              Garrett Kuns
//              CS 4110 - Online
//              Assignment #2
//              Dr. Rague
//              Due: 10/22/22
//              Version 1.0
//-------------------------------------------------------------------------
// A CFG for alphabet {a,b} that recognizes the language consisting of all 
// strings that contain exactly one b, have 2N a's (N >= 0, N is an integer) 
// before the b, and 2N+1 a's after the b. Test your program with the 
// following input strings:
// ba, aaabaaaa, aabaaa, abaa, aaaabaaa
//-------------------------------------------------------------------------

import java.io.*;

//-------------------------------------------------------------------------
// This is main test code for this program
// Version 1.0
//-------------------------------------------------------------------------
public class CFG3 {
   public static void main(String[] args)
   {
      // Language: all strings that contain exactly one b, have 2N a's 
      // (N >= 0, N is an integer) before the b, and 2N+1 a's after the b. 
      String[] C = {"S=>aaSaa",
                    "S=>ba"};

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