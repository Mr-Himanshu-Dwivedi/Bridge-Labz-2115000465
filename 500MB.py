# Create a 500MB file with repeated content
text = "This is a test line that will repeat. \n"  # Customize the text as you wish
file_size = 500 * 1024 * 1024  # 500MB in bytes

# Open a new file in write mode
with open("500MB.txt", "w") as f:
    # Keep writing the line until the file reaches approximately 500MB
    while f.tell() < file_size:
        f.write(text)