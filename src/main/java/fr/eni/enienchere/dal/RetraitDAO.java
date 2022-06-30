package fr.eni.enienchere.dal;

import fr.eni.enienchere.bo.Retrait;

public interface RetraitDAO {
    default void addRetrait () throws DALException {
        addRetrait(null);
    }

    void addRetrait (Retrait retrait) throws DALException;
}
