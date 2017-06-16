package jogo;

import javax.swing.JFrame;
import jplay.Window;

public class Initial {
	
	private String[] personagem;
	
	JFrame pgHome;
	Window janela;
	
	public Initial(String[] infoJog, JFrame home, Window window){
		personagem = infoJog;
		pgHome = home;
		janela = window;
		inicializa();
	}

	public void inicializa(){
        Jogador jogador = new Jogador(personagem[0], personagem[1], personagem[2], personagem[3]);
        
        pgHome.setVisible(false);        
        new Terra(janela, jogador);
	}
}
