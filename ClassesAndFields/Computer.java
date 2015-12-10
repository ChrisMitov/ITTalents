
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
		System.out.println("Година на производство: " + year + "\nцена: " + price + "\nпреносим ли е: " + 
				isNotebook + "\nразмер на харддиска: " + hardDiskMemory + "\nсвободна памет: " + freeMemory
				+ "\nоперационна система: " + operationSystem);
	}

	public static void main(String[] args) {
		Computer dell = new Computer();
		dell.year = 1999;
		dell.price = 100;
		dell.isNotebook = false;
		dell.hardDiskMemory = 160;
		dell.freeMemory = 50;
		dell.operationSystem = "Windows XP";

		Computer hp = new Computer();
		hp.year = 2009;
		hp.price = 500.5;
		hp.isNotebook = true;
		hp.hardDiskMemory = 500;
		hp.freeMemory = 264;
		hp.operationSystem = "Ubuntu";

		hp.useMemory(100);
		dell.changeOperationSystem("Debian");
		
		System.out.println("DELL");
		dell.print();
		System.out.println("HP");
		hp.print();
	}
}
