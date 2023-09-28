package com.example.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.server.mapper.JoblevelMapper;
import com.example.server.pojo.Joblevel;
import com.example.server.service.IJoblevelService;
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
public class JoblevelServiceImpl extends ServiceImpl<JoblevelMapper, Joblevel> implements IJoblevelService {

    @Override
    public boolean save(Joblevel entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<Joblevel> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Joblevel> entityList) {
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
    public boolean remove(Wrapper<Joblevel> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    @Override
    public boolean updateById(Joblevel entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<Joblevel> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(Joblevel entity, Wrapper<Joblevel> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<Joblevel> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public Joblevel getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<Joblevel> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<Joblevel> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public Joblevel getOne(Wrapper<Joblevel> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public int count(Wrapper<Joblevel> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<Joblevel> list(Wrapper<Joblevel> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<Joblevel> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<Joblevel>> E page(E page, Wrapper<Joblevel> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Joblevel>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Joblevel> queryWrapper) {
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
    public List<Object> listObjs(Wrapper<Joblevel> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Joblevel> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<Joblevel> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<Joblevel> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<Joblevel> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public UpdateChainWrapper<Joblevel> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<Joblevel> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(Joblevel entity, Wrapper<Joblevel> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }


}
