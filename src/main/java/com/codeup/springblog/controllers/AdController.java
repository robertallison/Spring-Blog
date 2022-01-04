package com.codeup.springblog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AdController {


   private final PostRepository adDao;

   public AdController(PostRepository adDao) {
       this.adDao = adDao;
   }

   @GetMapping("/ads")
    public String index(Model model) {
       model.addAttribute("ads", adDao.findAll());
       return "ads/index";
   }
}
