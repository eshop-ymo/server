package com.lawu.eshop.order.srv.jobs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lawu.eshop.order.srv.domain.ShoppingOrderDO;
import com.lawu.eshop.order.srv.service.ShoppingOrderService;
import com.lawu.jobsextend.AbstractTxPageJob;

/**
 * 提醒买家支付未付款的抢购订单<p>
 * 定时任务
 * 
 * @author jiangxinjun
 * @createDate 2017年12月04日
 * @updateDate 2017年12月04日
 */
public class RemindAboutCancelSeckillActivityOrderJob extends AbstractTxPageJob<ShoppingOrderDO> {

    @Autowired
    private ShoppingOrderService shoppingOrderService;
    
    @Override
    public List<ShoppingOrderDO> queryPage(int offset, int pageSize) {
        return shoppingOrderService.selectRemindAboutCancelSeckillActivityOrder(offset, pageSize);
    }

    @Override
    public void executeSingle(ShoppingOrderDO entity) {
        shoppingOrderService.executeAutoRemindToBeCancelledOrder(entity);
    }

    @Override
    public boolean isStatusData() {
        return true;
    }

    @Override
    public boolean continueWhenSinglePageFail() {
        return true;
    }
}
