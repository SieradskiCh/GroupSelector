
public class Group implements java.lang.Comparable<Group>
	{
		private String firstNameG;
		private String lastNameG;
		public Group(String fn, String ln)
			{
			firstName = fn;
			lastName = ln;
			}
		public String getFirstNameG()
			{
			return firstNameG;
			}

		public void setFirstName(String firstName)
			{
			this.firstNameG = firstName;
			}

		public String getLastNameG()
			{
			return lastNameG;
			}

		public void setLastName(String lastName)
			{
			this.lastNameG = lastName;
			}
		@Override
		public int compareTo(Group arg0)
			{
				// TODO Auto-generated method stub
				return 0;
			}
	}
