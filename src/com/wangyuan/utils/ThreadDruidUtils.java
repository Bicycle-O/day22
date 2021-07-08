package com.wangyuan.utils;

import com.wangyuan.bean.Student;

public class ThreadDruidUtils {
    private ThreadLocal<Student> th = new ThreadLocal<>();
}
