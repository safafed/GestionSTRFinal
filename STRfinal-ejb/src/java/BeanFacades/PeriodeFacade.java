/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanFacades;

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
public class PeriodeFacade extends AbstractFacade<Periode> {
    @PersistenceContext(unitName = "STRfinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeriodeFacade() {
        super(Periode.class);
    }

    public void CreerPeriode(String libelle) {
        Periode periode = new Periode();
        periode.setLibelle(libelle);
        getEntityManager().persist(periode);
    }

    public void ModifierPeriode(Periode periode, String libelle) {
        periode.setLibelle(libelle);
        em.merge(periode);
    }

    public void SupprimerPeriode(Periode periode) {
        em.remove(periode);
    }

    public Collection<Periode> ListerPeriodes() {
        List periodes;
        String txt = "SELECT p FROM Periode AS p";
        Query req = getEntityManager().createQuery(txt);
        periodes = req.getResultList();
        return periodes;
    }

    public Periode RechercherPeriode(long id) {
        Periode periode;
        String txt = "SELECT p FROM Periode AS p WHERE p.id =:idper";
        Query req = getEntityManager().createQuery(txt);
        req.setParameter("idper",id);
        periode = (Periode)req.getSingleResult();
        return periode;
    }
    
    
}
