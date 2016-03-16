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
public class Periode implements Serializable {
    @OneToMany(mappedBy = "laperiode")
    private List<Passage> passages;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPeriode;

    public int getId() {
        return idPeriode;
    }

    public void setId(int idPeriode) {
        this.idPeriode = idPeriode;
    }

@Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPeriode;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idPeriode fields are not set
        if (!(object instanceof Periode)) {
            return false;
        }
        Periode other = (Periode) object;
        if (this.idPeriode != other.idPeriode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Periode[ idPeriode=" + idPeriode + ", Libéllé période="+Libelle+" ]";
    }
    
        private String Libelle;

    /**
     * Get the value of Libelle
     *
     * @return the value of Libelle
     */
    public String getLibelle() {
        return Libelle;
    }

    /**
     * Set the value of Libelle
     *
     * @param Libelle new value of Libelle
     */
    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

}
