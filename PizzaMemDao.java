package Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class PizzaMemDao implements IPizzaDao{

	List<Pizza> listePizza = new ArrayList<Pizza>();
	
	public PizzaMemDao() {
		super();
		this.listePizza.add(new Pizza("MAR", "MARGARITA", 9.20f, Type.AUTRE));
		this.listePizza.add(new Pizza("FRO", "4FROMAGES", 9.20f, Type.FROMAGE));
		this.listePizza.add(new Pizza("VEG", "VEGETARIENNE", 9.20f, Type.AUTRE));
	}

	@Override
	public List<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		return listePizza ;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		this.listePizza.add(pizza);
		System.out.println("Ajout de la pizza : " + pizza.designation + "\n" + pizza.toString());
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		for(int i = 0; i < listePizza.size(); i++)
		{
			if(listePizza.get(i).code.equals(codePizza))
			{
				System.out.println("\n\nSuppression de la pizza : " + listePizza.get(i).designation + "\n" + listePizza.get(i).toString());
				listePizza.remove(i);
			}
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
				
		for(int i = 0; i<listePizza.size(); i++)
		{
			Pizza user1 = (Pizza) listePizza.get(i);
			if(listePizza.get(i).code.equals(codePizza))
				System.out.println("Le Code " + listePizza.get(i).code + " correspond à la pizza : " + listePizza.get(i).designation + "\n" + user1 + "\n\n");
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		Pizza pizza = this.findPizzaByCode(codePizza);
		if (pizza != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Liste des pizzas : " + listePizza + "";
	}



}
