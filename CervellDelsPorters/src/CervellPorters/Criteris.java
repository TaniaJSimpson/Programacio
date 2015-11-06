package CervellPorters;

public class Criteris {

	private String nom;
	private int edat;
	private int diners;
	private String sexe;
	private String calcat;

	public Criteris(String nomC, int edatC, int dinersC, String sexeC, String calcatC) {

		nom = nomC;
		edat = edatC;
		sexe = sexeC;
		calcat = calcatC;
		diners = dinersC;

	}

	public String getNom() {
		return nom;
	}

	public int getEdat() {
		return edat;
	}

	public int getDiners() {
		return diners;
	}

	public String getSexe() {
		return sexe;
	}

	public String getCalcat() {
		return calcat;
	}

	public static void add(Criteris clientT) {

	}

	public String toString() {
		return "[ nom=" + nom + ", edat=" + edat + ", diners=" + diners + ", sexe=" + sexe + ", calcat=" + calcat + "]";
	}


}
