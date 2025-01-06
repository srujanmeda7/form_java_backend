package com.example.demo.respositry;

import com.example.demo.modal.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itemrepo extends JpaRepository<Items,Integer> {
}
