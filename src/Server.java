import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Server {
	public static void main(String[] args) {
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
	    
		ArytmetykaServant as = new ArytmetykaServant();
	    orb.connect(as);
	    
	    PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("ref.ior")));
			
			out.println(orb.object_to_string(as));
	        out.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
        
        
        java.lang.Object sync = new java.lang.Object();
        synchronized (sync) {
            try {
				sync.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}
