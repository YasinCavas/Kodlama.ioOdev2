package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Ekmek", "TombikEkmek", 5.0, 300, "Beyaz");
		// Product product=new Product();
		// product.setName("Ekmek");
		// product.setId(1);
		// product.setDescription("TombikEkmek");
		// product.setPrice(50.0);
		// product.setStockAmount(300);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
