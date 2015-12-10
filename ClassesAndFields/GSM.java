
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.length() == 10 && simMobileNumber.substring(0, 2).equals("08")) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		}
	}

	void removeSimCard() {
		if (hasSimCard) {
			hasSimCard = false;
		}
	}

	void call(GSM receiver, int duration) {
		if (duration > 0 && !(simMobileNumber.equals(receiver.simMobileNumber)) && hasSimCard == true
				&& receiver.hasSimCard == true) {
			Call c = new Call();
			c.receiver = receiver;
			c.caller = this;
			c.duration = duration;
			receiver.lastIncomingCall = c;
			lastOutgoingCall = c;
			outgoingCallsDuration += duration;
		}
	}

	double getSumForCall() {
		Call c = new Call();
		return outgoingCallsDuration * c.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.println("Дължина на последното обаждане: " + lastOutgoingCall.duration+ " мин" + "\nполучател: "
					+ lastOutgoingCall.receiver.simMobileNumber);
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("Дължина на последното обаждане: " + lastIncomingCall.duration+ " мин" + "\nповикващ: "
					+ lastIncomingCall.caller.simMobileNumber);
		}
	}

	public static void main(String[] args) {
		GSM a = new GSM();
		a.model = "Samsung";
		a.insertSimCard("0894221346");
		// a.removeSimCard();
		System.out.println(a.hasSimCard + " " + a.simMobileNumber);
		GSM b = new GSM();
		b.insertSimCard("0887201905");
		b.model = "Alcatel";
		System.out.println(b.hasSimCard + " " + b.simMobileNumber);
		GSM c = new GSM();
		c.insertSimCard("0876590120");
		System.out.println(c.hasSimCard + " " + c.simMobileNumber);
		a.call(b, 15);
		a.call(c, 10);
		b.call(c, 5);
		c.printInfoForTheLastIncomingCall();
		b.printInfoForTheLastIncomingCall();
		a.printInfoForTheLastOutgoingCall();
		a.printInfoForTheLastIncomingCall(); // не извежда нищо, защото няма
												// прието обаждане
		System.out.println("Сума изхарчена за обажданията на телефон " + a.model + " е " + a.getSumForCall());
		System.out.println("Сума изхарчена за обажданията на телефон " + b.model + " е " + b.getSumForCall());
	}
}