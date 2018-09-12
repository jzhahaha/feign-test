package com.zjtest.springcloud.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "test-everything", url = "localhost:6789/")
public interface UserService {

    @GetMapping("/test1/getModel")
    Map<String, String> getModel(@RequestParam("id")int id);

}
