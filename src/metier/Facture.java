package metier;

import java.time.LocalDate;

public class Facture
{
	private int montant;
	private boolean reglee;
	private Client client;
	
	
	public Facture(int montant,Client client) 
	{
		this.client = client;
		this.montant = montant;
	}

	public Facture(int montant,boolean reglee,Client client) 
	{
		this.montant = montant;
		this.reglee = reglee;
		this.client = client;
	}
	
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Client getClient()
	{
		return this.client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return this.reglee;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		LocalDate l = LocalDate.now();
		return l;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		Facture  a = new Facture(getMontant(),estReglee(),getClient());
		return a ;
	}
}