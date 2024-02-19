# Define program details
MAIN_CLASS = main
ALL_CLASS_PATH=.
# Run the program
run: compile
	java $(MAIN_CLASS)

# Compile source code
compile: main.class calculator.class MyButton.class TextBox.class

main.class : main.java
	javac main.java
calculator.class : calculator.java
	javac calculator.java
MyButton.class : MyButton.java
	javac MyButton.java
TextBox.class : TextBox.java
	javac TextBox.java

# Clean up build files
clean:
	rm -rf $(ALL_CLASS_PATH)/*.class

.PHONY: clean compile run
