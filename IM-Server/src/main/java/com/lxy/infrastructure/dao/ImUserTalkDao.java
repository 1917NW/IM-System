package com.lxy.infrastructure.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxy.infrastructure.entity.ImUserMsg;
import com.lxy.infrastructure.entity.ImUserTalk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * (ImUserTalk)表数据库访问层
 *
 * @author makejava
 * @since 2024-03-19 16:34:25
 */
@Mapper
public interface ImUserTalkDao extends BaseMapper<ImUserTalk> {


}

