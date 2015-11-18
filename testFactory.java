public class testFactory
{
	static PizzaFactory pFactory;
	public static void main(String[] args)
	{
		PizzaStore testOrderPiz;
		testOrderPiz = new PizzaStore();
		testOrderPiz.orderPizza(args[0]); //อยากเปลี่ยนหน้าพิซซ่า เปลี่ยนตรงนี้
	}
}
