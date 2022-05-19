package com.example.task9_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/public/api")
    public String connectAllUsers(Principal principal) {
        return "Connection ability for all users. User connected: " + principal.getName();
    }

    @GetMapping("/admin/api")
    public String connectAdminOnly(Principal principal) {
        return "Connection ability for admin only. Admin connected: " + principal.getName();
    }

    @GetMapping("support/api")
    public String connectSupport(Principal principal) {
        return "Connection ability for support. Support connected: " + principal.getName();
    }


}
