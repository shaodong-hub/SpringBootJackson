package com.github.jackson.pojo;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonView;
import com.github.jackson.view.UserDetailView;
import com.github.jackson.view.UserSimpleView;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 创建时间为 14:54-2019-03-22
 * 项目名称 SpringBootJackson
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
public class JsonViewDO {

    @JsonView(UserSimpleView.class)
    private String simple;

    @JsonView(UserDetailView.class)
    private String detail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
