import java.util.Scanner;
class Item {
    protected String name;
    protected int quantity;
    protected double price;
    /**
     * Constructs the object.
     *
     * @param      name      The name
     * @param      quantity  The quantity
     * @param      price     The price
     */
    Item(final String name, final String quantity, final String price) {
        this.name = name;
        this.quantity = Integer.parseInt(quantity);
        this.price =  Double.parseDouble(price);
    }
    /**.
     * Constructs the object.
     *
     * @param      name      The name
     * @param      quantity  The quantity
     */
    Item(final String name, final String quantity) {
        this.name = name;
        this.quantity = Integer.parseInt(quantity);
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name + " " + this.quantity + " " + this.price;
    }
    /**.
     * { function_description }
     *
     * @param      other  The other
     *
     * @return     { description_of_the_return_value }
     */
    public boolean equals(final Item other) {
        if (this.name.equals(other.name)) {
            return true;
        }
        return false;
    }
}
/**
 * Class for shopping cartesian.
 */
class ShoppingCart {
    Item[] catalog;
    Item[] cart;
    int cartSize;
    int catalogSize;
    String[] validCoupons = {"IND10", "IND20", "IND30", "IND50"};
    static double discount = 0.0;
    static boolean couponApplied = false;
    /**
     * Constructs the object.
     */
    ShoppingCart() {
        catalog = new Item[20];
        cart = new Item[20];
        cartSize = 0;
        catalogSize = 0;
    }
    /**
     * Adds to catalog.
     *
     * @param      item  The item
     */
    void addToCatalog(final Item item) {
        catalog[catalogSize++] = item;
    }
    /**.
     * Adds to cartesian.
     *
     * @param      item  The item
     */
    void addToCart(final Item item) {
        if (!inCart(item)) {
            if (checkCatalog(item)) {
                cart[cartSize++] = item;
            }
        }
    }
    /**
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    boolean inCart(final Item item) {
        for (Item s : cart) {
            if (s != null) {
                if (s.equals(item)) {
                    s.quantity = s.quantity + item.quantity;
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * { function_description }
     *
     * @param      given  The given
     *
     * @return     { description_of_the_return_value }
     */
    private boolean checkCatalog(final Item given) {
        for (Item i : catalog) {
            if (i != null) {
                if (i.equals(given)) {
                    if (given.quantity <= i.quantity) {
                        i.quantity = i.quantity - given.quantity;
                        return true;
                    }

                }
            }
        }
        return false;
    }
    /**
     * Removes a from cartesian.
     *
     * @param      item  The item
     */
    void removeFromCart(final Item item) {
        for (int i = 0; i < cartSize; i++) {
            if (item.equals(cart[i])) {
                cart[i].quantity = cart[i].quantity - item.quantity;
            }
        }
    }
    /**
     * Shows the cartesian.
     */
    void showCart() {
        for (Item i : cart) {
            if (i != null) {
                if (i.quantity != 0) {
                    System.out.println(i.name + " " + i.quantity);
                }
            }
        }
    }
    void showCatalog() {
        for (Item i : catalog) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }
    /**
     * Gets the total amount.
     *
     * @return     The total amount.
     */
    double getTotalAmount() {
        double total = 0;
        for (int i = 0; i < cartSize; i++) {
            total += cart[i].quantity * getPrice(cart[i]);
        }
        return total;
    }
    /**
     * Gets the price.
     *
     * @param      given  The given
     *
     * @return     The price.
     */
    double getPrice(final Item given) {
        for (Item i : catalog) {
            if (i != null) {
                if (i.equals(given)) {
                    return i.price;
                }
            }
        }
        return 0.0;
    }
    /**
     * { function_description }
     *
     * @param      cou   The cou
     */
    void applyCoupon(final String cou) {
        boolean valid = false;
        for (String s : validCoupons) {
            if (s.equals(cou)) {
                valid = true;
            }
        }
        if (!valid) {
            System.out.println("Invalid coupon");
            return;
        }
        if (couponApplied) {
            return;
        }
        for (String s : validCoupons) {
            if (s.equals(cou)) {
                int num =  Integer.parseInt(cou.substring(3));
                discount = getTotalAmount() / 100 * num;
                couponApplied = true;
            }
        }
    }
    /**
     * { function_description }
     */
    void printInvoice() {
        System.out.println("Name   quantity   Price");
        for (Item s : cart) {
            if (s != null) {
                if (s.quantity != 0) {
                    System.out.println(s.name + " " + s.quantity + " " + getPrice(s));
                }
            }
        }
        double total = getTotalAmount();
        double newTotal = total - discount;
        double tax = newTotal * 15 / 100;
        System.out.println("Total:" + getTotalAmount());
        System.out.println("Disc%:" + discount);
        System.out.println("Tax:" + tax);
        System.out.println("Payable amount: " + getPayableAmount());
    }
    /**
     * Gets the payable amount.
     *
     * @return     The payable amount.
     */
    public double getPayableAmount() {
        double total = getTotalAmount();
        double newTotal = total - discount;
        double tax = newTotal * 15 / 100;
        return newTotal + tax;


    }
}