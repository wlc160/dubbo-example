package com.springboot.dubbo;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 工程名:springboot-dubbo-client
 * 包名:com.springboot.dubbo
 * 文件名:BuyController
 * description:
 *
 * @author lcwen
 * @version V1.0: BuyController.java 2019/12/19 13:13
 **/
@RestController
@RequestMapping(value = "/client")
public class BuyController {

    @Reference(url = "dubbo://192.168.6.19:20880/com.springboot.dubbo.BuyService")
    BuyService buyService;

    @RequestMapping("/buy")
    public String buy(){
        return  buyService.buy("西瓜");
    }

}
