make:
	javac src/*.java
	mv src/*.class bin/
	cd bin && java RentalShop
