function start(){
	var numCredits = readBoolean("Do you have enough credits? ");
	var requirements = readBoolean("Have you met the requirements? ");
	var canGraduate = numCredits && requirements;
	println("Can graduate: " + canGraduate);
}