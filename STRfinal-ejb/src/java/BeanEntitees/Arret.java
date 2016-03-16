/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanEntitees;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author safa
 */
@Entity
public class Arret implements Serializable {
    @OneToMany(mappedBy = "larret")
    private List<Passage> passages;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArret;

    public int getId() {
        return idArret;
    }

    public void setId(int idArret) {
        this.idArret = idArret;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idArret;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idArret fields are not set
        if (!(object instanceof Arret)) {
            return false;
        }
        Arret other = (Arret) object;
        if (this.idArret != other.idArret) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Arret[ idArret="+idArret + ", Nom de l'arrêt:"+nomArret+", Adresse de l'arrêt:"+adresseArret+" ]";
    }
   
    
        private String nomArret;

    /**
     * Get the value of nomArret
     *
     * @return the value of nomArret
     */
    public String getNomArret() {
        return nomArret;
    }

    /**
     * Set the value of nomArret
     *
     * @param nomArret new value of nomArret
     */
    public void setNomArret(String nomArret) {
        this.nomArret = nomArret;
    }

    
        private String adresseArret;

    /**
     * Get the value of adresseArret
     *
     * @return the value of adresseArret
     */
    public String getAdresseArret() {
        return adresseArret;
    }

    /**
     * Set the value of adresseArret
     *
     * @param adresseArret new value of adresseArret
     */
    public void setAdresseArret(String adresseArret) {
        this.adresseArret = adresseArret;
    }

}
