package TranNgoBaoHuy_PhongHoc;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong;
	protected String dayNha;
	protected double dienTich;
	protected int soBongDen;
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		setDayNha(dayNha);
		setDienTich(dienTich);
		setMaPhong(maPhong);
		setSoBongDen(soBongDen);
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		if(maPhong==null)
			throw new IllegalArgumentException("ma phong ko dc de trong");
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		if(dayNha==null)
			throw new IllegalArgumentException("day nha ko dc de trong");
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		if(dienTich <=0)
			throw new IllegalArgumentException("dien tich phai lon hon 0");
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		if(soBongDen<=0)
			throw new IllegalArgumentException("so bong den phai lon hon 0");
		this.soBongDen = soBongDen;
	}
	
	public boolean duSang() {
		return (getDienTich()/getSoBongDen()<=10);
	}
	public abstract boolean getDatChuan();
	
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	@Override
	public String toString() {
		return "PhongHoc [maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen="
				+ soBongDen + "]";
	}
	

	
}
