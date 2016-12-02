package org.myapp.test.controller;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by v-jagads-pho on 11/11/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
