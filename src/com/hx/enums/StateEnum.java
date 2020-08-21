package com.hx.enums;

/**
 	* 首先枚举是一个特殊的class,这个class相当于final static修饰，不能被继承
 	* 他的构造方法强制被私有化，下面有一个默认的构造方法private StateEnum();
 	*所有的枚举都继承自java.lang.Enum类。由于Java 不支持多继承，所以枚举对象不能再继承其他类
 	*枚举类型是单例模式的。你需要实例化一次，然后再整个程序之中就可以调用他的方法和成员变量了。值是固定的，不需要发生改变。
 	*
   	*枚举类隐式继承了Enum
   	*Enum是所有java语言枚举类型的公共基类，包含一个valueOf方法
   	*
   	*我们自己定义的属性被自动转换为静态常量类，通过静态代码块（最高优先级）完成了静态final的二次赋值，并为他们设置了下标，
   	*在swith中传入枚举参数，实际上判断的就是这些下标！（0，1，2，...）同时枚举类将用户定义的所有属性封装为了一个本类类型的数组，
   	*调用values方法可以获取这个数组，但是在JDK的API里，是没有这个方法的，这个方法只有看了底层源码才会了解，
   	*同时这个方法返回的不是本类的原生数组，而是复制版本。（即传值而不是传址），毕竟静态常量，传过去你也改不了啊。。。。。。
   	*
*/
public enum StateEnum {
	/*每个枚举变量都是枚举类StateEnum的实例，相当于END=new StateEnum（1），按序号来。每个成员变量都是final static修饰*/
	UNPAID(1, "未支付"),PAID(2, "已支付"),HANGUP(3, "挂起"),USED(4, "已使用"),END(5, "完结");
	
	private int code;
	private String name;
	
	//构造方法 ,赋值给成员变量
	private StateEnum(int code,String name) {
		this.code =code;
		this.name =name;
	}
	
	@Override
	public String toString() {
		return this.code+"_"+this.name;
	}
	
	//根据类型的名称，返回类型的枚举实例。 
    public static StateEnum fromTypeName(String name) {  
        for (StateEnum state : StateEnum.values()) {  
            if (state.getName().equals(name)) {  
                return state;  
            }  
        }  
        return null;  
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  
    
    
}
