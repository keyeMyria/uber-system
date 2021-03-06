package com.roncoo.recharge.util.bean;

import lombok.Data;

/**
 * @author xierongli
 * @version $$Id: uber-system, v 0.1 2018/4/12 上午9:59 mark1xie Exp $$
 */
@Data
public class DepthFour {

    private Integer id;
    private Integer parentid;
    private String name;
    private String fullname;
    private String initial;
    private String logo;
    private Integer depth;

    private String yeartype;
    private String salestate;
    private String productionstate;
    private String sizetype;
    private String price;
}
