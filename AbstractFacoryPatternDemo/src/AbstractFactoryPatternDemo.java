
public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		
		//��ȡ��״����
		AbstractFactory shapeFactory =FactoryProducer.getFactory("SHAPE");
		
		//��ȡ��״ΪCircle�Ķ���
		Shape shape1=shapeFactory.getShape("CIRCLE");
		
		//����Circle��draw����
		shape1.draw();
		
		//��ȡ��״ΪRectangle�Ķ���
		Shape shape2=shapeFactory.getShape("Rectangle");
		
		//����Rectangle��draw����
		shape2.draw();
		
		//��ȡ��״ΪSqure�Ķ���
		Shape shape3=shapeFactory.getShape("SQUARE");
		
		//����Square��draw����
		shape3.draw();
		//------------------------------------------------------------------------------------
		//��ȡ��ɫ����
		AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
		
		//��ȡ��ɫΪRed�Ķ���
		Color color1=colorFactory.getColor("Red");
		
		//����Red��fill����
		color1.fill();
		
		//��ȡ��ɫΪGreen�Ķ���
		Color color2=colorFactory.getColor("GREEN");
		
		//����Green��fill����
		color2.fill();
		
		//��ȡ��ɫΪBlue�Ķ���
		Color color3=colorFactory.getColor("Blue");
		
		//����Blue��fill����
		color3.fill();
	}
}