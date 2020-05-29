package aulaEnumeracao2;

import java.util.Date;

import aulaEnumeracao.OrderStatus;

public class Order {
	private Integer id;
	private Date momento;
	private OrderStatus statusOrdem;

	public Order() {

	}

	public Order(Integer id, Date momento, OrderStatus statusOrdem) {
		this.id = id;
		this.momento = momento;
		this.statusOrdem = statusOrdem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatusOrdem() {
		return statusOrdem;
	}

	public void setStatusOrdem(OrderStatus statusOrdem) {
		this.statusOrdem = statusOrdem;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", momento=" + momento + ", statusOrdem=" + statusOrdem + "]";
	}

}
