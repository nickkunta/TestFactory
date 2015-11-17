public class PizzaStore{
	PizzaFactory pFactory;
	public PizzaStore(PizzaFactory inputFactory){
		this.pFactory = inputFactory;
	}
	public Pizza orderPizza(String pizType){
		Pizza p;
		p = pFactory.createPizza(pizType);
		p.prepare();
		p.bake();
		p.cut();
		p.box();

		return p;
	}
}