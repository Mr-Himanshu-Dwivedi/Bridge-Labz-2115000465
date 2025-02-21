# Create a 500MB file with repeated content
text = "This is a test line that will repeat. \n"  # Customize the text as you wish
file_size = 500 * 1024 * 1024  # 500MB in bytes

# Open a new file in write mode
with open("largefile.txt", "w") as f:
    # Keep writing the line until the file reaches approximately 500MB
    line_number = 1
    while f.tell() < file_size:
        # Write the line with the line number
        f.write(f"Line {line_number}: {text}")
        print(f"Writing line {line_number}")  # Print the current line number to the console
        line_number += 1