package com.venta.service;

import com.venta.model.Sale;
import com.venta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;


    public Sale newSale(Sale s) {
        return saleRepository.save(s);
    }

    public List<Sale> getSales(){
        return saleRepository.findAll();
    }

}
