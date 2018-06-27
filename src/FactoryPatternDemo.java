//ʹ�øù�����ͨ������������Ϣ����ȡʵ����Ķ���
public class FactoryPatternDemo {
	
	public static void main(String[] args){
		ShapeFactory shapeFactory=new ShapeFactory();
		
		//��ȡCircle�Ķ��󣬲���������draw����
		Shape shape1=shapeFactory.getShape("CIRCLE");
		//����Circle��draw����
		shape1.draw();
		
		//��ȡRectangle�Ķ��󣬲���������draw����
		Shape shape2=shapeFactory.getShape("Rectangle");
		//����Rectangle��draw����
		shape2.draw();
		
		//��ȡSquare�Ķ��󣬲���������draw����
		Shape shape3=shapeFactory.getShape("Square");
		//����Square��draw����
		shape3.draw();
		//test������������������������������������������������������������������������
		shape3.draw();
	}

}
