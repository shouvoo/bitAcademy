package kr.co.mlec.lotto;

import java.util.List;

public class LottoDomain 
{
	int no;
	String name;
	String lottoNumbers;
	List<String> lottoList;
	
	
	public List<String> getLottoList() {
		return lottoList;
	}
	public void setLottoList(List<String> lottoList) {
		this.lottoList = lottoList;
	}
	public String getLottoNumbers() {
		return lottoNumbers;
	}
	public void setLottoNumbers(String lottoNumbers) {
		this.lottoNumbers = lottoNumbers;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
