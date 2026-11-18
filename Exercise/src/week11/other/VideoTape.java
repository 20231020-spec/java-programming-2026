package week11.other;

import week11.borrow.Borrow;


public class VideoTape implements Borrow {

	@Override
	public void checkOut() {
		System.out.println("비디오를 대여합니다.");
	}

	@Override
	public void checkIn() {
		System.out.println("비디오를 반납합니다.");
		
	}

}
