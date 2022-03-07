package com.knifed.bookstore.repositories;
import com.knifed.bookstore.entities.Book;
import com.knifed.bookstore.entities.ShoppingCart;
import com.knifed.bookstore.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ShoppingCartRepository {
        private ShoppingCart shoppingCart;

        public ShoppingCartRepository (ShoppingCart shoppingCart){
            this.shoppingCart = shoppingCart;
        }

        public ShoppingCart getShoppingCart() {
            return this.shoppingCart;
        }

        public void addToShoppingCard(Order order){
            HashMap<String, Order> orders = this.shoppingCart.getOrders();
            if (orders.containsKey(order.getBook().getId().toString())) {
                Order orderToBeUpdated = orders.get(order.getBook().getId().toString());
                orderToBeUpdated.getBook().setQuantity(orderToBeUpdated.getBook().getQuantity() + 1);
                orders.replace(order.getBook().getId().toString(), orderToBeUpdated);
            }
            else {
                this.shoppingCart.getOrders().put(order.getBook().getId().toString(), order);
            }
        }

    public void clearShoppingCart() {
            this.shoppingCart.getOrders().clear();
    }
}