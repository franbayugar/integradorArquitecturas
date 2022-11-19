package com.venta.service;

import com.venta.DTO.DTOReportShoppingClient;
import com.venta.DTO.DTOSalesForDay;
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

    public Sale updateSale(Sale saleUpdated, Integer id) {
        Sale sale = saleRepository.getReferenceById(id);
        sale.setId_client(saleUpdated.getId_client());
        sale.setId_product(saleUpdated.getId_product());
        sale.setCantidad(saleUpdated.getCantidad());
        sale.setFecha(saleUpdated.getFecha());
        sale.setPrice(saleUpdated.getPrice());
        return saleRepository.save(sale);
    }

    public List<DTOReportShoppingClient> getReportShoppingSales() {
        return saleRepository.getReportShoppingClients();
    }

    public List<DTOSalesForDay> getReportSalesForDay() {return saleRepository.getReportSalesForDay(); }
}
