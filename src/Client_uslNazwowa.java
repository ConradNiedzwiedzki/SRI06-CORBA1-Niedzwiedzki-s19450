import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Client_uslNazwowa {
	public static void main(String[] args) throws InvalidName, NotFound, CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName {
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
	    ArytmetykaServant as = new ArytmetykaServant();
	    orb.connect(as);
	    
	    org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");;
	    NamingContext ncRef = NamingContextHelper.narrow(objRef);
	    NameComponent nc = new NameComponent("Arytmetyka", "");
	    NameComponent path[] = {nc};
	    
	    arytmetyka proxy = arytmetykaHelper.narrow(ncRef.resolve(path));
	    
	    proxy.s1(1);
	    proxy.s2(2);
	    proxy.Suma();
	    System.out.println(proxy.wynik());
	}
}
