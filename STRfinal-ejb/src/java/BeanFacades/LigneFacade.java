/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanFacades;

import BeanEntitees.Ligne;
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
public class LigneFacade extends AbstractFacade<Ligne> {
    @PersistenceContext(unitName = "STRfinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LigneFacade() {
        super(Ligne.class);
    }

    public void CreerLigne(String code, double tarif1, double tarif2, double tarif3) {
        Ligne ligne = new Ligne();
        ligne.setCodeLigne(code);
        ligne.setTarif1(tarif1);
        ligne.setTarif2(tarif2);
        ligne.setTarif3(tarif3);
        
        getEntityManager().persist(ligne);
        
    }

    public void ModifierLigne(Ligne ligne, String code, double tarif1, double tarif2, double tarif3) {
        ligne.setCodeLigne(code);
        ligne.setTarif1(tarif1);
        ligne.setTarif2(tarif2);
        ligne.setTarif3(tarif3);
        em.merge(ligne);
    }

    public void SupprimerLigne(Ligne ligne) {
        em.remove(ligne);
    }

    public Collection<Ligne> ListerLignes() {
        List lignes;
        String txt = "SELECT l FROM Ligne AS l";
        Query req = getEntityManager().createQuery(txt);
        lignes = req.getResultList();
        return lignes;
    }

    public Ligne RechercherLigne(long id) {
        Ligne ligne;
        String txt = "SELECT l FROM Ligne AS l WHERE l.id =:idli";
        Query req = getEntityManager().createQuery(txt);
        req.setParameter("idli",id);
        ligne = (Ligne)req.getSingleResult();
        return ligne;
    }

    
    
    
    
    
    
    
    
}
