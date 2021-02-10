package part.advance.goods;

import part.advance.abs.ShopItemAbs;

public class Vegetables implements ShopItemAbs {
	
	// Kilograms.
	private int quantity;
		
	public Vegetables(int q) {
			quantity= q;
	}

	@Override
	public Integer getQuantity() {
			System.out.println("We have " + quantity + " kg of vegetables.");
			return quantity;
	}

	@Override
	public void buy(int i) {
		this.quantity += i;
		System.out.println("We have " + quantity + " kg of vegetables.");	
	}

	@Override
	public void sell(int i) {
		this.quantity -= i;
		System.out.println("We have " + quantity + " kg of vegetables.");			
	}
}
