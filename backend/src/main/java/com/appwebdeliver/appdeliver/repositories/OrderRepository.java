package com.appwebdeliver.appdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appwebdeliver.appdeliver.entities.Pedidos;

public interface OrderRepository extends JpaRepository<Pedidos, Long> {

	@Query("SELECT DISTINCT obj FROM Pedidos obj JOIN FETCH obj.produtosPedido " + " WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Pedidos> listaPedidosPendentes();
	
}
