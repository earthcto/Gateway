/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.api;

import com.creditcloud.coupon.model.CouponPackage;
import com.creditcloud.coupon.model.CouponPlacement;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 与奖券相关的只读查询接口
 *
 * @author sobranie
 */
@Remote
public interface CouponQueryService {

    /**
     * 分页列出所有的奖券包
     * 
     * @param pageInfo
     * @return 
     */
    PagedResult<CouponPackage> listCouponPackage(PageInfo pageInfo);
    
    /**
     * 分页列出某个人的所有设备
     * 
     * @param userId
     * @param pageInfo
     * @return 
     */
    PagedResult<CouponPlacement> listMyPlacement(String userId, PageInfo pageInfo);
    
}
