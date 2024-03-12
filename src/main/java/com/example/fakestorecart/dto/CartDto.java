package com.example.fakestorecart.dto;


        import com.example.fakestorecart.models.Product;
        import lombok.Getter;
        import lombok.Setter;

        import java.util.Date;

@Getter
@Setter
public class CartDto {
    private Long id;
    private Long userId;
    private Date date;
    private Product[] products;

}