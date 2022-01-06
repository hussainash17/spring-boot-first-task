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
    public List<SMSHistory> getSmsOnMobileNo(@RequestParam(required = false) String mobileNo) {
        System.out.println(mobileNo);
        if (mobileNo == null) return smsHistoryRepository.findAll();
        List<SMSHistory> smsHistoriesOnMobileNo = smsHistoryRepository.findByMobileNo(mobileNo);
        return smsHistoriesOnMobileNo;
    }

    @PostMapping("/sms")
    public SMSHistory createSmsHistory(@RequestBody SMSHistory smsHistory) {
        SMSHistory smsHistory1 = smsHistoryRepository.save(new SMSHistory(smsHistory.getSmsLogId(), smsHistory.getMobileNo(), smsHistory.getSentDate(), smsHistory.getSmsText(), smsHistory.getExceptionLog()));
        return smsHistory1;
    }

    @PutMapping("/sms/{smsLogId}")
    public SMSHistory updateSmsHistoryWithSmsLogId(@PathVariable("smsLogId") int smsLogId, @RequestBody SMSHistory smsHistory){
        SMSHistory existedSmsHistory = smsHistoryRepository.findBySmsLogId(smsLogId);
        existedSmsHistory.setMobileNo(smsHistory.getMobileNo());
        existedSmsHistory.setSentDate(smsHistory.getSentDate());
        existedSmsHistory.setSmsText(smsHistory.getSmsText());
        existedSmsHistory.setExceptionLog(smsHistory.getExceptionLog());
        smsHistoryRepository.save(existedSmsHistory);
        return existedSmsHistory;
    }
}
