package br.feevale.cliente;

import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SimpleClient {
	
	public static void main(String[] args) {
		
		try {
			String mensagem = JOptionPane.showInputDialog( "Digite uma Mesagem: " );
			Socket s = new Socket( "localhost", 3000 );
			
			OutputStream os = s.getOutputStream();
			os.write( mensagem.getBytes().length );
			os.write( mensagem.getBytes() );
			os.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







