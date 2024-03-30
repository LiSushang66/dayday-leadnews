package com.dayday.apis.user;

import com.dayday.model.user.pojos.ApUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("leadnews-user")
public interface IUserClient {

    @GetMapping("/api/v1/user/{id}")
    ApUser findUserById(@PathVariable("id") Integer id);
}
