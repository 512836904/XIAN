package com.spring.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.spring.dao.WeldedJunctionMapper;
import com.spring.dto.WeldDto;
import com.spring.model.WeldedJunction;
import com.spring.page.Page;
import com.spring.service.WeldedJunctionService;

@Service
@Transactional
public class WeldedJunctionServiceImpl implements WeldedJunctionService{
	@Autowired
	private WeldedJunctionMapper wjm;

	@Override
	public List<WeldedJunction> getWeldedJunctionAll(Page page, String str) {
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getWeldedJunctionAll(str);
	}

	@Override
	public int getWeldedjunctionByNo(String wjno) {
		return wjm.getWeldedjunctionByNo(wjno);
	}

	@Override
	public boolean addJunction(WeldedJunction wj) {
		return wjm.addJunction(wj);
	}

	@Override
	public boolean updateJunction(WeldedJunction wj) {
		return wjm.updateJunction(wj);
	}

	@Override
	public boolean deleteJunction(BigInteger id) {
		return wjm.deleteJunction(id);
	}

	@Override
	public WeldedJunction getWeldedJunctionById(BigInteger id) {
		return wjm.getWeldedJunctionById(id);
	}
	
	@Override
	public List<WeldedJunction> getJMByWelder(Page page, WeldDto dto, String welderid) {
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getJMByWelder(dto,welderid);
	}

	@Override
	public List<WeldedJunction> getJunctionByWelder(Page page, String welder, WeldDto dto) {
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getJunctionByWelder(welder, dto);
	}

	@Override
	public String getFirsttime(WeldDto dto, BigInteger machineid, String welderid, String junid) {
		return wjm.getFirsttime(dto,machineid,welderid,junid);
	}

	@Override
	public String getLasttime(WeldDto dto, BigInteger machineid, String welderid, String junid) {
		return wjm.getLasttime(dto,machineid,welderid,junid);
	}

	@Override
	public List<WeldedJunction> getTaskResultAll(Page page, String str) {
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getTaskResultAll(str);
	}

	@Override
	  public int getCountByTaskid(BigInteger taskid,BigInteger type) {
	    return wjm.getCountByTaskid(taskid,type);
	  }

	@Override
	public boolean addTask(WeldedJunction wj) {
		return wjm.addTask(wj);
	}

	@Override
	public List<WeldedJunction> getFreeJunction(Page page,String str) {
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getFreeJunction(str);
	}

	@Override
	public List<WeldedJunction> getWeldedJunction(String str) {
		return wjm.getWeldedJunctionAll(str);
	}

	@Override
	public List<WeldedJunction> getRealWelder(Page page,BigInteger taskid) {
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getRealWelder(taskid);
	}

	@Override
	public List<WeldedJunction> getWeldedJunctionAll(String str) {
		return wjm.getWeldedJunctionAll(str);
	}

	@Override
	public boolean updateTask(WeldedJunction wj) {
		// TODO Auto-generated method stub
		return wjm.updateTask(wj);
	}
	
	@Override
	public List<WeldedJunction> getSwDetail(Page page,String taskno,String time, WeldDto dto) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getSwDetail(taskno,time,dto);
	}

	@Override
	public boolean updateTaskByFid(WeldedJunction wj) {
		// TODO Auto-generated method stub
		return wjm.updateTaskByFid(wj);
	}

	@Override
	public List<WeldedJunction> getCardList(Page page, String search) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page.getPageIndex(), page.getPageSize());
		return wjm.getCardList(search);
	}

	@Override
	public void addCard(WeldedJunction wj) {
		// TODO Auto-generated method stub
		wjm.addCard(wj);
	}

	@Override
	public void addProductNum(WeldedJunction wj) {
		// TODO Auto-generated method stub
		wjm.addProductNum(wj);
	}

	@Override
	public List<WeldedJunction> getProductList(Page page, String search) {
		// TODO Auto-generated method stub
		return wjm.getProductList(search);
	}

	@Override
	public void updateCard(WeldedJunction wj) {
		// TODO Auto-generated method stub
		wjm.updateCard(wj);
	}

	@Override
	public void deleteCard(String fid) {
		// TODO Auto-generated method stub
		wjm.deleteCard(fid);
	}

	@Override
	public void deleteProduct(String fid) {
		// TODO Auto-generated method stub
		wjm.deleteProduct(fid);
	}

	@Override
	public WeldedJunction getProductByCardid(String fid) {
		// TODO Auto-generated method stub
		return wjm.getProductByCardid(fid);
	}

	@Override
	public List<WeldedJunction> getWeldLevelAll(String search) {
		// TODO Auto-generated method stub
		return wjm.getWeldLevelAll(search);
	}
}
