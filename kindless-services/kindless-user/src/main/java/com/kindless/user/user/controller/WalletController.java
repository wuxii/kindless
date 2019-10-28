package com.kindless.user.user.controller;

import com.harmony.umbrella.web.Response;
import com.kindless.apis.dto.PaymentDto;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author wuxin
 */
@Slf4j
@RestController
@RequestMapping("/wallet")
public class WalletController {

    @PostMapping("/pay")
    public Response<BigDecimal> pay(PaymentDto payment) {
        log.info("wallet pay in global transaction: {}", RootContext.getXID());
        return Response.ok(BigDecimal.TEN);
    }

}
