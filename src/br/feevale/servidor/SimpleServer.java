package br.feevale.servidor;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SimpleServer {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println( "Criando o ServerSocket" );
		ServerSocket server = new ServerSocket( 3000 );
		
		while( true ) {

			System.out.println( "Inicializando a captura" );
			Socket socket = server.accept();
			
			System.out.println( "Recebi uma solicitação..." );
			comunicaComEsteSocket( socket );
		}
		
	}

	private static void comunicaComEsteSocket(Socket socket) throws IOException {

		
		InputStream is = socket.getInputStream();
		
		int tam = is.read();
		byte[] recebidos = new byte[ tam ];
		is.read( recebidos );
		
		String msg = new String( recebidos );
		
		JOptionPane.showMessageDialog( null, msg );
	}
}


























































