package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Retrait;

public interface RetraitDAO {
    void addRetrait (Retrait retrait) throws DALException;
}
