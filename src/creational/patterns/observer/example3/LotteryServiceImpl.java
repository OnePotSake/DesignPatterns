package creational.patterns.observer.example3;

import creational.patterns.observer.example2.DrawHouseService;
import creational.patterns.observer.example2.LotteryResult;

import java.util.Date;

/**
 * @author spikeCong
 * @date 2022/10/12
 **/
public class LotteryServiceImpl extends LotteryService {

    //注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //1.摇号
        String result = houseService.lots(uId);
        return new LotteryResult(uId,result,new Date());
    }
}
