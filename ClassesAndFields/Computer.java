
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}
	}

	void print() {
		System.out.println("Year of production: " + this.year + ", Price: " + this.price + ", Is notebook: "
				+ this.isNotebook + ", HardDisk memory: " + this.hardDiskMemory + ", Free momery: " + this.freeMemory
				+ ", Operation system: " + this.operationSystem + ".");
	}
}
