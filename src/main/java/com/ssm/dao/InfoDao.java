package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Info;

public interface InfoDao {
	public void delete(Integer id);
	public List<Info> queryAll();
	public Info queryById(Integer id);
	public void updateById(Info info);
}
