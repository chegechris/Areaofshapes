import math

def calculate_area():
    print("Choose a shape:")
    print("1. Circle")
    print("2. Rectangle")
    print("3. Triangle")
    choice = int(input("Enter your choice: "))

    if choice == 1:
        radius = float(input("Enter the radius: "))
        area = math.pi * (radius ** 2)
        print("The area of the circle is: ", area)
    elif choice == 2:
        length = float(input("Enter the length: "))
        width = float(input("Enter the width: "))
        area = length * width
        print("The area of the rectangle is: ", area)
    elif choice == 3:
        base = float(input("Enter the base: "))
        height = float(input("Enter the height: "))
        area = 0.5 * base * height
        print("The area of the triangle is: ", area)
    else:
        print("Invalid choice")

calculate_area()


