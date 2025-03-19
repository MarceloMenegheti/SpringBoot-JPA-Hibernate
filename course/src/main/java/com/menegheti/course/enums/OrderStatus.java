package com.menegheti.course.enums;

public enum OrderStatus {
	
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valouOf(int code) {
		for(OrderStatus obj : OrderStatus.values()) {
			if(obj.getCode() == code) {
				return obj;
			}
		}
		throw new IllegalArgumentException("ERROR! Status Invalido!");
	}
}
