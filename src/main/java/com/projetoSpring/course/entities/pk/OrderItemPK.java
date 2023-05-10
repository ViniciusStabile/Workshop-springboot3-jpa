package com.projetoSpring.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.projetoSpring.course.entities.Order;
import com.projetoSpring.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order ordem;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public Order getOrdem() {
		return ordem;
	}

	public void setOrdem(Order ordem) {
		this.ordem = ordem;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ordem, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(ordem, other.ordem) && Objects.equals(product, other.product);
	}

}
