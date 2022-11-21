package com.venta.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.venta.DTO.*;
import com.venta.model.Sale;
import com.venta.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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

    @PutMapping("/sales/{id}")
    Sale modifySale (@RequestBody Sale saleUpdated, @PathVariable Integer id) {return service.updateSale(saleUpdated,id);}

    @GetMapping("/sales/reportShoppingClients")
    public List<DTOClientsReport> getReportShoppingClients() throws JsonProcessingException {
        List<DTOClientsReport> listado = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:3001/clients";
        for (DTOReportShoppingClient c: service.getReportShoppingSales()) {
            ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl + "/" + c.getId_client(), String.class);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.getBody());
            listado.add(new DTOClientsReport(c.getId_client(), root.path("name").asText(), root.path("lastname").asText(), c.getAmount()));
        }
        return listado;
    }

    @GetMapping("/sales/reportSalesForDay")
    public List<DTOSalesForDay> getReportSalesForDay(){ return service.getReportSalesForDay(); }

    @GetMapping("/sales/productMoreSell")
    public DTOProductMoreSale getProductMoreSell(){ return service.getProductMoreSell(); }
}
