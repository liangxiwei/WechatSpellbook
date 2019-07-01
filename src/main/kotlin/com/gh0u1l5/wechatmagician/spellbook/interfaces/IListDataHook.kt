package com.gh0u1l5.wechatmagician.spellbook.interfaces

/**
 * @author liangxiwei
 * @version 1.0
 * @since 2019-07-01
 */
interface IListDataHook {
    /**
     * 联系人列表有变化就会回调
     */
    fun onContactListChange(list: ArrayList<Any>)

    /**
     * 对话列表有变化就会回调
     */
    fun onConversationListChange(list: ArrayList<Any>)
}