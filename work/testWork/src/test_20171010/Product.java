package test_20171010;

public class Product 
{
	String company, productName, productId, price;

	public String getCompany() 
	{
		return company;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public String getProductId() 
	{
		return productId;
	}

	public void setProductId(String productId) 
	{
		this.productId = productId;
	}

	public String getPrice() 
	{
		return price;
	}

	public void setPrice(String price) 
	{
		this.price = price;
	}
	
	public void print()
	{
		String str = company + "\t" + productName + "\t" + productId + "\t" + price;
		System.out.println(str);
	}
}
