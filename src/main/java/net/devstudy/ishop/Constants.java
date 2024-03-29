package net.devstudy.ishop;

public final class Constants {
	public static final String CURRENT_SHOPPING_CART = "CURRENT_SHOPPING_CART";

	public static final int MAX_PRODUCTS_PER_SHOPPING_CART = 20;

	public static final int MAX_PRODUCT_COUNT_PER_SHOPPING_CART = 10;

	public static final String ACCOUNT_ACTIONS_HISTORY = "ACCOUNT_ACTIONS_HISTORY";

	public enum Cookie {
		SHOPPING_CART("iSCC", 60 * 60 * 24 * 365);

		private final String name;
		private final int ttl;

		private Cookie(String name, int ttl) {
			this.name = name;
			this.ttl = ttl;
		}

		public String getName() {
			return name;
		}

		public int getTtl() {
			return ttl;
		}
	}
}
