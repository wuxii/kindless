package com.harmony.kindless.weixin;

import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;

/**
 * @author wuxii
 */
public interface WxMpMessageRuleHandler extends WxMpMessageHandler {

    void config(WxMpMessageRouter router);

}