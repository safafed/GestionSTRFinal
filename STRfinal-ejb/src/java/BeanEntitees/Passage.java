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
import javax.persistence.ManyToOne;

/**
 *
 * @author safa
 */
@Entity
public class Passage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPassage;

    public int getId() {
        return idPassage;
    }

    public void setId(int idPassage) {
        this.idPassage = idPassage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPassage;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idPassage fields are not set
        if (!(object instanceof Passage)) {
            return false;
        }
        Passage other = (Passage) object;
        if (this.idPassage != other.idPassage) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Passage[ idPassage=" + idPassage + ", ordre de passage="+ordrePassage+" ]";
    }
    
        private int ordrePassage;

    /**
     * Get the value of ordrePassage
     *
     * @return the value of ordrePassage
     */
    public int getOrdrePassage() {
        return ordrePassage;
    }

    /**
     * Set the value of ordrePassage
     *
     * @param ordrePassage new value of ordrePassage
     */
    public void setOrdrePassage(int ordrePassage) {
        this.ordrePassage = ordrePassage;
    }

    @ManyToOne
        private Ligne laligne;

    /**
     * Get the value of laligne
     *
     * @return the value of laligne
     */
    public Ligne getLaligne() {
        return laligne;
    }

    /**
     * Set the value of laligne
     *
     * @param laligne new value of laligne
     */
    public void setLaligne(Ligne laligne) {
        this.laligne = laligne;
    }

    @ManyToOne
        private Arret larret;

    /**
     * Get the value of larret
     *
     * @return the value of larret
     */
    public Arret getLarret() {
        return larret;
    }

    /**
     * Set the value of larret
     *
     * @param larret new value of larret
     */
    public void setLarret(Arret larret) {
        this.larret = larret;
    }

    
    @ManyToOne
        private Periode laperiode;

    /**
     * Get the value of laperiode
     *
     * @return the value of laperiode
     */
    public Periode getLaperiode() {
        return laperiode;
    }

    /**
     * Set the value of laperiode
     *
     * @param laperiode new value of laperiode
     */
    public void setLaperiode(Periode laperiode) {
        this.laperiode = laperiode;
    }

    
    @ManyToOne
        private Horaire lhoraire;

    /**
     * Get the value of lhoraire
     *
     * @return the value of lhoraire
     */
    public Horaire getLhoraire() {
        return lhoraire;
    }

    /**
     * Set the value of lhoraire
     *
     * @param lhoraire new value of lhoraire
     */
    public void setLhoraire(Horaire lhoraire) {
        this.lhoraire = lhoraire;
    }

}
