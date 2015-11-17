public class testFactory
{
	static PizzaFactory pFactory;
	public static void main(String[] args)
	{
		PizzaStore testOrderPiz;
		pFactory = new PizzaFactory();
		testOrderPiz = new PizzaStore(pFactory);
		testOrderPiz.orderPizza("Tomyam"); //อยากเปลี่ยนหน้าพิซซ่า เปลี่ยนตรงนี้
		//pFactory.orderPizza("Tomyam");
	}
}
