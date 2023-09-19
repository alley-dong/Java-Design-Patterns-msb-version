package com.dongchanglong.demo02;

public class Client {

    public static void main(String[] args) {

        // 创建根节点
        Directory root = new Directory("root");

        // 创建树枝节点
        Directory binDir = new Directory("bin");
        // 向bin目录添加叶子节点
        binDir.add(new File("vi",10000));
        binDir.add(new File("test",20000));

        Directory tpmDir = new Directory("tpm");

        Directory userDir = new Directory("user");
        Directory mysqlDir = new Directory("mysql");

        mysqlDir.add(new File("my.cnf",30));
        mysqlDir.add(new File("test.db",25000));
        userDir.add(mysqlDir);

        // 将所有子节点加入到跟节点
        root.add(binDir);
        root.add(tpmDir);
        root.add(userDir);

        root.printList("");
    }
}
