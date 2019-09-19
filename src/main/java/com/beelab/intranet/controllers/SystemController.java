package com.beelab.intranet.controllers;

import com.beelab.intranet.repositorys.SystemRepository;
import com.beelab.intranet.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {
    @Autowired
    SystemRepository systemRepository;

    @GetMapping("/all")
    ResponseEntity<?> getAllSystems(){
        try {
            return Response.result(systemRepository.findAll());
        }catch (Exception ex){
            return Response.error(ex);
        }
    }
}
