package com.bicjo.spark;

import static spark.Spark.get;

public class UserHello {

	public UserHello() {
		initialize();
	}

	private void initialize() {
		get("/users/hello", (req, res) -> "users - Halo Mundo");
	}
}
