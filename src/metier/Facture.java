package metier;

import java.time.LocalDate;

public class Facture
{
	private int montant;
	private boolean reglee;
	
	
	public Facture(int montant) {
		this.montant = montant;
	}
	public Facture(int montant,boolean reglee) {
		this.montant = montant;
		this.reglee = reglee;
	}
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Client getClient()
	{
		return null;
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
		return new Facture(this.montant,this.reglee);
	}
}