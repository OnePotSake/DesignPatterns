package creational.patterns.factorypattern.abstractfactorypattern.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryStaticMap {

    private static final Map<String, ProductFactory> productFactoryMap = new HashMap<>();

    static {
        productFactoryMap .put("1", new HuaWeiProductsFactory());
        productFactoryMap .put("2", new LianXiangProductsFactory());
    }

    public  static  ProductFactory getProductFactory(String type) {
          ProductFactory factory = null;

            if("1".equals(type)) {
                factory = new HuaWeiProductsFactory();
                //华为

            } else if("2".equals(type)) {
                // 联想
                factory = new LianXiangProductsFactory();
            }

        return factory;
    }

}
