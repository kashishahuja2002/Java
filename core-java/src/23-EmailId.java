// Program to verify format of email id, whether it is correct or not

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class EmailId
{
	static int index=0;
    public static void main(String...args)
    {
        Scanner sc =new Scanner(in);
        out.println("Enter email id: ");
        String email = sc.next();
        int size=email.length();
        char ch[]=new char[size];
        
        if(email.endsWith(".com") || email.endsWith(".in") || email.endsWith(".net") || email.endsWith(".org"))
        {
		
            boolean flag=false;
            int count=0;
            for(int i=0; i<size;i++)
            {
                ch[i]=email.charAt(i);
                if(ch[i]!='@')
                    count++;
                else
                {
                    index=i-1;
                    flag=true;
                    break;
                }
            }  

            if(flag==true)
            {
                if(!email.endsWith("@.com") && !email.endsWith("@.in") && !email.endsWith("@.net") && !email.endsWith("@.org"))
                {
                    if(count>0 && count<=64)
                    {
                        if(!(ch[0]>=32 && ch[0]<=47) && !(ch[0]>=58 && ch[0]<=64) && !(ch[0]>=91 && ch[0]<=96) && !(ch[0]>=123 && ch[0]<=126))
                        {
                            if(!(ch[index]>=32 && ch[index]<=47) && !(ch[index]>=58 && ch[index]<=64) && !(ch[index]>=91 && ch[index]<=96) && !(ch[index]>=123 && ch[index]<=126))
                            {
                                out.println("Valid");
                            }
                            else
                            out.println("Invalid (Last letter can not be a special character)");
                        }
                        else
                            out.println("Invalid (First letter can not be a special character)");
                    }
                    else
                        out.println("Invalid (Wrong or missing recipient name)");
                }
                else
                    out.println("Invalid (Missing domain)");
            }
            else
                out.println("Invalid (Missing @)");
        }
        else
            out.println("Invalid (Missing Top level domain)");
    }
}