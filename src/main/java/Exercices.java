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
		
		/*	Exercice 1 : O� est Charlie ?
		 	Vous devez parcourir l'ArrayList "listePrenom" et trouver "Charlie". 	*/
		ArrayList<String> listePrenom = data.getListePrenom();
		/* 	Il suffira de r�cup�rer l'index de "Charlie" pour r�ussir cet exercice.
		 */
		
		
		
		
		
		/*	Exercice 2 :  La commande ".size()" est cass�e :/
		 * 	Vous devez trouver un moyen pour parcourir l'ArrayList sans utiliser la m�thode ".size()"
		 *	(astuce : chercher la m�thode 'for each' sur internet, et utiliser un compteur)
		 *	Il faut donner en r�sultat la taille de 'listePrenom'.
		 */
		
		
		
		
		
		/* 	Exercice 3 : Stocker la liste des pr�noms dans une HashMap.
		 * 	La cl� sera l'index et la valeur le pr�nom.
		 * 	(Si vous avez r�ussi l'Exercice 2, vous avez d�bloqu� la m�thode ".size()")
		 */		
		HashMap mapPrenom = new HashMap(); // <-- ligne � compl�ter
		
		
		
		
		

		/*	Exercice 4 : Effacer toutes les entr�es de la HashMap dont la valeur commence par 'C'.
		 * 	
		 */
		
		
		
		
		
		
		/*	Exercice 5 : Garder uniquement les cl�s paires dans la HashMap
		 * 	Les pr�noms associ�s aux cl�s impaires iront dans l'ArrayList 'listePrenom',
		 *  qui ne devra contenir uniquement ces pr�noms.
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
