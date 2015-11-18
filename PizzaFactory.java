public class PizzaFactory{
	public static Pizza createPizza(String pizType){
	
		if(pizType.equals("Pepperoni")){
			return = new PepperoniPizza();
		}else if (pizType.equals("Margherita")){
			return = new MargheritaPizza();
		}else if (pizType.equals("Tomyam")){
			return = new TomyamPizza();
		}else{
			return null;
		}
	}
}