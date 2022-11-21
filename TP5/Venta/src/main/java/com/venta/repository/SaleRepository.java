package com.venta.repository;

import com.venta.DTO.DTOReportShoppingClient;
import com.venta.DTO.DTOSalesForDay;
import com.venta.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

    @Query("SELECT new com.venta.DTO.DTOReportShoppingClient(s.id_client, SUM(s.price*s.cantidad)) FROM Sale s GROUP BY s.id_client")
    //@Query("SELECT new com.venta.DTO.DTOReportShoppingClient(s.id_client, SUM(s.price)) FROM Sale s GROUP BY s.id_client")
    List <DTOReportShoppingClient> getReportShoppingClients();

    @Query(value = "SELECT new com.venta.DTO.DTOSalesForDay(s.fecha, SUM(s.cantidad) , (s.price*s.cantidad)) FROM Sale s GROUP BY s.fecha, s.cantidad, s.price")
    List <DTOSalesForDay> getReportSalesForDay();

}
