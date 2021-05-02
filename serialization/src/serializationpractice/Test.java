package serializationpractice;

import java.io.Serializable;

public class Test  implements Serializable
{
  private Integer id;
  private String name;
  private Integer age;
  private String vill;
  private Double sal;
  
  
public String getVill() {
	return vill;
}


public void setVill(String vill) {
	this.vill = vill;
}


public Double getSal() {
	return sal;
}


public void setSal(Double sal) {
	this.sal = sal;
}


public Test(Integer id, String name, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}


@Override
public String toString() {
	return "Test [id=" + id + ", name=" + name + ", age=" + age + "]";
}


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
  
}
