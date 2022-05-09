package com.rea.myoffice.service.impl;

import com.rea.myoffice.bean.DepartBean;
import com.rea.myoffice.mapper.DepartinfoMapper;
import com.rea.myoffice.model.Departinfo;
import com.rea.myoffice.model.DepartinfoExample;
import com.rea.myoffice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CRR
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
  @Autowired private DepartinfoMapper departinfoMapper;

  @Override
  public List<DepartBean> findAll() {
    return departinfoMapper.findDepartAndBranchInfo(new DepartinfoExample());
  }

  @Override
  public int deleteById(int deptId) {
    DepartinfoExample example = new DepartinfoExample();
    example.createCriteria().andBranchidEqualTo(deptId);

    return departinfoMapper.deleteByExample(example);
  }

  @Override
  public int deleteByIds(List<Integer> deptIds) {
    DepartinfoExample example = new DepartinfoExample();
    example.createCriteria().andBranchidIn(deptIds);

    return departinfoMapper.deleteByExample(example);
  }

  @Override
  public int createDepart(Departinfo departinfo) {
    return departinfoMapper.insertSelective(departinfo);
  }

  @Override
  public int updateById(Departinfo departinfo) {
    return departinfoMapper.updateByPrimaryKey(departinfo);
  }
}
