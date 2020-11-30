import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Exercices implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8725975143916237672L;
	static Exercices data = new Exercices();
	ArrayList<String> listePrenom;
	

	public static void main(String[] args) {
		data = data.load();
		
		
		// 	Serie d'exercices sur les ArrayList et HashMap
		
		/*	Exercice 1 : Où est Charlie ?
		 	Vous devez parcourir l'ArrayList "listePrenom" et trouver "Charlie". 	*/
		ArrayList<String> listePrenom = data.getListePrenom();
		/* 	Il suffira de récupérer l'index de "Charlie" pour réussir cet exercice.
		 */
		
		
		
		
		
		/*	Exercice 2 :  La commande ".size()" est cassée :/
		 * 	Vous devez trouver un moyen pour parcourir l'ArrayList sans utiliser la méthode ".size()"
		 *	(astuce : chercher la méthode 'for each' sur internet, et utiliser un compteur)
		 *	Il faut donner en résultat la taille de 'listePrenom'.
		 */
		
		
		
		
		
		/* 	Exercice 3 : Stocker la liste des prénoms dans une HashMap.
		 * 	La clé sera l'index et la valeur le prénom.
		 * 	(Si vous avez réussi l'Exercice 2, vous avez débloqué la méthode ".size()")
		 */		
		HashMap mapPrenom = new HashMap(); // <-- ligne à compléter
		
		
		
		
		

		/*	Exercice 4 : Effacer toutes les entrées de la HashMap dont la valeur commence par 'C'.
		 * 	
		 */
		
		
		
		
		
		
		/*	Exercice 5 : Garder uniquement les clés paires dans la HashMap
		 * 	Les prénoms associés aux clés impaires iront dans l'ArrayList 'listePrenom',
		 *  qui ne devra contenir uniquement ces prénoms.
		 */
		
		
		
		
		
		
		System.out.println(listePrenom.toString());
		System.out.println(mapPrenom.toString());
	}
	
	public Exercices load() {
		Exercices data=null;
	    try {
	           FileInputStream fichier = new FileInputStream("xyz123.txt");
	           ObjectInputStream objetSgbd = new ObjectInputStream(fichier);
	           data=(Exercices)objetSgbd.readObject();
	           objetSgbd.close();
	           fichier.close();
	      } 
	          catch (IOException | ClassNotFoundException ex) {
	           System.err.println(ex);
	      }
	      return data;
	}

	public ArrayList<String> getListePrenom() {
		return listePrenom;
	}

	public void setListePrenom(ArrayList<String> listePrenom) {
		this.listePrenom = listePrenom;
	} 

}
