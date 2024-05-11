package com.dao;

import com.entity.KechengkaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengkaoqinView;

/**
 * 课程考勤 Dao 接口
 *
 * @author 
 */
public interface KechengkaoqinDao extends BaseMapper<KechengkaoqinEntity> {

   List<KechengkaoqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
