package restaurant;

public class RestVO {
	private String name, street, flavor, price, etc, ip, regDate, addr;
	private boolean chk = false;
	private int fla;
	
	@Override
	public String toString() {
		return "RestVO [name=" + name + ", street=" + street + ", flavor=" + flavor + ", price=" + price + ", etc="
				+ etc + "]";
	}

	public int getFla() {
		return fla;
	}

	public void setFla(int fla) {
		this.fla = fla;
	}

	public boolean isChk() {
		return chk;
	}


	public void setChk(boolean chk) {
		this.chk = chk;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
}
