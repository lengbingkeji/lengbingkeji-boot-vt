package org.jeecg.modules.hlh.controller;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HlhController
 * Package: org.jeecg.modules.hlh.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/7/13 10:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/hlh/wzlh")
@Slf4j
public class HlhController {
    @GetMapping(value = "/wztolh")
    public Result<String> wztolh(){
        Result<String> result = new Result<String>();
        result.setResult("hwz to hlh!");
        return result;
    }
}
