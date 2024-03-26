package lutadores;

import java.util.Random;

public class Luta {
//	ATRIBUTOS
	private Lutadores desafiante;
	private Lutadores desafiado;
	private int rounds;
	private boolean aprovada;

	
//	METODOS
	public void marcarLuta(Lutadores l1, Lutadores l2 ) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	
	public void lutar() {
		if(isAprovada()) {
			desafiado.apresentar();
			desafiante.apresentar();
			Random vencedor = new Random();
			int number = vencedor.nextInt(3);
			
			switch (number) {
				case 0 : //empate
					System.out.println("A luta terminou em empate!!!");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
				break;
				case 1://desafiado ganhador
					System.out.println("O desafiante: " + desafiante.getNome()+" ganhou a luta!!!");
					desafiado.ganharLuta();
					desafiante.perderLuta();
				break;
				case 2: //desafiante ganhador
					System.out.println("O desafiado: " + desafiado.getNome() + " ganhou a luta!!!");
					desafiado.perderLuta();
					desafiante.ganharLuta();
				break;
			}
		}else {
			System.out.println("A luta não pode acontecer!!!");
		} 
	}

	
//	GETTERS E SETTERS
	public Lutadores getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutadores desafiado) {
		this.desafiado = desafiado;
	}

	public Lutadores getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutadores desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
