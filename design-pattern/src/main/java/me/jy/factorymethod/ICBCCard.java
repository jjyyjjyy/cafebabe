package me.jy.factorymethod;

/**
 * @author jy
 * @date 2018/01/09
 */
public class ICBCCard extends ICard {
    @Override
    protected String getType() {
        return "ICBC";
    }
}
