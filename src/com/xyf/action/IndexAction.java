package com.xyf.action;

import com.opensymphony.xwork2.ActionContext;
import com.xyf.entity.RunoobTbl;
import com.xyf.service.IndexService;

import java.util.List;

public class IndexAction {

    //声明service，但不给它创建具体的实现类的实例，
    private IndexService is = null;

    //添加set()方法
    public void setIs(IndexService is) {
        this.is = is;
    }

    public String execute() {
        List<RunoobTbl> runoobTblList = is.getAllRunoob();
        System.out.println("结果集："+runoobTblList.size());
        ActionContext ac = ActionContext.getContext();
        ac.put("runoobTblList", runoobTblList);
        return "success";
    }

}
