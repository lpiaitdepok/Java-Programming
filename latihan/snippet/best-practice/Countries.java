// viralpatel.net
public class Countries {
//Avoid creating unnecessary objects and always prefer to do Lazy Initialization
	private List countries;
	
	public List getCountries() {
		
		//initialize only when required
		if(null == countries) {
			countries = new ArrayList();
		}
		return countries;
	}
}
