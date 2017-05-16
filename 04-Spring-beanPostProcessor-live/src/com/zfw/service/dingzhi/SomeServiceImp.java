package com.zfw.service.dingzhi;

public class SomeServiceImp implements ISomeService {
	public SomeServiceImp(){
		System.out.println("对象创建了");
	}
	@Override
	public String dosome() {
		return "china";
	}

	@Override
	public String doother() {
		// TODO Auto-generated method stub
		return "aabbcc";
	}
	public void initPost(){
		System.out.println("Bean刚被初始化");
	}
	public void destroy(){
		System.out.println("Bean马上被销毁了");
	}
}
