package com.java.features.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User {
	String userName;
	Integer age;
	LocalDate dateOfBirth = LocalDate.now();

	public User(Integer age, String userName, LocalDate registeredOn) {
		this.userName = userName;
		this.age = age;
		this.dateOfBirth = registeredOn;
	}

	@Override
	public String toString() {
		return "[UserName=>" + userName + ",DateOfBirth=>" + dateOfBirth + "]";
	}
}

public class CollectionStream {
	public static LocalDate getDate(String dateOfBirth) {
		LocalDate dob = LocalDate.parse(dateOfBirth);
		return dob;
	}

	public List<User> getUser() {

		List<User> userName = new ArrayList<User>();

		User user1 = new User(23, "krishna", getDate("1997-06-05"));
		User user2 = new User(18, "ajith", getDate("2003-06-05"));
		User user3 = new User(23, "krishna", getDate("1997-06-05"));
		userName.add(user1);
		userName.add(user2);
		userName.add(user3);
		return userName;
	}

	public static void main(String args[]) {
		CollectionStream obj = new CollectionStream();
		List<User> userDetails = null;
		userDetails = obj.getUser();
		System.out.println("=======USER DETAILS========");
		userDetails.forEach(
				(user) -> System.out.println("User=>"+user)
				);
		System.out.println("=======STREAM=>Filter by age > 20========");
		userDetails.stream()
			.filter(user -> user.age > 20)//Filter user based on age is grater than 20
			.forEach(user -> System.out.println(user.userName));//Here iterate only username
		System.out.println("=======STREAM WITH LIST========");
		Set<String> userData = userDetails.stream()
		.filter(user -> user.age > 15)//Filter user based on age is grater than 20
		.map(user -> user.userName)//Here map username
		.collect(Collectors.toSet());//Here collect username and put that into list
		userData.forEach(
				(user) -> System.out.println("UserName=>"+user)
				);
		System.out.println("=======USER DETAILS========");
		userDetails.forEach(
				(user) -> {
					System.out.println("User=>"+user);
					}
				//Or 
//				(user) -> System.out.println("User=>"+user)
		);
		System.out.println("=======USER DETAILS WITH STREAM MAP========");
		List<Object> userList = userDetails.stream()
		.flatMap(user -> Stream.of(user.userName,user.age))
		.collect(Collectors.toList());
		userList.forEach((user) -> System.out.println("User=>"+user));
	}
}
