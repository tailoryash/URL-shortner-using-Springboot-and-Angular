package com.yashtailor.URLShortner.controller;

import com.yashtailor.URLShortner.model.Url;
import com.yashtailor.URLShortner.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/url/shortner")
@CrossOrigin(origins = "http://localhost:4200/")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/{id}")
    public String getOriginalUrl(@PathVariable String id) {
        return urlService.getOriginalUrl(id);
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url){
        return urlService.generateShortUrl(url);
    }
}
