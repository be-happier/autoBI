package com.jun.autoBI.model.domain.dto.chart;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChartEditRequest implements Serializable {

    /**
     * name
     */
    private String name;

    /**
     * id
     */
    private Long id;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表数据
     */
    private String chartData;

    /**
     * 图表类型
     */
    private String chartType;

    private static final long serialVersionUID = 1L;
}
