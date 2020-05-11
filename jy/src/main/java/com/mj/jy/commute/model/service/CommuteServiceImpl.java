package com.mj.jy.commute.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.jy.commute.model.dao.CommuteDao;
import com.mj.jy.commute.model.vo.CommuteDto;
import com.mj.jy.commute.model.vo.CommuteViewDto;


@Service("cService")
public class CommuteServiceImpl implements CommuteService {

	@Autowired
	private CommuteDao cDao;

	@Override
	public ArrayList<CommuteDto> selectCommuteList() {
		return cDao.selectCommuteList();
	}

	@Override
	public int insertCommute(CommuteDto c) {
		return cDao.insertCommute(c);
}

	@Override
	public CommuteViewDto selectClock(String empNo) {
		return cDao.selectClock(empNo);
	}

	@Override
	public int insertquit(CommuteDto c) {
		return cDao.insertquit(c);
	}
	
	
}