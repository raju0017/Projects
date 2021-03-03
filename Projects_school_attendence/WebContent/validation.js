function adminvalidateform(event) {

	var name = document.getElementById("u").value;
	var password = document.getElementById("ps").value;
	
	if (name==null || name==""){  
		  document.getElementById("user").innerHTML = "User name should not empty";
		  return false;  
		}else if(password.length<3){  
			document.getElementById("pass").innerHTML = "password should not less than 3 chars"; 
		  return false;  
		  }  

}
function staffvalidateform(event) {

	var name = document.getElementById("u1").value;
	var password = document.getElementById("ps1").value;
	
	if (name == null || name == ""){
		document.getElementById("user1").innerHTML = "User name should not empty";
		return false;
	}else if(password.length<3){  
		document.getElementById("pass1").innerHTML = "password should not less than 3 chars"; 
		  return false;  
		  } 

}

function studentvalidateform(event) {

	var name = document.getElementById("u2").value;
	
	var password = document.getElementById("ps2").value;
	
	if (name == null || name == "") {

		document.getElementById("user1").innerHTML = "User name should not empty";

		return false;
	}else if(password.length<3){  
		document.getElementById("pass2").innerHTML = "password should not less than 3 chars"; 
		  return false;  
		  } 

}
