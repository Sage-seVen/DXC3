package com.myspring.bean;

public class Customer {

Address address;

public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
public int getPhone() {
return phone;
}
public void setPhone(int phone) {
this.phone = phone;
}

String name;
String password;
String email;
int phone;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
}