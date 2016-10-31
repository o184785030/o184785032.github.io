package entity;

import java.util.List;

public class Goods {
	private int id;//商品Id
    private String name;//商品名称
    private String imageUrl;//首页图片链接
    private String descInf;//商品详细描述信息
    private double price;//商品价格
    private int kind1Id;//商品种类1
    private int storeId;//店铺ID
    private String storeName;//店铺名称
    private int kind2Id;//商品种类2
    private int kind3Id;//商品种类3
    private float score;//评分
    private String desc;//简述（最长30个字）
    private float sales;//销量
    private String place;//产地
    // 1 valid 0 invalid
    private int state;//当前状态
    private String Updates;//上市日期
    private String Downdate;//下架日期
    private List<String> images;//商品图片链接
    private int qaId;//质检员id
    private int shipping;//商品图片
    private String singleImage;//是否包邮
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDescInf() {
		return descInf;
	}
	public void setDescInf(String descInf) {
		this.descInf = descInf;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getKind1Id() {
		return kind1Id;
	}
	public void setKind1Id(int kind1Id) {
		this.kind1Id = kind1Id;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public int getKind2Id() {
		return kind2Id;
	}
	public void setKind2Id(int kind2Id) {
		this.kind2Id = kind2Id;
	}
	public int getKind3Id() {
		return kind3Id;
	}
	public void setKind3Id(int kind3Id) {
		this.kind3Id = kind3Id;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getSales() {
		return sales;
	}
	public void setSales(float sales) {
		this.sales = sales;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getUpdates() {
		return Updates;
	}
	public void setUpdates(String updates) {
		Updates = updates;
	}
	public String getDowndate() {
		return Downdate;
	}
	public void setDowndate(String downdate) {
		Downdate = downdate;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public int getQaId() {
		return qaId;
	}
	public void setQaId(int qaId) {
		this.qaId = qaId;
	}
	public int getShipping() {
		return shipping;
	}
	public void setShipping(int shipping) {
		this.shipping = shipping;
	}
	public String getSingleImage() {
		return singleImage;
	}
	public void setSingleImage(String singleImage) {
		this.singleImage = singleImage;
	}
	
    
}
