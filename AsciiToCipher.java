import java.util.*;
import java.io.*;
class AsciiToCipher
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("INCODED (ASCII VALUE)");
		String str=sc.nextLine();
		String lw="";
		StringBuffer sb=new StringBuffer(str);
		outer:while(sb.length()!=0)
		{
			if(sb.length()==1)
				break outer;
			int a=Integer.parseInt(sb.substring(0,2));
			if((a>=65&&a<=90)||(a>=97&&a<=99))
			{
				lw=lw+(char)a;
				sb.delete(0,2);
			}
			else if(a==32)
			{
				lw=lw+" ";
				sb.delete(0,2);
			}
			else
			{
				int b=Integer.parseInt(sb.substring(0,3));
				if(b>=100&&b<=122)
				{
					lw=lw+(char)b;
					sb.delete(0,3);
				}
				else
					sb.delete(0,2);
			}
		}
		System.out.println("DECODED TEXT");
		System.out.println(lw);
		String nw="";
		for(int i=0;i<lw.length();i++)
		{
			char ch=lw.charAt(i);
			int a=(int)ch;
			if((a>=65&&a<=77)||(a>=97&&a<=109))
			{
				a=a+13;
				nw=nw+(char)a;
			}
			else if((a>=78&&a<=90)||(a>=110&&a<=127))
			{
				a=a+13;
				nw=nw+(char)a;
			}
			else if(a==32)
				nw=nw+" ";
			else
				nw=nw+ch;
		}
		System.out.println("CAESAR CIPHER(SHIFT 13)");
		System.out.println(nw);
	}
}
