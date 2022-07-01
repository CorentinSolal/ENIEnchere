package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.Retrait;

public interface RetraitManager {

    void addRetrait(Retrait Retrait) throws BLLException;

    void updateRetrait(Retrait Retrait) throws BLLException;

    void deleteRetrait(int noArticle) throws BLLException;
}
