package com.harmony.kindless.user.controller;

import com.harmony.kindless.apis.domain.user.User;
import com.harmony.kindless.user.service.UserService;
import com.harmony.umbrella.web.method.annotation.BundleController;
import com.harmony.umbrella.web.method.annotation.BundleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuxii
 */
@BundleController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @BundleView({"password", "userSettings", "userDetails", "id", "new"})
    @GetMapping("/u/{username}")
    public User user(@PathVariable String username) {
        return userService.getByUsername(username);
    }

}
