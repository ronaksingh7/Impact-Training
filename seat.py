row = int(input("Enter number of rows: "))
col = int(input("Enter number of columns: "))
seat = int(input("Enter the seat number: "))

if seat % col == 0 or seat <= col or seat%col == 1:
    print("CSE")
else:
    print("ECE")