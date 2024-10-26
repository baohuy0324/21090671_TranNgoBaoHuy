package TranNgoBaoHuy_PhongHoc;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
	private List<PhongHoc> ds;
	
public ListPhongHoc() {
	ds=new ArrayList<PhongHoc>();
}
public boolean themPhongHoc(PhongHoc p) {
	if(ds.contains(p))
			return false;
	ds.add(p);
	return true;
}

public PhongHoc timPhongHoc(String maPhong) {
	for(PhongHoc p :ds) {
		if(p.getMaPhong().equalsIgnoreCase(maPhong));
	}
	return null;
}

public List<PhongHoc> danhSachDC(){
	List<PhongHoc>dsDC=new ArrayList<PhongHoc>();
	for(PhongHoc p: ds) {
		if(p.getDatChuan())
			dsDC.add(p);
	}
	return dsDC;
}




public void sapXepTheoDayNha() {
	ds.sort((p1,p2)->p1.getDayNha().compareToIgnoreCase(p2.getDayNha()));
}
public void sapXepTheoDienTich() {
	ds.sort((p1,p2)->Double.compare(p2.getDienTich(), p1.getDienTich()));
}
public void sapXepTheoSoBongDen() {
	ds.sort((p1,p2)->Integer.compare(p1.getSoBongDen(), p2.getSoBongDen()));
}
public int tongSoPhong() {
	return ds.size();
	
}
public List<PhongMT> dsPhongMTCO60May(){
	List<PhongMT>dsP60=new ArrayList<PhongMT>();
	for(PhongHoc p : ds) {
		if(p instanceof PhongMT && ((PhongMT) p).getSoMayTinh()>=60)
			dsP60.add((PhongMT) p);
	}
	return dsP60;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	StringBuilder sb=new StringBuilder();
	for(PhongHoc p:ds) {
		sb.append(p.toString()).append("\n");
	}
	return sb.toString();
}