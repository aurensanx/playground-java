package com.aurensanx.testsjava;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@Log4j2
class TestsJavaApplicationTests {


    public class Country {
    }

    private void copyElements(List<? extends Country> source) {

    }

    @Test
    void testString() {

        int x;
        int y;


        x = 0;
        y = 0;


        if (++x > 0 || ++y > 0) {}
        System.out.println("x:" + x +",y:"+y);


        if (++x > 1 | ++y > 1) {}
        System.out.println("x:" + x +",y:"+y);

        if (++x > 2 && ++y > 2) {}
        System.out.println("x:" + x +",y:"+y);


        if (++x > 3 & ++y > 3) {}
        System.out.println("x:" + x +",y:"+y);

    }

}
