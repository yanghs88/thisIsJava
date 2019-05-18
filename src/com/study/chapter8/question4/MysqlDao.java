package com.study.chapter8.question4;

public class MysqlDao implements DataAccessObject {

    private final String objName = "Mysql";

    @Override
    public String select() {
        return this.objName + "DB에서 검색";
    }

    @Override
    public String insert() {
        return this.objName + "DB에서 삽입";
    }

    @Override
    public String update() {
        return this.objName + "DB에서 수정";
    }

    @Override
    public String delete() {
        return this.objName + "DB에서 삭제";
    }
}
