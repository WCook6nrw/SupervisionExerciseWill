package part.advance.abs;

public interface ShopItemAbs {	
	// current state on the shop's stack
	Integer getQuantity();
	
	// add to shop's stack
	void buy(int i);
	
	// remove from the shop's stack
	void sell(int i);
}
