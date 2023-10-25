package Services;
import javax.xml.ws.Endpoint;

public class Provider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://127.0.0.1:1000/",new Calcules());
		//Endpoint.publish("http://0.0.0.0:4545/", new Calcules());

		System.out.println("ok");
	}

}
