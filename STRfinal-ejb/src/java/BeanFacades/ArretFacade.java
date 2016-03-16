/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanFacades;

import BeanEntitees.Arret;
import java.util.ArrayList;
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
public class ArretFacade extends AbstractFacade<Arret> {
    @PersistenceContext(unitName = "STRfinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArretFacade() {
        super(Arret.class);
    }

    public void CreerArret(String nom, String adresse) {
        Arret arret = new Arret();
        arret.setNomArret(nom);
        arret.setAdresseArret(adresse);
        
        getEntityManager().persist(arret);
    }

    public void ModifierArret(Arret arret, String nom, String adresse) {
        arret.setNomArret(nom);
        arret.setAdresseArret(adresse);
        
        em.merge(arret);
    }

    public void SupprimerArret(Arret arret) {
         em.remove(arret);
    }

    public Collection<BeanEntitees.Arret> ListerArrets() {
        List arrets;
        String txt = "SELECT a FROM Arret AS a";
        Query req = getEntityManager().createQuery(txt);
        arrets = req.getResultList();
        return arrets;
    
    }

    public Arret RechercherArret(long id) {
        Arret arret;
        String txt = "SELECT a FROM Arret AS a WHERE a.id =:idar";
        Query req = getEntityManager().createQuery(txt);
        req.setParameter("idar",id);
        arret = (Arret)req.getSingleResult();
        return arret;
    }
    

 
    
}
