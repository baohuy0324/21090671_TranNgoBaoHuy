package TranNgoBaoHuy_PhongHoc;

public class PhongMT extends PhongHoc {
	private int soMayTinh;

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public PhongMT() {
		super();
		this.soMayTinh=0;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean getDatChuan() {
	return (duSang()&&getDienTich()/getSoMayTinh()<=1.5);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+String.format("So may tinh: %s", getSoMayTinh());
	}
} 
