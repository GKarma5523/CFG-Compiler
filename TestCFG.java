// Test Context-Free Grammar Class
import java.io.*;

public class TestCFG {
   public static void main(String[] args)
   {
      // Language: strings that contain 0+ b's, followed by 2+ a's,
      // followed by 1 b, and ending with 2+ a's.
      String[] C = {"S=>bS",
                    "S=>aaT",
                    "T=>aT",
                    "T=>bU",
                    "U=>Ua",
                    "U=>aa"};

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
