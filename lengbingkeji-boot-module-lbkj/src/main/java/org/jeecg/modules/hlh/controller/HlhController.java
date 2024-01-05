package org.jeecg.modules.hlh.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.system.vo.LoginUser;
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
@Api(tags = "冷冰科技")
@RestController
@RequestMapping("/hlh/wzlh")
@Slf4j
public class HlhController {
    private int index;
    @AutoLog(value = "冷冰科技-Debug调试")
    @ApiOperation(value = "冷冰科技-调试", notes = "冷冰科技-Debug")
    //@Autowired
    //private RedisUtil redisUtil;
    @GetMapping(value = "/wztolh")
    public Result<String> wztolh(){

        int m = 10;
        int n = 0;
        int results = m/n;
        System.out.println(results);


//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
//        for (int i = 0; i < arr.length; i++) {
//            int target = arr[i];
//            System.out.println(target);
//        }

//        int a = 1;
//        int b = 4;
//        int anInt = getInt(a, b);
//        System.out.println("两数之和："+ anInt);
        String username = "lbkj";
        String realname = "冷冰科技";
        //获取登录用户信息
        LoginUser sysUser = (LoginUser)SecurityUtils.getSubject().getPrincipal();
        if(sysUser != null){
            username = sysUser.getUsername();
            realname = sysUser.getRealname();
        }
        Result<String> result = new Result<String>();
        result.setResult("账户：" + username + "    名字：" + realname);
        return result;
    }

    public int getInt(int m, int n){
        m = m + 1;
        System.out.println("输入的m值：" + m);
        System.out.println("输入的n值：" + n);
        return m + n;
    }
}
