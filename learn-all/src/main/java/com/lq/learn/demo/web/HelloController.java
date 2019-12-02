package com.lq.learn.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cpc
 * @Descripition Descripition
 * @since 2019/12/2
 */
@RestController
public class HelloController {

    /**
     * 优惠买单：获取当前门店优惠买单规则
     */
    @GetMapping("/hello")
    public Object hello() {
        return "666";
    }

}
