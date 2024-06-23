package com.jun.autoBI.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jun.autoBI.model.domain.Chart;
import com.jun.autoBI.service.ChartService;
import com.jun.autoBI.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 君临天下
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-06-12 22:56:25
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




