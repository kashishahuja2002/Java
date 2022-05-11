// Program for packages and its heirarchy

import org.A;
import org.B;
import org.tech.C;

class Package
{
	public static void main(String...args)
	{
		new A().show();
		new B().show();
		new C().show();	
	}
}