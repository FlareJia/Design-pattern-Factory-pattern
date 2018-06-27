//创建一个工厂，生成基于给定信息的实体类的对象
public class ShapeFactory {
//使用getShape方法获取形状类型的对象
	public Shape getShape(String shapeType){
		if(shapeType==null){
			return null;
		}
		//public boolean equalsIgnoreCase(String anotherString)将此 String 与另一个 String 进行比较，不考虑大小写。如果两个字符串的长度相等，并且两个字符串中的相应字符都相等（忽略大小写），则认为这两个字符串是相等的。
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
		
	}
}
