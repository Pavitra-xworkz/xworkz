package com.xworkz.dto2;

import com.xworkz.dto2.CarShowRoom;

public class ShowRoomTester {
	public static void main(String[] args) {
		CarShowRoom carShowRoom = new CarShowRoom();
		carShowRoom.addManager("manvi", 9080706050l);

		carShowRoom.displayManager();

		carShowRoom.removeManager();
		carShowRoom.displayManager();

		Manager manager = new Manager("Mohan", 9743679058l);
		carShowRoom.updateManager(manager);

		carShowRoom.displayManager();
		carShowRoom.addManager(manager);
		carShowRoom.displayManager();

		Manager manager2 = new Manager("Pallavi", 9860574326l);
		carShowRoom.updateManager(manager2);
		carShowRoom.displayManager();

	}

}
