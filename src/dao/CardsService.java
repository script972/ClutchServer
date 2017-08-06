package dao;

import tables.Card;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * Created by script972 on 05.08.2017.
 */

@Stateless
public class CardsService {
    @PersistenceContext
    EntityManager em;

    public List<Card> cardList;

    public List<Card> findAll(){
        return em.createQuery("SELECT a FROM Card a") .getResultList();
    }
}
