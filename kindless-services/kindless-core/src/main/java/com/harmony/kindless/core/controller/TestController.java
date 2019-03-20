package com.harmony.kindless.core.controller;

import com.harmony.kindless.apis.domain.core.User;
import com.harmony.kindless.core.service.TestService;
import com.harmony.umbrella.data.JpaQueryBuilder;
import com.harmony.umbrella.web.Response;
import com.harmony.umbrella.web.method.annotation.BundleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;

/**
 * @author wuxii
 */
@BundleController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private EntityManager entityManager;

    @GetMapping("/u1/{username}")
    public Response<Object> user(@PathVariable("username") String username) {
        // no transaction
        testService.get1(username);
        return Response.ok();
    }

    @GetMapping("/u2/{username}")
    public Response<Object> user2(@PathVariable("username") String username) {
        // around transaction
        testService.get2(username);
        return Response.ok();
    }

    @GetMapping("/u3/{username}")
    public Response<Object> user3(@PathVariable("username") String username) {
        // no transaction
        testService.get3(username);
        return Response.ok();
    }

    @GetMapping("/u4/{username}")
    public Response<Object> user4(@PathVariable("username") String username) {
        // pre transaction
        testService.get4(username);
        return Response.ok();
    }

    @GetMapping("/u5/{username}")
    public Response<Object> user5(@PathVariable("username") String username) {
        // no transaction
        TestService.get(entityManager, username);
        return Response.ok();
    }

    @GetMapping("/u6/{username}")
    public Response<Object> user6(@PathVariable("username") String username) {
        // no transaction
        JpaQueryBuilder
                .newBuilder(User.class)
                .withEntityManager(entityManager)
                .equal("username", username)
                .getSingleResult();
        return Response.ok();
    }


}