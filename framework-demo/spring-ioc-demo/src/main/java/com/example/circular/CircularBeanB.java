package com.example.circular;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jy
 */
@Getter
@Component
public class CircularBeanB {

    @Autowired
    private CircularBeanA circularBeanA;
}
