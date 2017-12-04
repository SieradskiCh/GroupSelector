import java.util.Comparator;
	public class NameSorter implements Comparator<BuildRoster>
		{
		public int compare(BuildRoster s1, BuildRoster s2)
			{
			return s1.getLastName().compareTo(s2.getLastName());
			}
		}

