package com.example.fakestorecart.controllers;


import com.example.fakestorecart.models.Cart;
import com.example.fakestorecart.services.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    private final CartService cartService;
    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/carts/{id}")
    public Cart getCartById(@PathVariable("id") Long id) {
        return cartService.getCartById(id);
    }
    @GetMapping("/carts")
    public Cart[] getAllcart(){
        return cartService.getAllcart();
    }
    @GetMapping("/carts/")
    public Cart[] getCartInRangeOfDate(@RequestParam("start-date") String startDate, @RequestParam("end-date") String endDate){
        return cartService.getCartInRangeOfDate(startDate, endDate);
    }
    @GetMapping("/carts/user/{userId}")
    public Cart[] getCartByUserId(@PathVariable("userId") Long userId){
        return cartService.getCartByUserId(userId);
    }
    @PostMapping("/carts")
    public Cart addNewCart(@RequestBody Cart cart){
        return cartService.addNewCart(cart);
    }
    @PatchMapping("/carts/{id}")
    public Cart updateCart(@PathVariable("id") Long id,@RequestBody Cart cart){
        return cartService.updateCart(id,cart);
    }
    @DeleteMapping("/carts/{id}")
    public Cart deleteCart(@PathVariable("id") Long id){
        return cartService.deleteCart(id);
    }

}
