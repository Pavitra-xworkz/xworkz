package com.xworkz.dto2;

import com.xworkz.dto2.CarShowRoom;

public class ShowRoomTester {
	public static void main(String[] args) {
		CarShowRoom carShowRoom = new CarShowRoom();
		carShowRoom.addManager("manvi", 9080706050l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.updateManager(8070605040l);

	}

}
