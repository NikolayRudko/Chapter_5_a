import java.util.Arrays;

/**
 * Constraints a shopping list
 *
 * @author Nikolay Rudko
 * @version 1.0
 * @since 1.0
 */
public class Payment {
    private Product[] products = new Product[1];

    /**
     * Nested class allows you to create products.
     *
     * @author Nikolay Rudko
     * @since 1.0
     */
    private class Product {

        private int id;
        private String nameProduct;
        private double cost;

        /**
         * Create of product
         *
         * @param nameProduct The name of the product.
         * @param cost        The cost of the product.
         * @param id          The ID of the product.
         */
        public Product(String nameProduct, double cost, int id) {
            this.id = id;
            this.nameProduct = nameProduct;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "idBuy=" + id +
                    ", nameProduct='" + nameProduct + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }

    /**
     * Adds products to the payment.
     *
     * @param cost The cost of the item
     * @param name The name of the item
     * @see Product
     */
    public void addBuy(String name, double cost) {

        if (this.products[0] == null) {
            this.products[0] = new Product(name, cost, this.products.length - 1);
        } else {
            //This is a temporary solution, the collections will be used in future projects.
            this.products = Arrays.copyOf(this.products, this.products.length + 1);
            this.products[this.products.length - 1] = new Product(name, cost, this.products.length - 1);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "Products=" + Arrays.toString(products) +
                '}';
    }
}
