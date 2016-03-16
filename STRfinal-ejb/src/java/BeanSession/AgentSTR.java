/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanSession;

import BeanEntitees.Arret;
import BeanEntitees.Horaire;
import BeanEntitees.Ligne;
import BeanEntitees.Periode;
import BeanFacades.ArretFacade;
import BeanFacades.HoraireFacade;
import BeanFacades.LigneFacade;
import BeanFacades.PassageFacade;
import BeanFacades.PeriodeFacade;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author safa
 */
@Stateless
@LocalBean
public class AgentSTR {
    @EJB
    private PassageFacade passageFacade;
    @EJB
    private PeriodeFacade periodeFacade;
    @EJB
    private LigneFacade ligneFacade;
    @EJB
    private HoraireFacade horaireFacade;
    @EJB
    private ArretFacade arretFacade;

    
// Arrets
    public void AjoutArret(String nom, String adresse) {
        arretFacade.CreerArret(nom, adresse);
    }

    public void ModificationArret(long id, String nom, String adresse) {
        arretFacade.ModifierArret(arretFacade.RechercherArret(id), nom, adresse);
    }

    public void SuppressionArret(long id) {
        arretFacade.SupprimerArret(arretFacade.RechercherArret(id));
    }

    public Collection<BeanEntitees.Arret> ListerArrets() {
        return arretFacade.ListerArrets();

    }

// Horaires
    public void AjoutHoraire(String hor) {
        horaireFacade.CreerHoraire(hor);
    }

    public void ModificationHoraire(long id, String hor) {
        horaireFacade.ModifierHoraire(horaireFacade.RechercherHoraire(id), hor);
    }

    public void SuppressionHoraire(long id) {
        horaireFacade.SupprimerHoraire(horaireFacade.RechercherHoraire(id));
    }

    public Collection<BeanEntitees.Horaire> ListerHoraires() {
        return horaireFacade.ListerHoraires();
    }

    

    
// Lignes
        public void AjoutLigne(String code, double tarif1, double tarif2, double tarif3 ) {
        ligneFacade.CreerLigne(code,tarif1, tarif2, tarif3);
    }

    public void ModificationLigne(long id, String code, double tarif1, double tarif2, double tarif3) {
        ligneFacade.ModifierLigne(ligneFacade.RechercherLigne(id), code, tarif1, tarif2, tarif3);
    }

    public void SuppressionLigne(long id) {
      ligneFacade.SupprimerLigne(ligneFacade.RechercherLigne(id));
    }

    public Collection<BeanEntitees.Ligne> ListerLignes() {
       return ligneFacade.ListerLignes();
    }
    
 // Periodes
    
     public void AjoutPeriode(String libelle) {
        periodeFacade.CreerPeriode(libelle);
    }

    public void ModificationPeriode(long id, String libelle) {
        periodeFacade.ModifierPeriode(periodeFacade.RechercherPeriode(id), libelle);
    }

    public void SuppressionPeriode(long id) {
        periodeFacade.SupprimerPeriode(periodeFacade.RechercherPeriode(id));
    }

    public Collection<BeanEntitees.Periode> ListerPeriodes() {
       return periodeFacade.ListerPeriodes();
    }  
  
    
 
    
 // passages
    
     public void AjoutPassage(int ordre, Arret arret, Periode periode, Horaire horaire, Ligne ligne) {
        passageFacade.CreerPassage(ordre,arret,periode,horaire,ligne);
    }

    public void ModificationPassage(long id, int ordre) {
        passageFacade.ModifierPassage(passageFacade.RechercherPassage(id), ordre);
    }

    public void SuppressionPassage(long id) {
        passageFacade.SupprimerPassage(passageFacade.RechercherPassage(id));
    }

    public Collection<BeanEntitees.Passage> ListerPassages() {
       return passageFacade.ListerPassages();
    }     
}
