package iaws.raphaelyaya.ProjetWebService.service;

import iaws.raphaelyaya.ProjetWebService.data.Personne;

public class FakeOSM {
	
	private static Personne personne;
	
//	public static Personne addCoordonnees() {
//		//simulation appel OSM pour recup coords
//		double latitude = 100.0;
//		double longitude = 100.0;
//		
//		
//		//maj personne
//		personne.setLatitude(latitude);
//		personne.setLongitude(longitude);
//		
//		return personne;
//	}
	
	public static double getLatitude(String a) {
		//simulation appel OSM pour recup coords
		double latitude = 100.0;
		
		return latitude;
	}
	
	public static double getLongitude(String a) {
		//simulation appel OSM pour recup coords
		double longitude = 100.0;
	
		return longitude;
	}

}
