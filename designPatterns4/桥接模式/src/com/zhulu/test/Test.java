package com.zhulu.test;
/*
 * 测试 桥接模式
 */
public class Test {

	public static void main(String[] args) {
        Computer computer = new Desktop(new Shenzhou());
        computer.sale();
        Computer computer2 = new Desktop(new Lenovo());
        computer2.sale();
	}

}
