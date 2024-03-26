package lutadores;

public class UltraCombat {

	public static void main(String[] args) {
		Lutadores l[] = new Lutadores[6];
		l[0]= new Lutadores ("Pretty Boy", "Frances", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1]= new Lutadores("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2]= new Lutadores("Snapshot", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3]= new Lutadores("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4]= new Lutadores("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5]= new Lutadores("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[5], l[4]);
		UEC01.lutar();
		
		
	}

}
