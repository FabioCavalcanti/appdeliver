package com.appwebdeliver.appdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appwebdeliver.appdeliver.entities.Produtos;

public interface ProductRepository extends JpaRepository<Produtos, Long> {
	List<Produtos> findAllByOrderByNameAsc();
}
