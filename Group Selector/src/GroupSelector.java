import java.util.*;
import java.io.*;
public class GroupSelector
	{
	static ArrayList<BuildRoster> roster = new ArrayList<BuildRoster>();
	public static void main(String[] args) throws IOException
		{
		makeRoster();
		makeGroups();
		//sortGroupsAlphabetically();
		printGroups();
		}
	private static void makeRoster()throws IOException
		{
			Scanner file = new Scanner( new File( "roster.txt" ) );
			while (file.hasNextLine())
				{
				String line = file.nextLine();
				String[] array = line.split(" ");
				double num = Double.parseDouble(array[2]);
				roster.add(new BuildRoster (array[0], array[1], num));
				}
			Collections.sort(roster, new ScoreSorter());


		}
	
	private static void makeGroups()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello how many groups would you like?");
		int names = userInput.nextInt();
		
		for(int i = 1; i <= names; i++)
			{
			
			for(int j = 1; j <= names; j++)
			{
			System.out.println("Group " + j);
			System.out.println(roster.get(i).getFirstName() + " " + roster.get(i).getLastName());
			}
			}
		}

	private static void sortGroupsAlphabetically()
		{
			for(int i = 0; i < roster; i++)
				{
					roster.get(i).getLastName();
					
					
					Collections.sort(roster.get(i)
          }

	private static void printGroups()
		{
		// TODO Auto-generated method stub
		
		}

	}
