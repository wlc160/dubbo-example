package com.springboot.dubbo;

import org.apache.dubbo.config.annotation.Service;

/**
 * 工程名:springboot-dubbo-service
 * 包名:com.springboot.dubbo
 * 文件名:BuyServiceImpl
 * description:
 *
 * @author lcwen
 * @version V1.0: BuyServiceImpl.java 2019/12/19 12:55
 **/
@Service
public class BuyServiceImpl implements BuyService{
    @Override
    public String buy(String things) {
        return "买了" + things;
    }
}
