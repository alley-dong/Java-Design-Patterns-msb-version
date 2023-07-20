package com.dongchanglong.factory.abstractFactory.factory;

import com.dongchanglong.factory.abstractFactory.product.AbstractFreezer;
import com.dongchanglong.factory.abstractFactory.product.AbstractTV;
import lombok.Data;

/**
 * 客户端
 */
@Data
public class Client {

    private AbstractTV abstractTV;
    private AbstractFreezer abstractFreezer;

    public Client(AppliancesFactory appliancesFactory){
        this.abstractTV = appliancesFactory.createTV();
        this.abstractFreezer = appliancesFactory.createFreezer();
    }

    public static void main(String[] args) {
        Client client = new Client(new HairFactory());
        AbstractFreezer abstractFreezer = client.getAbstractFreezer();
        System.out.println(abstractFreezer);
    }


}
