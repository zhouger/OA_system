package com.example.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.example.server.mapper.EmployeeEcMapper;
import com.example.server.pojo.EmployeeEc;
import com.example.server.service.IEmployeeEcService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
@Service
public class EmployeeEcServiceImpl extends ServiceImpl<EmployeeEcMapper, EmployeeEc> implements IEmployeeEcService {

    @Override
    public boolean save(EmployeeEc entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<EmployeeEc> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<EmployeeEc> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<EmployeeEc> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    @Override
    public boolean updateById(EmployeeEc entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<EmployeeEc> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(EmployeeEc entity, Wrapper<EmployeeEc> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<EmployeeEc> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public EmployeeEc getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<EmployeeEc> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<EmployeeEc> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public EmployeeEc getOne(Wrapper<EmployeeEc> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public int count(Wrapper<EmployeeEc> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<EmployeeEc> list(Wrapper<EmployeeEc> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<EmployeeEc> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<EmployeeEc>> E page(E page, Wrapper<EmployeeEc> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<EmployeeEc>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<EmployeeEc> queryWrapper) {
        return super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<EmployeeEc> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<EmployeeEc> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<EmployeeEc> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<EmployeeEc> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<EmployeeEc> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public UpdateChainWrapper<EmployeeEc> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<EmployeeEc> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(EmployeeEc entity, Wrapper<EmployeeEc> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }
}
