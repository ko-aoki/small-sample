package com.example.exam.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import com.example.exam.entity.MstEmployee;

/** 従業員マスタのDaoインターフェース. */
@ConfigAutowireable
@Dao
public interface MstEmployeeDao {

  @Select
  List<MstEmployee> selectAll();

  @Select
  MstEmployee selectOne(String id);

  @Insert
  @Transactional
  int insert(MstEmployee mstEmployee);
}
