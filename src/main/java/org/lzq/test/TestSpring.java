package org.lzq.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lzq on 2016/11/10 0010.
 */

@RestController
@RequestMapping(value = "/test")
public class TestSpring {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getString(){
        return "hello";
    }
}
