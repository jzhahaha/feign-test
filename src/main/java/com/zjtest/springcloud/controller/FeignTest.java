package com.zjtest.springcloud.controller;

import com.zjtest.springcloud.service.client.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class FeignTest {

    @Resource
    private UserService userService;

    @GetMapping("/feign-consumer")
    public ResponseEntity<?> getModel(@RequestParam("id") int id){

        return new ResponseEntity<Map>(userService.getModel(id), OK);


    }


}
