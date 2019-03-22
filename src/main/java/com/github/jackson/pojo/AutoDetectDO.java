package com.github.jackson.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * 自动检测，（作用在类上）来开启/禁止自动检测。
 * fieldVisibility 字段的可见级别
 *
 * <p>
 * 创建时间为 14:44-2019-03-22
 * 项目名称 SpringBootJackson
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PUBLIC_ONLY)
public class AutoDetectDO {

    private String name;

    public String pass;

}
