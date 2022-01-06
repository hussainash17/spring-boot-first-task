package com.example.dbconnection.repository;

import com.example.dbconnection.model.SMSHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SMSHistoryRepository extends JpaRepository<SMSHistory, Long> {
    List<SMSHistory> findByMobileNo(String mobileNo);
    SMSHistory findBySmsLogId(int smsLogId);
}
