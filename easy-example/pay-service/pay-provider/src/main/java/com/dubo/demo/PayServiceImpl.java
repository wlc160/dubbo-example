package com.dubo.demo;

/**
 * 工程名:pay-service
 * 包名:com.dubo.demo
 * 文件名:PayServiceImpl
 * description:
 *
 * @author lcwen
 * @version V1.0: PayServiceImpl.java 2019/12/18 14:10
 **/
public class PayServiceImpl implements PayService{
    @Override
    public String pay(String info) {
        System.out.println("Apache Dubbo :" + info);
        return info;
    }
}
