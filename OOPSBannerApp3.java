public class OOPSBannerApp3 
{
public static void main(String args[])
{

String[] line= new String[10];
line[0] = String.join(" ","     ******      "   ,   "       ******      "   ,   "  ********      "   ,   "     ******      " );
line[1] = String.join(" ","   **      **    "   ,   "     **      **    "   ,   "  **      **    "   ,   "   **            " );
line[2] = String.join(" "," **          **  "   ,   "   **          **  "   ,   "  **        **  "   ,   "  **             " );
line[3] = String.join(" "," **          **  "   ,   "   **          **  "   ,   "  **      **    "   ,   "    **           " );
line[4] = String.join(" "," **          **  "   ,   "   **          **  "   ,   "  ** ******     "   ,   "      ****       " );
line[5] = String.join(" "," **          **  "   ,   "   **          **  "   ,   "  **            "   ,   "           **    " );
line[6] = String.join(" "," **          **  "   ,   "   **          **  "   ,   "  **            "   ,   "            **   " );
line[7] = String.join(" ","   **      **    "   ,   "     **      **    "   ,   "  **            "   ,   "          **     " );
line[8] = String.join(" ","     ******      "   ,   "       ******      "   ,   "  **            "   ,   "    ******       " );
for(int i=0; i<line.length; i++)
{
System.out.println(line[i]);
}
}
}