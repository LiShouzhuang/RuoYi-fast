package com.ruoyi.project.customer.contacts.mapper;

import java.util.List;
import com.ruoyi.project.customer.contacts.domain.ComContacts;

/**
 * 联系人Mapper接口
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
public interface ComContactsMapper 
{
    /**
     * 查询联系人
     * 
     * @param contactsId 联系人主键
     * @return 联系人
     */
    public ComContacts selectComContactsByContactsId(Long contactsId);

    /**
     * 查询联系人列表
     * 
     * @param comContacts 联系人
     * @return 联系人集合
     */
    public List<ComContacts> selectComContactsList(ComContacts comContacts);

//    /**
//     * 新增联系人
//     *
//     * @param comContacts 联系人
//     * @return 结果
//     */
//    public int insertComContacts(ComContacts comContacts);
//
//    /**
//     * 修改联系人
//     *
//     * @param comContacts 联系人
//     * @return 结果
//     */
//    public int updateComContacts(ComContacts comContacts);
//
//    /**
//     * 删除联系人
//     *
//     * @param contactsId 联系人主键
//     * @return 结果
//     */
//    public int deleteComContactsByContactsId(Long contactsId);
//
//    /**
//     * 批量删除联系人
//     *
//     * @param contactsIds 需要删除的数据主键集合
//     * @return 结果
//     */
//    public int deleteComContactsByContactsIds(String[] contactsIds);
}