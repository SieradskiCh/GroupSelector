
public class GroupCon implements java.lang.Comparable<GroupCon>
	{
	private String firstNameGroup;
	private String lastNameGroup;
	
	public GroupCon (String fno, String lno)
		{
		firstNameGroup = fno;
		lastNameGroup = lno;
		}
	
	public String getFirstNameGroup()
		{
		return firstNameGroup;
		}

	public void setFirstNameGroup(String firstNameGroup)
		{
		this.firstNameGroup = firstNameGroup;
		}

	public String getLastNameGroup()
		{
		return lastNameGroup;
		}

	public void setLastNameGroup(String lastNameGroup)
		{
		this.lastNameGroup = lastNameGroup;
		}

	@Override
	public int compareTo(GroupCon o)
		{
		// TODO Auto-generated method stub
		return 0;
		}

	}