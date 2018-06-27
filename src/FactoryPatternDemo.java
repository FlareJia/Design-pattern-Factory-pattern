//使用该工厂，通过传递类型信息来获取实体类的对象
public class FactoryPatternDemo {
	
	public static void main(String[] args){
		ShapeFactory shapeFactory=new ShapeFactory();
		
		//获取Circle的对象，并调用他的draw方法
		Shape shape1=shapeFactory.getShape("CIRCLE");
		//调用Circle的draw方法
		shape1.draw();
		
		//获取Rectangle的对象，并调用他的draw方法
		Shape shape2=shapeFactory.getShape("Rectangle");
		//调用Rectangle的draw方法
		shape2.draw();
		
		//获取Square的对象，并调用他的draw方法
		Shape shape3=shapeFactory.getShape("Square");
		//调用Square的draw方法
		shape3.draw();
		//test。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
		shape3.draw();
	}

}
