public class PizzaStore{
	public Pizza orderPizza(String pizType){
		Pizza p;
		p = PizzaFactory.createPizza(pizType);
		p.prepare();
		p.bake();
		p.cut();
		p.box();

		return p;
	}
}
