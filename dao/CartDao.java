package com.cognizant.truyum.dao;
import com.cognizant.truyum.model.MenuItem;

import java.util.List;

public interface CartDao {
    abstract void addCartItem(long userId, long menuItemId);

    abstract List<MenuItem> getAllCartItems(long userId) throws CartEmptyException;

    abstract void removeCartItem(long userId, long menuItemId);
}
