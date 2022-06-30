package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Categorie;

public interface CategorieManager {

   void enregistrerCategorie(Categorie categorie) throws BLLException;

   void deleteCategorie(Integer noCategorie) throws BLLException;
}
