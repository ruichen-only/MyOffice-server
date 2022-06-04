package com.rea.myoffice.service.impl;

import com.rea.myoffice.mapper.BranchinfoMapper;
import com.rea.myoffice.model.Branchinfo;
import com.rea.myoffice.model.BranchinfoExample;
import com.rea.myoffice.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CRR
 */
@Service
public class BranchServiceImpl implements BranchService {
  private final BranchinfoMapper branchinfoMapper;

  @Autowired
  public BranchServiceImpl(BranchinfoMapper branchinfoMapper) {
    this.branchinfoMapper = branchinfoMapper;
  }

  @Override
  public List<Branchinfo> findAll() {
    return branchinfoMapper.selectByExample(new BranchinfoExample());
  }

  @Override
  public int deleteById(int branchId) {
    BranchinfoExample example = new BranchinfoExample();
    example.createCriteria().andBranchIdEqualTo(branchId);

    return branchinfoMapper.deleteByExample(example);
  }

  @Override
  public int deleteByIds(List<Integer> branchIds) {
    BranchinfoExample example = new BranchinfoExample();
    example.createCriteria().andBranchIdIn(branchIds);

    return branchinfoMapper.deleteByExample(example);
  }

  @Override
  public int createBranch(Branchinfo branchinfo) {
    return branchinfoMapper.insertSelective(branchinfo);
  }

  @Override
  public int updateById(Branchinfo branchinfo) {
    return branchinfoMapper.updateByPrimaryKey(branchinfo);
  }
}
