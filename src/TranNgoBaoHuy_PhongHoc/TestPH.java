package TranNgoBaoHuy_PhongHoc;

import java.util.List;

public class TestPH {

	public static void main(String[] args) {
		ListPhongHoc ph=new ListPhongHoc();
		ph.themPhongHoc(new PhongLT("A01","day a",100,30,true));
		ph.themPhongHoc(new PhongMT("B02","day b",200,40,60));
		ph.themPhongHoc(new PhongTN("C03","day c",100,300,"VatLi",40,true));
		
		
		System.out.println("Danh sach phong hoc: ");
		System.out.println(ph);
		String mp="A01";
		System.out.println("Phong hoc voi ma: "+mp);
		System.out.println(ph.timPhongHoc(mp));
		
		List<PhongHoc>pDC=ph.danhSachDC();
		System.out.println("Danh sach phong dat chuan: ");
		for(PhongHoc p: pDC) {
			System.out.println(p);
		}
		ph.sapXepTheoDayNha();
		System.out.println("danh sach ph theo day nha: ");
		System.out.println(ph);
		ph.sapXepTheoDienTich();
		System.out.println("danh sach ph theo dien tich: ");
		System.out.println(ph);
		ph.sapXepTheoSoBongDen();
		System.out.println("danh sach ph theo so bong den: ");
		System.out.println(ph);
		

		
	}

}
