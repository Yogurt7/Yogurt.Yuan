package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.InfoDao;
import com.ssm.entity.Info;
import com.ssm.service.InfoService;
@Service
public class InfoServiceImpl implements InfoService {
	@Autowired
	private InfoDao infoDao;
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.infoDao.delete(id);
	}

	@Override
	public List<Info> queryAll() {
		// TODO Auto-generated method stub
		return this.infoDao.queryAll();
	}

	@Override
	public Info queryById(Integer id) {
		// TODO Auto-generated method stub
		return this.infoDao.queryById(id);
	}

	@Override
	public void updateById(Info info) {
		// TODO Auto-generated method stub
		this.infoDao.updateById(info);
	}

}
