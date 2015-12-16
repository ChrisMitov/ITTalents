
public class GSMMain {

	public static void main(String[] args) {
		GSM a = new GSM();
		a.model = "Samsung";
		a.insertSimCard("0894221346");
		// a.removeSimCard();
		// System.out.println(a.hasSimCard + " " + a.simMobileNumber);
		GSM b = new GSM();
		b.insertSimCard("0887201905");
		b.model = "Alcatel";
		// System.out.println(b.hasSimCard + " " + b.simMobileNumber);
		GSM c = new GSM();
		c.insertSimCard("0876590120");
		// System.out.println(c.hasSimCard + " " + c.simMobileNumber);
		a.call(b, 15);
		a.call(c, 10);
		b.call(c, 5);
		c.printInfoForTheLastIncomingCall();
		b.printInfoForTheLastIncomingCall();
		a.printInfoForTheLastOutgoingCall();
		a.printInfoForTheLastIncomingCall(); // no print because there is no
												// incoming call for a
		System.out.println("Sum for outgoing calls for phone:  " + a.model + " is " + a.getSumForCall());
		System.out.println("Sum for outgoing calls for phone:  " + b.model + " is " + b.getSumForCall());
	}

}
