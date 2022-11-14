package com.venta.controller;

import com.venta.model.Sale;
import com.venta.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleController {
    @Qualifier("saleService")
    @Autowired
    private SaleService service;

    public SaleController(@Qualifier ("saleService") SaleService service){
        super();
        this.service = service;
    }

    //metodos para controller
    @GetMapping("/sale")
    public List<Sale> getAllSales(){
        return service.getSales();
    }

    @PostMapping("/sales")
    public Sale newSale(@RequestBody Sale s){
        return service.newSale(s);
    }
    //devolveria un listado de  ventas
}
