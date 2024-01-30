# Define program details
MAIN_CLASS = main
MAIN_CLASS_PATH=*.class
# Run the program
run: compile
	java $(MAIN_CLASS)

# Compile source code
compile:
	javac *.java

# Clean up build files
clean:
	rm -rf $(MAIN_CLASS_PATH)

.PHONY: clean compile run
