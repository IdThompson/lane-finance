package com.idowu.lanefinance.repository;


import com.idowu.lanefinance.entity.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionLog, String> {

}
