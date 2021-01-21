package com.saint.test.constant;

public enum FrmGnid {
    TITLE(""),
    JxSignError("学生签到失败日志"),selectListJxSignError("学生签到失败日志列表查询"),selectObjectJxSignError("学生签到失败日志查询"),selectListPageJxSignError("学生签到失败日志分页查询"),updateJxSignError("更新学生签到失败日志"),insertJxSignError("新增学生签到失败日志"),deleteJxSignError("删除学生签到失败日志");

    private String what;

    private FrmGnid(String what) {
        this.what = what;
    }

    public String getWhat() {
        return this.what;
    }

    public String toString() {
        return this.what;
    }
}