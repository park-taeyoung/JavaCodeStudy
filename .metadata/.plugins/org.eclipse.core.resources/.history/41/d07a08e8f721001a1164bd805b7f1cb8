package ominious;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class AutoTag_01_ElandMall_IMG_Crawling {
	public static void main(String[] args) {
		String url = "http://www.elandmall.com/dispctg/initBrandShop.action?listOnly=Y&kwd=&disp_ctg_no=1707322502&category_1depth=1707322502&category_2depth=&category_3depth=&category_4depth=&category_5depth=null&category_6depth=null&brand_nm=&brand_no=1690000381&vend_no=&vend_nm=&material_info=&size_info=&deliCostFreeYn=&setDicountYn=&giftYn=&oneMoreYn=&discountYn=&welfareYn=&staffDCYn=&min_price=&max_price=&min_rate=&max_rate=&color_info=&reSrch=&page_idx=1&pageSize=60&srchFd=null&sort=1&listType=image&applyStartDate=&applyEndDate=&dispStartDate=&dispEndDate=&newGoodsStartDate=&newGoodsEndDate=&mall_no=null&&_=1575504278282";
		
		Document document = Jsoup.parse(url);
		
		
		
		
		System.out.println(document.title());
		
		Elements paragraphs =document.getElementsByTag("title");
		
		for(Element paragraph : paragraphs) {
			System.out.println(paragraph.text());
		}
		
		Element sampleDiv = document.getElementById("SampleDiv");
		System.out.println("Data : " + sampleDiv.text());
	}
}
