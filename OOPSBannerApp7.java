public class OOPSBannerApp7
{
public static String[] getOPattern()
{
String[] o = {	
"      ******     ", 
"    **      **   ", 
"  **          ** ", 
"  **          ** ", 
"  **          ** ", 
"  **          ** ", 
"  **          ** ", 
"    **      **   ",  
"      ******     ",  
};
return o;
}

public static String[] getPPattern()
{
	String[] p= {
" ********      ",
" **      **    ",
" **        **  ",
" **      **    ",
" ** ******     ",
" **            ",
" **            ",
" **            ",
" **            ",
	};
	return p;
}
	
public static String[] getSPattern()
{
	String[] s = {
"     ******      " ,
"   **            " ,
"  **             " ,
"    **           " ,
"      ****       " ,
"           **    " ,
"            **   " ,
"          **     " ,
"    ******       " ,
};
return s;
}
public static void main(String[] args)
{
	String[] oPattern = getOPattern();
	String[] pPattern = getPPattern();
	String[] sPattern = getSPattern();
	
	
for(int i=0; i < oPattern.length; i++)
{
	System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
	                                           
}

}
}