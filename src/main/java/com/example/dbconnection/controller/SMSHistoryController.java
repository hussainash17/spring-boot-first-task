package com.example.dbconnection.controller;

import com.example.dbconnection.model.SMSHistory;
import com.example.dbconnection.repository.SMSHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ash")
public class SMSHistoryController {

    @Autowired
    private SMSHistoryRepository smsHistoryRepository;

    @GetMapping("/allSms")
    public List<SMSHistory> getAllBidders() {
        return smsHistoryRepository.findAll();
    }

    @GetMapping("/sms")
    public List<SMSHistory>  getSmsOnMobileNo(@RequestParam String mobileNo){
        System.out.println(mobileNo);
        if(mobileNo == null) return smsHistoryRepository.findAll();
        List<SMSHistory> smsHistoriesOnMobileNo = smsHistoryRepository.findByMobileNo(mobileNo);
        return smsHistoriesOnMobileNo;
    }
}
