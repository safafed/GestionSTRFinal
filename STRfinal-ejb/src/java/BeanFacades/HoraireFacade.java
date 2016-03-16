/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanFacades;

import BeanEntitees.Horaire;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author safa
 */
@Stateless
public class HoraireFacade extends AbstractFacade<Horaire> {
    @PersistenceContext(unitName = "STRfinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HoraireFacade() {
        super(Horaire.class);
    }

    public void CreerHoraire(String hor) {
        Horaire horaire = new Horaire();
        horaire.setHoraire(hor);
       
        getEntityManager().persist(horaire);
    }


    public Collection<BeanEntitees.Horaire> ListerHoraires() {
        List horaires;
        String txt = "SELECT h FROM Horaire AS h";
        Query req = getEntityManager().createQuery(txt);
        horaires = req.getResultList();
        return horaires;
    }

    public Horaire RechercherHoraire(long id) {
       Horaire horaire;
        String txt = "SELECT h FROM Horaire AS h WHERE h.id =:idhor";
        Query req = getEntityManager().createQuery(txt);
        req.setParameter("idhor",id);
        horaire = (Horaire)req.getSingleResult();
        return horaire;
    }

    public void ModifierHoraire(Horaire horaire, String hor) {
        
        horaire.setHoraire(hor);
               
        em.merge(horaire);
    }

    public void SupprimerHoraire(Horaire horaire) {
        em.remove(horaire);
    }
    
    
    
}
