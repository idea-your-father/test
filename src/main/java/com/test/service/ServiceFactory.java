package com.test.service;

import com.test.service.impl.BookServiceImpl;
import com.test.service.impl.UserServiceImpl;

import java.io.Serializable;

/**
 * @author LeeShuhang 1142245564@qq.com
 */
public class ServiceFactory {

    private static final UserService USER_SERVICE;

    private static final BookService BOOK_SERVICE;
    /* 使用工厂模式，提供一个接口 */

    static {
        USER_SERVICE = new UserServiceImpl();
        BOOK_SERVICE = new BookServiceImpl();
    }

    public static UserService getUserService(){
        return ServiceFactory.USER_SERVICE;
    }

    public static BookService getBookService(){
        return ServiceFactory.BOOK_SERVICE;
    }
}
