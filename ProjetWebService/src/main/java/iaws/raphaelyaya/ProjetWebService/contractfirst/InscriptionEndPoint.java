package iaws.raphaelyaya.ProjetWebService.contractfirst;



import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.XPathParam;
import org.w3c.dom.Element;


import iaws.raphaelyaya.ProjetWebService.data.BaseDePersonnes;
import iaws.raphaelyaya.ProjetWebService.data.Personne;
import iaws.raphaelyaya.ProjetWebService.service.impl.FakeOSM;


/**
 * 
 * @author Raphaël
 *
 */
@Endpoint
public class InscriptionEndPoint {
	
	private Personne personne;
	
	//Utilité ???
	private static final String NAMESPACE_URI = "http://iaws.raphaelyaya.ProjetWebService/contractfirst/exemple";

	
	public InscriptionEndPoint(Personne personne) {
		this.personne = personne;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "InscriptionRequest")
    @ResponsePayload
    public Element handleInscriptionRequest(@XPathParam("/InscriptionRequest/nom") String nom,
    		@XPathParam("/InscriptionRequest/prenom") String prenom,
    		@XPathParam("/InscriptionRequest/mail") String mail,
    		@XPathParam("/InscriptionRequest/adresse") String adresse) throws Exception {

        // parse le XML de InscriptionRequest pour extraire les informations utiles


        // invoquer le service OpenStreetMap pour récupérer lati/longi
		FakeOSM osm = new FakeOSM();
		Personne p = osm.inscription(personne);
		// inscrire à la bd ou liste de personnes
		BaseDePersonnes.inscription(p);

        //TODO Transforme en élément XML ad-hoc pour le retour
        // Inscription.xml à creer? quand ?
        Element elt = XmlHelper.getRootElementFromFileInClasspath("Inscription.xml") ;
        return elt;

    }
	
}
