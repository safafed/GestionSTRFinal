/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanFacades;

import BeanEntitees.Arret;
import BeanEntitees.Horaire;
import BeanEntitees.Ligne;
import BeanEntitees.Passage;
import BeanEntitees.Periode;
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
public class PassageFacade extends AbstractFacade<Passage> {
    @PersistenceContext(unitName = "STRfinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PassageFacade() {
        super(Passage.class);
    }
    
     public void CreerPassage(int ordre, Arret arret, Periode periode, Horaire horaire, Ligne ligne) {
        Passage passage = new Passage();
        passage.setOrdrePassage(ordre);
        passage.setLaligne(ligne);
        passage.setLaperiode(periode);
        passage.setLarret(arret);
        passage.setLhoraire(horaire);
        getEntityManager().persist(passage);
    }

    public void ModifierPassage(Passage passage, int ordre) {
        passage.setOrdrePassage(ordre);
        em.merge(passage);
    }

    public void SupprimerPassage(Passage passage) {
        em.remove(passage);
    }

    public Collection<Passage> ListerPassages() {
        List passages;
        String txt = "SELECT p FROM Passage AS p";
        Query req = getEntityManager().createQuery(txt);
        passages = req.getResultList();
        return passages;
    }

    public Passage RechercherPassage(long id) {
        Passage passage;
        String txt = "SELECT p FROM Passage AS p WHERE p.id =:idpass";
        Query req = getEntityManager().createQuery(txt);
        req.setParameter("idpass",id);
        passage = (Passage)req.getSingleResult();
        return passage;
    }
    
}
