package com.maike.beauty.consts;
/**
 * @projectname BeautyClothes
 * @author GEEKCJJ
 * @date 2019年8月13日 下午12:16:53
 * @description:
 *
 */
public interface ConstStringAndUrl {
	/**
	 * 根据地址请求经纬度
	 */
	public String Baidu_Map_Api="http://api.map.baidu.com/geocoding/v3/?output=json&ak=8AxZDuCHACGEIzHKhZYuVqGTs5t7QMNL&callback=showLocation";
	/**
	 * 根据经纬度请求地址
	 */
	public String Baidu_map_Api_Geocode="http://api.map.baidu.com/reverse_geocoding/v3/?ak=8AxZDuCHACGEIzHKhZYuVqGTs5t7QMNL&output=json&coordtype=wgs84ll";
}
