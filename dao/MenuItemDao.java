package com.cognizant.truyum.dao;
import com.cognizant.truyum.model.MenuItem;

import java.util.List;

public interface MenuItemDao
{

    abstract List<MenuItem> getMenuItemListAdmin();

    abstract List<MenuItem> getMenuItemListCustomer();

    abstract void modifyMenuItem(MenuItem menuItem);

    abstract MenuItem getMenuItem(long menuItemId);
}
