package io.ciain.modules.admin.controller;

import io.ciain.modules.admin.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/user")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

}
