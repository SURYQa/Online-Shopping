package com.shoping.onlineshop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.shoping.onlineshop.service.ProductService;

@Controller
public class productController {
    @Autowired
    public productController(ProductService productService) {
    }
    
    @GetMapping("/product1.html")
    public String product(){
        return"product1";
    }
    @GetMapping("/product2.html")
    public String product2(){
        return"product2";
    }
    @GetMapping("/product3.html")
    public String product3(){
        return"product3";
    }
    @GetMapping("/product4.html")
    public String product4(){
        return"product4";
    }
    @GetMapping("/product5.html")
    public String product5(){
        return"product5";
    }
    @GetMapping("/product6.html")
    public String product6(){
        return"product6";
    }
    @GetMapping("/product7.html")
    public String product7(){
        return"product7";
    }
    @GetMapping("/product8.html")
    public String product8(){
        return"product8";
    }
    @GetMapping("/product9.html")
    public String product9(){
        return"product9";
    }
    @GetMapping("/product10.html")
    public String product10(){
        return"product10";
    }
    @GetMapping("/product11.html")
    public String product11(){
        return"product11";
    }
    @GetMapping("/product12.html")
    public String product12(){
        return"product12";
    }
    @GetMapping("/product13.html")
    public String product13(){
        return"product13";
    }
    @GetMapping("/product14.html")
    public String product14(){
        return"product14";
    }
    @GetMapping("/product15.html")
    public String product15(){
        return"product15";
    }
    @GetMapping("/product16.html")
    public String product16(){
        return"product16";
    }
    @PostMapping("/submin-form")
    public String Submit(){
        return"redirect:/mainpage?success";
    }
}