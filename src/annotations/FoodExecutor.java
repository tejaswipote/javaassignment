package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class FoodExecutor {

	public static void main(String[] args) {
		List<FoodClass> foods = new ArrayList();

		Pizza p = new Pizza();
		Burger b = new Burger();
		foods.add(p);
		foods.add(b);
		performAction(foods);
	}

//		p.setName("corn pizza");
//		p.setPrice(120);
//		p.setPrepareTime(201);
//		p.setCookTime(310);
//		p.setSendTime(140);
//		System.out.println(p.toString());

	public static void performAction(List<FoodClass> food) {
		for (FoodClass p : food) {
			Class c = p.getClass();
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