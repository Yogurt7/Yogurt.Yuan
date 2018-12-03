package com.ssm.service;

import java.util.List;

import com.ssm.entity.Info;

public interface InfoService {
	public void delete(Integer id);
	public List<Info> queryAll();
	public Info queryById(Integer id);
	public void updateById(Info info);
	
	
}
