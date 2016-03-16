/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanFacades;

import BeanEntitees.JourFerie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author safa
 */
@Stateless
public class JourFerieFacade extends AbstractFacade<JourFerie> {
    @PersistenceContext(unitName = "STRfinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JourFerieFacade() {
        super(JourFerie.class);
    }
    
}
