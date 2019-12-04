package ClientServeur;

import java.net.Socket;
import java.io.BufferedOutputStream;
import java.net.InetAddress;
public class Client {

	public static void main(String[] args) {
		Socket soc= null;
		try {
			
			soc = new Socket(InetAddress.getLocalHost(),56078);
			String Test="10 11 +";
			BufferedOutputStream bos= new BufferedOutputStream(soc.getOutputStream());
			bos.write(Test.getBytes());
			bos.flush();
			soc.close();
			
			}catch(Exception e) {}
	}

}
