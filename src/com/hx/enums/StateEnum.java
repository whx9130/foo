package com.hx.enums;

/**
 	* ����ö����һ�������class,���class�൱��final static���Σ����ܱ��̳�
 	* ���Ĺ��췽��ǿ�Ʊ�˽�л���������һ��Ĭ�ϵĹ��췽��private StateEnum();
 	*���е�ö�ٶ��̳���java.lang.Enum�ࡣ����Java ��֧�ֶ�̳У�����ö�ٶ������ټ̳�������
 	*ö�������ǵ���ģʽ�ġ�����Ҫʵ����һ�Σ�Ȼ������������֮�оͿ��Ե������ķ����ͳ�Ա�����ˡ�ֵ�ǹ̶��ģ�����Ҫ�����ı䡣
 	*
   	*ö������ʽ�̳���Enum
   	*Enum������java����ö�����͵Ĺ������࣬����һ��valueOf����
   	*
   	*�����Լ���������Ա��Զ�ת��Ϊ��̬�����࣬ͨ����̬����飨������ȼ�������˾�̬final�Ķ��θ�ֵ����Ϊ�����������±꣬
   	*��swith�д���ö�ٲ�����ʵ�����жϵľ�����Щ�±꣡��0��1��2��...��ͬʱö���ཫ�û�������������Է�װΪ��һ���������͵����飬
   	*����values�������Ի�ȡ������飬������JDK��API���û����������ģ��������ֻ�п��˵ײ�Դ��Ż��˽⣬
   	*ͬʱ����������صĲ��Ǳ����ԭ�����飬���Ǹ��ư汾��������ֵ�����Ǵ�ַ�����Ͼ���̬����������ȥ��Ҳ�Ĳ��˰�������������
   	*
*/
public enum StateEnum {
	/*ÿ��ö�ٱ�������ö����StateEnum��ʵ�����൱��END=new StateEnum��1�������������ÿ����Ա��������final static����*/
	UNPAID(1, "δ֧��"),PAID(2, "��֧��"),HANGUP(3, "����"),USED(4, "��ʹ��"),END(5, "���");
	
	private int code;
	private String name;
	
	//���췽�� ,��ֵ����Ա����
	private StateEnum(int code,String name) {
		this.code =code;
		this.name =name;
	}
	
	@Override
	public String toString() {
		return this.code+"_"+this.name;
	}
	
	//�������͵����ƣ��������͵�ö��ʵ���� 
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
