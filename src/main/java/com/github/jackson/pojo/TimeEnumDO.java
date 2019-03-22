package com.github.jackson.pojo;

import com.alibaba.fastjson.JSON;
import com.github.jackson.enums.TimeUnitEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 创建时间为 15:40-2019-03-22
 * 项目名称 SpringBootJackson
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
public class TimeEnumDO {

    private String desc;

    private TimeUnitEnum timeUnit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
