package com.ruoyi.project.customer.contacts.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.contacts.mapper.ComContactsMapper;
import com.ruoyi.project.customer.contacts.domain.ComContacts;
import com.ruoyi.project.customer.contacts.service.IComContactsService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 联系人Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
@Service
public class ComContactsServiceImpl implements IComContactsService 
{
    @Autowired
    private ComContactsMapper comContactsMapper;

    /**
     * 查询联系人
     * 
     * @param contactsId 联系人主键
     * @return 联系人
     */
    @Override
    public ComContacts selectComContactsByContactsId(Long contactsId)
    {
        return comContactsMapper.selectComContactsByContactsId(contactsId);
    }

    /**
     * 查询联系人列表
     * 
     * @param comContacts 联系人
     * @return 联系人
     */
    @Override
    public List<ComContacts> selectComContactsList(ComContacts comContacts)
    {
        return comContactsMapper.selectComContactsList(comContacts);
    }

//    /**
//     * 新增联系人
//     *
//     * @param comContacts 联系人
//     * @return 结果
//     */
//    @Override
//    public int insertComContacts(ComContacts comContacts)
//    {
//        comContacts.setCreateTime(DateUtils.getNowDate());
//        return comContactsMapper.insertComContacts(comContacts);
//    }
//
//    /**
//     * 修改联系人
//     *
//     * @param comContacts 联系人
//     * @return 结果
//     */
//    @Override
//    public int updateComContacts(ComContacts comContacts)
//    {
//        comContacts.setUpdateTime(DateUtils.getNowDate());
//        return comContactsMapper.updateComContacts(comContacts);
//    }
//
//    /**
//     * 批量删除联系人
//     *
//     * @param contactsIds 需要删除的联系人主键
//     * @return 结果
//     */
//    @Override
//    public int deleteComContactsByContactsIds(String contactsIds)
//    {
//        return comContactsMapper.deleteComContactsByContactsIds(Convert.toStrArray(contactsIds));
//    }
//
//    /**
//     * 删除联系人信息
//     *
//     * @param contactsId 联系人主键
//     * @return 结果
//     */
//    @Override
//    public int deleteComContactsByContactsId(Long contactsId)
//    {
//        return comContactsMapper.deleteComContactsByContactsId(contactsId);
//    }
}
