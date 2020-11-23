package FriendlyA.Customer_Service.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserResponse {
	public final String uid;
	public final String firstName;
	public final String lastName;
	public final String address;
	public final String phoneNumber;
	public final String gender;
	public final DateOfBirth dateOfBirth;

	public UserResponse(@JsonProperty("uid") String uid, @JsonProperty("firstName") String firstName,
			@JsonProperty("lastName") String lastName, @JsonProperty("address") String address,
			@JsonProperty("phoneNumber") String phoneNumber, @JsonProperty("gender") String gender, @JsonProperty("dateOfBirth") DateOfBirth dateOfBirth) {
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.dateOfBirth = new DateOfBirth();


	}
}
