package org.jeecg.modules.lengbingkeji.lb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: LbController
 * Package: org.jeecg.modules.lengbingkeji.lb.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/7/17 17:13
 * @Version 1.0
 */
@Api(tags = "冷冰科技")
@RestController
@RequestMapping("/lb/ctr")
@Slf4j
public class LbController {
    @AutoLog(value = "冷冰科技-lb")
    @ApiOperation(value = "冷冰科技_lb", notes = "冷冰科技@lb")
    @GetMapping(value = "/lbtojava")
    public Result<String> lbtojava(){
        Result<String> result = new Result<String>();
        result.setResult("lb to java！！！");
        return result;
    }
}
