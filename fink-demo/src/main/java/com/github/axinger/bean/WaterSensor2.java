package com.github.axinger.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 水位传感器类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaterSensor2 {
    // flink 要求为public
    // 无参构造起
    public String id;
    public Long ts;
    public String name;
}
