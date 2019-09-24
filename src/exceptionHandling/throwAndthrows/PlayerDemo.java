package exceptionHandling.throwAndthrows;

import java.util.ArrayList;

public class PlayerDemo {

	public static void main(String[] args) throws NoMatchesPlayedFoundException {
		// TODO Auto-generated method stub
		ArrayList<Player> playerList = new ArrayList<>();
		playerList.add(new Player("chandra", 20, 500, "India"));
		playerList.add(new Player("chandra", 102, 500, "India"));
		System.out.println(searchPlayerByMatchesPlayed(playerList, 10));

	}

	public static ArrayList<Player> searchPlayerByMatchesPlayed(ArrayList<Player> playerList,int matchesPlayed) throws NoMatchesPlayedFoundException
	
	{  int t = 0;
		ArrayList<Player> pList =new ArrayList<>();
		for (Player player : playerList)
		{
			if(player.getMatchesPlayed()==matchesPlayed)
			{
				pList.add(player);
				t = 1;
			}
			
		}
		if(t==0)
		{   pList.add(null);
			throw new NoMatchesPlayedFoundException();/* this is custom exception in java were we can write our own message class*/
		}
		return pList;
	}
}
