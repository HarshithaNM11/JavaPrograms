package com.xworkz.boot;

import com.xworkz.app.MobileShowRoom;
import com.xworkz.app.ShowRoom;
import com.xworkz.app.WatchShowRoom;

public class ShowRoomUtil extends ShowRoom{
	
	public void run(ShowRoom room)
	{
		ShowRoom showRoom=new ShowRoom();
		showRoom.printLocation();
		
		if(room instanceof WatchShowRoom)
		{
			ShowRoom watchRoom=new WatchShowRoom();
			watchRoom.printLocation();
			
			WatchShowRoom watchRoom2=(WatchShowRoom)watchRoom;
			watchRoom2.getNameOfShowroom();
			
		}
		
		if(room instanceof MobileShowRoom)
		{
			ShowRoom mobileRoom = new MobileShowRoom();
			mobileRoom.printLocation();
			
			MobileShowRoom mobileRoom2=(MobileShowRoom)mobileRoom;
			mobileRoom2.getGstNo();
		}
	}
}