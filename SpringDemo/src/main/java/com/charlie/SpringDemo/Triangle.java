package com.charlie.SpringDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Triangle implements Shape,InitializingBean,DisposableBean {

	private String name;
	private String timestamp;
	private List<Point> points;
	
	public Triangle(String authorName){
		this.name=authorName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw() {
		System.out.println("a triangle was printed by "+ name + " at "+timestamp);
		for(Point p: points){
			System.out.println("point ("+p.getX()+","+p.getY()+")");
		}
	}
	
	public void init(){
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date = new Date();
		 timestamp = dateFormat.format(date);
		 System.out.println("the bean has been initialized!");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean...");
	}
	public void destroy() throws Exception {
		System.out.println("the bean has been destroied!");
	}
}
