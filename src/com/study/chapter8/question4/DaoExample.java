package com.study.chapter8.question4;

public class DaoExample {
    public static void main(String[] args) {
        OracleDao oracleDao = new OracleDao();
        MysqlDao mysqlDao = new MysqlDao();

        dbWork(oracleDao);
        dbWork(mysqlDao);
    }

    private static void dbWork(DataAccessObject dao)
    {
        System.out.println(dao.select());
        System.out.println(dao.insert());
        System.out.println(dao.update());
        System.out.println(dao.delete());
    }
}
