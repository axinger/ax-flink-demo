package com.github.axinger.a16cdc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysProduct {

    // 数据id
    public Integer id;
    // 产品名称
    public String name;

    // 生产的数量,统计每个产品每日生产总数
    public Integer quantity;

    // 生产时间时间
//    public long ts;
    public LocalDateTime date;
}
