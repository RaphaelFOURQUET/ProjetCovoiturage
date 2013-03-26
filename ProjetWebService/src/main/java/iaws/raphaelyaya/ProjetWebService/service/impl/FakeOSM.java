package iaws.raphaelyaya.ProjetWebService.service.impl;

import iaws.raphaelyaya.ProjetWebService.data.Personne;
import iaws.raphaelyaya.ProjetWebService.service.InscriptionService;

public class FakeOSM implements InscriptionService{
	
	public Personne inscription(Personne p) {
		//simulation appel OSM pour recup coords
		double latitude = 100.0;
		double longitude = 100.0;
		
		
		//maj personne
		p.setLatitude(latitude);
		p.setLongitude(longitude);
		
		return p;
	}
	
//	public static double getLatitude(String a) {
//		//simulation appel OSM pour recup coords
//		double latitude = 100.0;
//		
//		return latitude;
//	}
//	
//	public static double getLongitude(String a) {
//		//simulation appel OSM pour recup coords
//		double longitude = 100.0;
//	
//		return longitude;
//	}


}
