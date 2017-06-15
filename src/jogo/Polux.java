package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Polux extends Cenario {
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Keyboard teclado;
	private Zumbi zumbi;
	private Zumbi zumbi1;

	public Polux(Window window) {
		
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("cenarioPolux.csn"));
		jogador = new Jogador(400, 400);
		teclado = janela.getKeyboard();
		zumbi = new Zumbi(150, 150);
		zumbi1 = new Zumbi(208, 208);
		
		//Som.play("missaoimpossvel.mid");
		run();
	}

	
	public void run() {
		while (true) {
			//cena.draw();
			jogador.controle(janela, teclado);
			jogador.caminho(cena);
			zumbi.perseguir(jogador.x, jogador.y);
			zumbi.caminho(cena);
			zumbi1.perseguir(jogador.x, jogador.y);
			zumbi1.caminho(cena);
			
			
			cena.moveScene(jogador);
			jogador.x += cena.getXOffset();
			jogador.y += cena.getYOffset();
			
			zumbi.x += cena.getXOffset();
			zumbi.y += cena.getYOffset();
			
			zumbi1.x += cena.getXOffset();
			zumbi1.y += cena.getYOffset();
			
			jogador.draw();
			zumbi.draw();
			zumbi1.draw();
			janela.update();
			
			mudarCenario();
			
			}
			
		}
		private void mudarCenario(){
			
			if(tileCollision(6, jogador, cena)==true){
				new Terra(janela);
			}

	}
	
	
}
