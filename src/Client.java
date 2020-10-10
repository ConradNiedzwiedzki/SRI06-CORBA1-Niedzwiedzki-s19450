import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Client {
	public static void main(String[] args) {
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
		
		FileReader fr = null;
		try {
			fr = new FileReader("ref.ior");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
        try {
			String ior = br.readLine();
			org.omg.CORBA.Object obj = orb.string_to_object(ior);
	        
	        arytmetyka proxy = arytmetykaHelper.narrow(obj);
	        
	        proxy.s1(1);
            proxy.s2(2);
            proxy.Suma();
            
            System.out.println(proxy.wynik());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
