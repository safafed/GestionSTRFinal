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
public class Ligne implements Serializable {
    @OneToMany(mappedBy = "laligne")
    private List<Passage> passages;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLigne;

    public int getId() {
        return idLigne;
    }

    public void setId(int idLigne) {
        this.idLigne = idLigne;
    }

        @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idLigne fields are not set
        if (!(object instanceof Ligne)) {
            return false;
        }
        Ligne other = (Ligne) object;
        if (this.idLigne != other.idLigne) {
            return false;
        }
        return true;
    }

 
    
    @Override
    public String toString() {
        return "Ligne[ idLigne=" + idLigne + ", code de la ligne="+codeLigne+" ]";
    }
 
        private String codeLigne;

    /**
     * Get the value of codeLigne
     *
     * @return the value of codeLigne
     */
    public String getCodeLigne() {
        return codeLigne;
    }

    /**
     * Set the value of codeLigne
     *
     * @param codeLigne new value of codeLigne
     */
    public void setCodeLigne(String codeLigne) {
        this.codeLigne = codeLigne;
    }

        private double tarif1;

    /**
     * Get the value of tarif1
     *
     * @return the value of tarif1
     */
    public double getTarif1() {
        return tarif1;
    }

    /**
     * Set the value of tarif1
     *
     * @param tarif1 new value of tarif1
     */
    public void setTarif1(double tarif1) {
        this.tarif1 = tarif1;
    }

        private double tarif2;

    /**
     * Get the value of tarif2
     *
     * @return the value of tarif2
     */
    public double getTarif2() {
        return tarif2;
    }

    /**
     * Set the value of tarif2
     *
     * @param tarif2 new value of tarif2
     */
    public void setTarif2(double tarif2) {
        this.tarif2 = tarif2;
    }

        private double tarif3;

    /**
     * Get the value of tarif3
     *
     * @return the value of tarif3
     */
    public double getTarif3() {
        return tarif3;
    }

    /**
     * Set the value of tarif3
     *
     * @param tarif3 new value of tarif3
     */
    public void setTarif3(double tarif3) {
        this.tarif3 = tarif3;
    }

}
