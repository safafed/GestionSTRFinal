/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanEntitees;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author safa
 */
@Entity
public class JourFerie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idJourFerie;

    public int getId() {
        return idJourFerie;
    }

    public void setId(int idJourFerie) {
        this.idJourFerie = idJourFerie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idJourFerie;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idJourFerie fields are not set
        if (!(object instanceof JourFerie)) {
            return false;
        }
        JourFerie other = (JourFerie) object;
        if (this.idJourFerie != other.idJourFerie) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BeanEntitees.JourFerie[ idJourFerie=" + idJourFerie + " ]";
    }
    
        private int jour;

    /**
     * Get the value of jour
     *
     * @return the value of jour
     */
    public int getJour() {
        return jour;
    }

    /**
     * Set the value of jour
     *
     * @param jour new value of jour
     */
    public void setJour(int jour) {
        this.jour = jour;
    }

        private int mois;

    /**
     * Get the value of mois
     *
     * @return the value of mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * Set the value of mois
     *
     * @param mois new value of mois
     */
    public void setMois(int mois) {
        this.mois = mois;
    }

}
