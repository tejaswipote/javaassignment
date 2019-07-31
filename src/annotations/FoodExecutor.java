package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class FoodExecutor {

	public static void main(String[] args) {
		List<FoodInterface> foods = new ArrayList();

		Pizza p = new Pizza();
		Burger b = new Burger();
		foods.add(p);
		foods.add(b);
		performAction(foods);
	}


	
	//method for displaying annotations
	public static void performAction(List<FoodInterface> food) {
		for (FoodInterface p : food) {
			//get the class type
			Class c = p.getClass();
			
			//Create the annotations object
			Annotation annotation = c.getAnnotation(Food.class);
			Food foods = (Food) annotation;
			System.out.println("Food Name : " + foods.name());
			System.out.println("Price : " + foods.price());

			Method m = null;
			try {
				m = c.getMethod("getPrepareTime");
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			annotation = m.getAnnotation(Time.class);
			Time t1 = (Time) annotation;

			System.out.println("Prepare time:" + t1.prepareTime());

			System.out.println("Cook time:" + t1.cookTime());
			System.out.println("Send time:" + t1.sendTime());
			// TODO Auto-generated method stub

		}

	}
}