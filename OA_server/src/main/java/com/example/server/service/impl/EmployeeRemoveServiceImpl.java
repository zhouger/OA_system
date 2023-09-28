package com.example.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.server.mapper.EmployeeRemoveMapper;
import com.example.server.pojo.EmployeeRemove;
import com.example.server.service.IEmployeeRemoveService;
import org.springframework.stereotype.Service;

import java.util.Collection;
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
public class EmployeeRemoveServiceImpl extends ServiceImpl<EmployeeRemoveMapper, EmployeeRemove> implements IEmployeeRemoveService {

    @Override
    public boolean saveBatch(Collection<EmployeeRemove> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<EmployeeRemove> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<EmployeeRemove> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(EmployeeRemove entity) {
        return false;
    }

    @Override
    public EmployeeRemove getOne(Wrapper<EmployeeRemove> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<EmployeeRemove> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<EmployeeRemove> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }
}
