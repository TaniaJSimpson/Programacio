package CervellPorters;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CervellPorters {

	public static String[] REVISARNOM;
	public static int REVISAREDAT;
	public static int REVISARDINERS;
	public static String[] REVISARSEXE;
	public static String[] REVISARCALCAT;

	private static final String[] NOM = { "Son Goku", "Lisa", "Homer", "Peter" };
	private static final String[] SEXE = { "dona", "home" };
	private static final String[] CALCAT = { "sandàlies", "banbes", "botes" };

	public static void main(String[] args) {

		Porter porter = new Porter();
		Random aleatoris = new Random();
		List<Criteris> client = new ArrayList<Criteris>();

		for (int i = 0; i < 8; i++) {

			Criteris clientT = new Criteris(NOM[aleatoris.nextInt(NOM.length)], 18 + aleatoris.nextInt(100),
					aleatoris.nextInt(200), SEXE[aleatoris.nextInt(SEXE.length)],
					CALCAT[aleatoris.nextInt(CALCAT.length)]);

			client.add(clientT);
		}

		System.out.println(client);

		int beneficis = 0;

		for (int i = 0; i < client.size(); i++) {
			if (porter.comprovar(client.get(i)) == true) {
				System.out.println(client.get(i));
			}

		}

	}

}
