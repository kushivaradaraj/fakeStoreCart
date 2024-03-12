package com.example.fakestorecart.services;


import com.example.fakestorecart.models.Cart;

public interface CartInteface {
    public Cart getCartById(Long id);
    public Cart[] getAllcart();
    public Cart[] getCartInRangeOfDate(String startDate, String endDate);
    public Cart[] getCartByUserId(Long userId);
    public Cart addNewCart(Cart cart);
    public Cart updateCart(Long id,Cart cart);
    public Cart deleteCart(Long id);
}