package com.cognizant.truyum.model;
import java.util.List;
import java.util.Objects;
public class Cart {

    private List<MenuItem> menuItemList;
    private double total;

    public Cart(List<MenuItem> menuItemList, double total) {
        this.menuItemList = menuItemList;
        this.total = total;
    }


    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "menuItemList=" + menuItemList +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        Cart cart = (Cart) o;
        return Double.compare(cart.total, total) == 0 && menuItemList.equals(cart.menuItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItemList, total);
    }
}
