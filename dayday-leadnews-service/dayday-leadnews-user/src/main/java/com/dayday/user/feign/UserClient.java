package com.dayday.user.feign;

import com.dayday.apis.user.IUserClient;
import com.dayday.model.user.pojos.ApUser;
import com.dayday.user.service.ApUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserClient implements IUserClient {

    @Autowired
    private ApUserService apUserService;

    @Override
    @GetMapping("/api/v1/user/{id}")
    public ApUser findUserById(@PathVariable("id") Integer id) {
        return apUserService.getById(id);
    }
}