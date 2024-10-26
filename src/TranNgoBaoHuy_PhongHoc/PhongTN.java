package TranNgoBaoHuy_PhongHoc;

public class PhongTN extends PhongHoc {
	private String chuyenNghanh;
	private int sucChua;
	private boolean coBonRua;
	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNghanh, int sucChua,
			boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNghanh = chuyenNghanh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	
	}
	public PhongTN() {
		super();
		this.chuyenNghanh="";
		this.sucChua=0;
		this.coBonRua=false;
	}
	public String getChuyenNghanh() {
		return chuyenNghanh;
	}
	public void setChuyenNghanh(String chuyenNghanh) {
		this.chuyenNghanh = chuyenNghanh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int suacChua) {
		this.sucChua = suacChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	@Override
	public boolean getDatChuan() {
		// TODO Auto-generated method stub
		return (duSang()&&coBonRua);
	
	
	
}
	@Override
	public String toString() {
		String bonRua=coBonRua? "co bon rua":"ko co bon rua";
		return super.toString()+String.format("Chuyen nghanh: %s, suc chua: %s",getChuyenNghanh(),getSucChua());
	}
}
