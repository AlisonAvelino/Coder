package oo.heranca;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Jogador {
	
	public int vida = 100;
	int x;
	int y;
	
	 protected Jogador(int x, int y){
		 this.x = x;
		 this.y = y;
	 }
	
	 public boolean atacar (Jogador jogador) {
		int deltaX = Math.abs(x - jogador.x);
		int deltaY = Math.abs(y - jogador.y);
		
		if(deltaX == 0 && deltaY == 1) {
			jogador.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			jogador.vida -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x++;
			break;
		}
		
		return true;
	}
}
