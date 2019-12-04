package exempleCours;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
	public static void main(String[] args) {
		ServerSocket soc;
		
			for(int i=1;i<65536;i++) {
				try {
						 soc = new ServerSocket(i);
						
							 System.out.println("le port "+i+" est dispo");
							
						 
					}catch (IOException e) {
						// TODO Auto-generated catch block
						
					}
			
				}
			
			 
		} 

}
