package jogo;

import java.awt.Color;
import java.awt.Font;

import jplay.Keyboard;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Terra extends Cenario {
	
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Keyboard teclado;
	private Zumbi zumbi[];
	private String planeta = "Planeta Terra";
	
	
	public Terra(Window window, Jogador jog) {
		
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("CenarioTerra.csn"));
		jogador = jog;
		teclado = janela.getKeyboard();
		zumbi = new Zumbi[10];
		
		Som.play("missaoimpossvel.mid");
		run();
	}

	
	public void run() {
		for (int i = 0; i < zumbi.length; i++) {
			zumbi[i] = new Zumbi(100*i,100*i);
		}
		
		while (true) {
			//cena.draw();
			jogador.controle(janela, teclado);
			jogador.caminho(cena);	
			
			cena.moveScene(jogador);
			jogador.x += cena.getXOffset();
			jogador.y += cena.getYOffset();
						
			jogador.draw();
			
			for (int i = 0; i < zumbi.length; i++) {
				zumbi[i].caminho(cena);
				zumbi[i].perseguir(jogador.x, jogador.y);			
				zumbi[i].x += cena.getXOffset();
				zumbi[i].y += cena.getYOffset();
				zumbi[i].draw();
				jogador.atirar(janela, cena, teclado, zumbi[i]);	
				zumbi[i].morrer();
				zumbi[i].atacar(jogador);	
				
			}			
			
			jogador.energia(janela, planeta);		
			
			janela.update();
			janela.delay(7);
			
			mudarCenario();
			
		}

	}
		
	
	private void mudarCenario(){
		
		if(tileCollision(17, jogador, cena)==true){
			new Polux(janela, jogador);
		}
		
	}

}
