package com.example.dbconnection.controller;

import com.example.dbconnection.model.SBDMaster;
import com.example.dbconnection.repository.SBDMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ash/v1")
public class SBDMasterController {

        @Autowired
        private SBDMasterRepository sbdMasterRepository;

        @GetMapping("/masters")
        public List<SBDMaster> getAllBidders() {
            return sbdMasterRepository.findAll();
        }
}
