
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null) {
			if (simMobileNumber.length() == 10 && simMobileNumber.substring(0, 2).equals("08")) {
				this.simMobileNumber = simMobileNumber;
				hasSimCard = true;
			}
		}
	}

	void removeSimCard() {
		if (hasSimCard) {
			hasSimCard = false;
			simMobileNumber = "";
		}
	}

	void call(GSM receiver, int duration) {
		if (receiver != null) {
			if (duration > 0 && !(simMobileNumber.equals(receiver.simMobileNumber)) && hasSimCard == true
					&& receiver.hasSimCard == true) {
				if (this != receiver) {
					Call c = new Call();
					c.receiver = receiver;
					c.caller = this;
					c.duration = duration;
					receiver.lastIncomingCall = c;
					lastOutgoingCall = c;
					outgoingCallsDuration += duration;
				}

			}
		}
	}

	double getSumForCall() {
		if (this.lastOutgoingCall == null) {
			return 0.0;
		}
		return outgoingCallsDuration * this.lastOutgoingCall.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.println("Length of last call: " + lastOutgoingCall.duration + " min" + "\nreceiver: "
					+ lastOutgoingCall.receiver.simMobileNumber);
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("Length of last call: " + lastIncomingCall.duration + " min" + "\ncaller: "
					+ lastIncomingCall.caller.simMobileNumber);
		}
	}
}
