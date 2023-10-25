package Services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="service1")
public class Calcules {
	@WebMethod
	public double Add(double x,double y) {
		
        return x+y;
}
	@WebMethod
public double Multi(double x,double y) {
		
        return x*y;
}
	@WebMethod
public double sub(double x,double y) {
	
    return x-y;
}
	@WebMethod
public double Div(double x,double y) {
	
    return x/y;
}
	
}
