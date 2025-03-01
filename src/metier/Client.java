package metier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client 
{
	/**
	 * Crée un client.
	 * 
	 * @param nom le nom du client.
	 */
	static ArrayList<Client> clientList = new ArrayList<>();
	private String nom;
	private ArrayList<Facture> listFacture = new ArrayList<Facture>();
	private ArrayList<Facture> listPayer = new ArrayList<Facture>();

	public Client(String nom) 
	{
		this.nom = nom;
		keepClient(this);
	}

	public void keepClient(Client client) 
	{
		clientList.add(client);
	}

	public void removeFacture(Facture facture) {
		listFacture.remove(facture);
	}

	/**
	 * Retourne le nom du client.
	 * 
	 * @return le nom du client.
	 */

	public String getNom() 
	{
		return this.nom;
	}

	/**
	 * Modifie le nom du client.
	 * 
	 * @param nom le nom du client.
	 */

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	/**
	 * Créé une facture.
	 * 
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */

	public Facture createFacture(int montant) 
	{
		if (montant > 0) 
		{
			Facture f = new Facture(montant, this);
			add(f);
			return f;
		} 
		else 
		{
			throw new IllegalArgumentException("Le montant d'une facture ne peut pas être négatif.");
		}

	}
	/**
	 * Créé une facture en précisant si elle est reglée.
	 * 
	 * @param montant Le montant de la facture.
	 * @param reglée  Vrai si la facture est reglée.
	 * @return la facture créée.
	 */

	public Facture createFacture(int montant, boolean reglee) 
	{
		Facture fac = new Facture(montant, reglee, this);
		listFacture.add(fac);
		return fac;
	}

	public void add(Facture fact) 
	{
		this.listFacture.add(fact);
	}

	/**
	 * Retourne une copie de la liste des factures du client.
	 * 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures() 
	{
		return Collections.unmodifiableList(listFacture);
	}

	/**
	 * Retourne la somme des montants des factures.
	 * 
	 * @return la somme des montants des factures.
	 */

	public int sommeMontants() 
	{
		int sommeglob = 0;
		for (Facture value : this.getFactures()) 
		{
			sommeglob += value.getMontant();
		}
		return sommeglob;
	}



	/**
	 * Retourne la liste des factures reglées.
	 * 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees() 
	{
		for (Facture payer : listFacture) 
		{
			if (payer.estReglee()) 
			{
				listPayer.add(payer);
			}
		}
		return Collections.unmodifiableList(listPayer);
	}

	/**
	 * Retourne tous les clients créés.
	 * 
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous() 
	{
		return Collections.unmodifiableList(clientList);
	}

	/**
	 * Supprime le client.
	 */

	public void delete() 
	{
		clientList.remove(this);
	}
}
