package lutadores;

public class Lutadores {

//	ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria;
	private int empate;
	private int derrota;

//	CONSTRUTOR
	public Lutadores(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int empate, int derrota) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitoria = vitoria;
		this.empate = empate;
		this.derrota = derrota;
	}
	

//	METODOS
	public void apresentar() {
		System.out.println("-----------------------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println("Contendo " + getIdade()+ " anos");
		System.out.println(getAltura()+"m de altura");
		System.out.println("Pesando: " + getPeso() + "kg");
		System.out.println("Ganhou: " + getVitoria() + " lutas");
		System.out.println("Perdeu: " + getDerrota() + " lutas");
		System.out.println("Empatou: " + getEmpate() + " lutas");
		System.out.println("");
	}

	public void status() {
		System.out.println("-----------------------");
		System.out.println(getNome());
		System.out.println("É um peso " + getCategoria());
		System.out.println(getVitoria() + " Vitorias");
		System.out.println(getEmpate()+ " Empates");
		System.out.println(getDerrota()+ " Derrotas");
		System.out.println("");

	}

	public void ganharLuta() {
		setVitoria(getVitoria()+1);
	}

	public void empatarLuta() {
		setEmpate(getEmpate()+1);
	}

	public void perderLuta() {
		setDerrota(getDerrota()+1);
	}

//	GETTERS E SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria(categoria);
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria(String categoria) {
		if(getPeso()<52.2) {
			this.categoria = "invalido";
		}else if( getPeso()<=70.3) {
			this.categoria = "Leve";
		}else if(getPeso()<=80.9) {
			this.categoria = "Média";
		}else if(getPeso()<= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
}
