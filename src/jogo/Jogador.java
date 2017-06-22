package jogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Jogador extends Ator {
	
	static double energia;
	static String nome;
	static String classe;
	static String genero;

	public Jogador(String name, String classes, String gen, String mundo) {
		super(URL.sprite("jogador.png"), 20);
		setPosition(mundo);
		
		energia = 2000;
		nome = name;
		classe = classes;
		genero = gen;
		this.setTotalDuration(2000);

	}
	
	public void setPosition(String planeta){
		if(planeta.equals("Terra")){
			this.x = 640;
			this.y = 350;
		}else if(planeta.equals("Polux")){
			this.x = 400;
			this.y = 400;
		}else if(planeta.equals("Vênus")){
			this.x = 640;
			this.y = 350;
		}
		
	}
	
	ControleTiros tiros = new ControleTiros();
	public void atirar(Window janela, Scene cena, Keyboard teclado, Ator inimigo){
		if(teclado.keyDown(KeyEvent.VK_A)){
			tiros.adicionaTiro(x+7, y+11, direcao, cena);
		}
		tiros.run(inimigo);
	
	}

	public void controle(Window janela, Keyboard teclado) {


		if (teclado.keyDown(Keyboard.LEFT_KEY)) {
			if (this.x > 0)
				this.x -= velocidade;
			if (direcao != 1) {
				setSequence(4, 8);
				direcao = 1;
			}
			movendo = true;

		} else if (teclado.keyDown(Keyboard.RIGHT_KEY)) {
			if (this.x < janela.getWidth() - 60)
				this.x += velocidade;
			if (direcao != 2) {
				setSequence(8, 12);
				direcao = 2;
			}
			movendo = true;

		} else if (teclado.keyDown(Keyboard.UP_KEY)) {
			if (this.y > 0)
				this.y -= velocidade;
			if (direcao != 4) {
				setSequence(12, 16);
				direcao = 4;
			}
			movendo = true;

		} else if (teclado.keyDown(Keyboard.DOWN_KEY)) {
			if (this.y < janela.getHeight() - 60)
				this.y += velocidade;
			if (direcao != 5) {
				setSequence(0, 4);
				direcao = 5;
			}
			movendo = true;
		}
		if (movendo) {
			update();
			movendo = false;
		}
	}

	
	Font fG = new Font("arial", Font.BOLD, 25);
	Font fP = new Font("arial", Font.BOLD, 18);
	Font fPL = new Font("arial", Font.BOLD, 35);
	
	public void energia(Window janela, String planeta){
		
		janela.drawText(Jogador.classe+": "+Jogador.nome, 10, 30,Color.RED, fG);
		janela.drawText(planeta, 565, 30,Color.BLUE, fPL);
				
		janela.drawText("HP: "+Jogador.energia, 10, 54,Color.GREEN, fP);
	}
	

}
