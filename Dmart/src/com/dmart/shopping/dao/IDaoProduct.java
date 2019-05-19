package com.dmart.shopping.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dmart.shopping.model.product;

public interface IDaoProduct {
	ArrayList<product> getAllProductDetails() throws ClassNotFoundException, SQLException;


}
