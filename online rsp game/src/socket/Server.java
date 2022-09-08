package socket;

import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) {

		final int port = 4444;
		
		Socket s = null;
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(port);
		}catch(IOException e) {
			System.out.println("포트가 열려있습니다.");
		}
		
		while(true) {
			try {
				System.out.println("Waiting connection..");
				s = ss.accept();
				System.out.println("connection info");
				System.out.println("client address:"+s.getInetAddress());
				
				System.out.println("client port : "+s.getPort());
				
				s.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
