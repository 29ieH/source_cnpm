package test;

import java.util.List;
import java.util.Scanner;

import dao.thuocDao;
import model.thuoc;

public class testLieuDung {
	public boolean test() {
		Scanner sc = new Scanner(System.in);
		List<thuoc> listAll = new thuocDao().listAll();
		int id = 0;
		int dose = 0;
		int frequency = 0;
		boolean check = true;
		System.out.println("Kiểm tra liêu dùng");
		System.out.println("List thuốc trong kho");
		for (thuoc thuoc : listAll) {
			System.out.println(thuoc);
		}
		System.out.println("Nhập vào id cua thuoc de chon thuoc ke don : ");
		id = sc.nextInt();
		thuoc findThuoc = new thuocDao().ThuocOfId(id);
		System.out.println("Nhập vào số lượng liều đơn : ");
		dose = sc.nextInt();
		System.out.println("Nhập vào số lần sử dụng một ngày :");
		frequency = sc.nextInt();
		if(dose<findThuoc.getDoseMin()) {
			return false;
		}else if(dose>findThuoc.getDoseMax()) {
			return false;
		}else if(frequency>findThuoc.getFrequency()) {
			return false;
		}else if((dose*frequency)<1||(dose*frequency)>(findThuoc.getDoseMax()*findThuoc.getFrequency())) {
			return false;
		}
		return true;
	}
}
