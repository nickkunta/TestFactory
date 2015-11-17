public class PizzaFactory{
	public Pizza createPizza(String pizType){
		Pizza p;
		if(pizType.equals("Pepperoni")){
			p = new PepperoniPizza();
		}else if (pizType.equals("Margherita")){
			p = new MargheritaPizza();
		}else if (pizType.equals("Tomyam")){
			p = new TomyamPizza();
		}else{
			return null;
		}
		return p;
	}
}