package tools.controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;

public class ListController
{
	private List<Kahoot> myKahoots;
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot transformersMovie = new Kahoot("AJ", 5) ;
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(transformersMovie);
	}
}