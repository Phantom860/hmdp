package com.hmdp;

import com.hmdp.service.IShopService;
import com.hmdp.service.impl.ShopServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class HmDianPingApplicationTests {

    @Autowired
    private ShopServiceImpl shopService;


    @Test
    public void testSaveShop() {
        shopService.saveShop2Redis(1L, 10L);
    }
}

