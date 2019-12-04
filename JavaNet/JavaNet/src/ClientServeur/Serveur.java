package ClientServeur;

import java.io.BufferedInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) {
		ServerSocket sSoc=null;
		Socket soc= null;
		while(true )
			{try {
			
			sSoc= new ServerSocket(56078);
			soc=sSoc.accept();
			System.out.println("Un Client s'est connecté ");
			BufferedInputStream bis= new BufferedInputStream(soc.getInputStream());
			StringBuilder  sb= new StringBuilder();
			int n;
			while((n=bis.read())!=-1) {
				sb.append((char)n);
			}
			
			System.out.println(sb+" received");
			sSoc.close();
			soc.close();
		}catch(Exception e) {}
		

	}}

}
