package metier;

import java.time.LocalDate;

public class Facture
{
	private int montant;
	private boolean reglee;
	private Client client;
	private LocalDate date;
	
	
	public Facture(int montant,Client client) 
	{
		this.client = client;
		this.montant = montant;
		this.date = LocalDate.now();
	}

	public Facture(int montant,boolean reglee,Client client) 
	{
		this.montant = montant;
		this.reglee = reglee;
		this.client = client;
		this.date = LocalDate.now();
	}
	public Facture(int montant,boolean reglee,Client client,LocalDate date){
		this.montant = montant;
		this.reglee = reglee;
		this.client = client;
		this.date = date;
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
		
		return this.date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		this.client.removeFacture(this);
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return new Facture(montant,reglee,client,date);

	}
}