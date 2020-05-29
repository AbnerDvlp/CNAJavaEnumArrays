package aulaEnumeracao;

import java.util.Date;

import aulaEnumeracao2.Order;

public class App {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
