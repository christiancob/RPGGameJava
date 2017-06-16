package jogo;

import javax.swing.JFrame;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Principal {
	
	static Jogador jogador = null;
	static String mundo = null;
	
	static Window janela = new Window(800, 600);
	static GameImage plano = new GameImage(URL.sprite("menu.gif"));
	static Keyboard teclado = janela.getKeyboard();

	public static void main(String[] args) {

		while (true) {

			plano.draw();
			janela.update();

			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				
				if(jogador!=null){
					if(mundo.equals("Terra")){
						new Terra(janela, jogador);
					}else if(mundo.equals("Polux")){
						new Polux(janela, jogador);
					}else if(mundo.equals("Vênus")){
						new Venus(janela, jogador);
					}
				}else{
					JFrame login = new JFrame("Faça seu Login");
					Login telaLogin = new Login(login, janela);
					login.add(telaLogin);
					
					login.setSize(800, 600);
					login.setLocationRelativeTo(null);
					login.setVisible(true);
				}
				
			}

		}

	}
	
	public static void inicializa(String[] personagem, JFrame pgHome, Window janela){
        Jogador jog = new Jogador(personagem[0], personagem[1], personagem[2], personagem[3]);
        jogador = jog;   
        
        mundo = personagem[3];
        
        pgHome.setVisible(false);
	}

}
