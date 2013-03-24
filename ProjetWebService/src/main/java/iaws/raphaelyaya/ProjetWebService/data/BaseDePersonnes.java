package iaws.raphaelyaya.ProjetWebService.data;

import java.util.ArrayList;
import java.util.List;

public class BaseDePersonnes {
	private static List<Personne> personnes= new ArrayList<Personne>();
	
	public BaseDePersonnes(List<Personne> personnes) {
		super();
		this.personnes = personnes;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	
	public static boolean inscription(Personne p) {
		return personnes.add(p);
	}

}
