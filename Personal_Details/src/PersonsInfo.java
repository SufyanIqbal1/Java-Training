
public class PersonsInfo 
{

	public static void main(String[] args) 
	{
		PersonalInfo Sufyan = new PersonalInfo();
		
		Sufyan.Contact.Email = "sufyanibal@me.com";
		Sufyan.Contact.Telephone = "07865683667";
		Sufyan.Contact.ContAdr.Street = "St Mellons Road";
		Sufyan.Contact.ContAdr.Postcode = "CF14 0SH";
		Sufyan.Contact.ContAdr.City = "Cardiff";
		
		Sufyan.Ex.Phy = 100;
		Sufyan.Ex.Che = 120;
		Sufyan.Ex.Mat = 150;
		
		System.out.println(Sufyan.Contact.ContAdr.Adress());
		System.out.println(Sufyan.Ex);

	}

}
 