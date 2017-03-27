package com.harmony.kindless.oauth.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.harmony.kindless.oauth.service.ClientInfoService;

/**
 * oauth2.0的分为4种模式, 外加一个access_token刷新:
 * <ul>
 * <li>授权码模式 (authorization code)
 * <li>简单模式 (implicit)
 * <li>密码模式 (resource owner password credentials)
 * <li>客户端模式 (client credentials)
 * <li>授权码刷新 (refresh token)
 * </ul>
 * 
 * @author wuxii@foxmail.com
 */
@RestController
@RequestMapping("/oauth")
public class OAuthController {

    @Autowired
    private ClientInfoService clientInfoService;

    /**
     * 负责以下grant_type
     * <li>authorization_code 第一阶段获取code
     * 
     * @see {@link http://open.weibo.com/wiki/Oauth2/authorize}
     */
    @GetMapping("/authorize")
    public void authorize(NativeWebRequest webRequest) {
        // TODO login ? true=generate authorize code, false=login
        // TODO not login forward to login
        // TODO submit login
    }

    /**
     * 负责以下grant_type
     * <li>authorization_code 第二阶段通过code换取token
     * <li>password
     * <li>client_credentials
     * <li>refresh_token
     * 
     * @throws OAuthProblemException
     * @throws OAuthSystemException
     */
    @RequestMapping("/token")
    public void token(HttpServletRequest request, HttpServletResponse response) {

    }

}
