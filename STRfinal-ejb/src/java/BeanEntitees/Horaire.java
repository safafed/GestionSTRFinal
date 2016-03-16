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
public class Horaire implements Serializable {
    @OneToMany(mappedBy = "lhoraire")
    private List<Passage> passages;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHoraire;

    public int getId() {
        return idHoraire;
    }

    public void setId(int idHoraire) {
        this.idHoraire = idHoraire;
    }

        @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idHoraire;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idHoraire fields are not set
        if (!(object instanceof Horaire)) {
            return false;
        }
        Horaire other = (Horaire) object;
        if (this.idHoraire != other.idHoraire) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Horaire[ idHoraire=" + idHoraire + ", heure="+horaire+" ]";
    }
    
       private String horaire;

    /**
     * Get the value of horaire
     *
     * @return the value of horaire
     */
    public String getHoraire() {
        return horaire;
    }

    /**
     * Set the value of horaire
     *
     * @param horaire new value of horaire
     */
    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }


}
