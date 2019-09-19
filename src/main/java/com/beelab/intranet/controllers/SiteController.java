package com.beelab.intranet.controllers;

import com.beelab.intranet.repositorys.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class SiteController {
    @Autowired
    SiteRepository siteRepositorys;
}
