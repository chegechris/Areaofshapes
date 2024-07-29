#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int choice;
    cout << "Choose a shape:" << endl;
    cout << "1. Circle" << endl;
    cout << "2. Rectangle" << endl;
    cout << "3. Triangle" << endl;
    cin >> choice;

    if (choice == 1) {
        double radius;
        cout << "Enter the radius: ";
        cin >> radius;
        double area = M_PI * (radius * radius);
        cout << "The area of the circle is: " << area << endl;
    } else if (choice == 2) {
        double length, width;
        cout << "Enter the length: ";
        cin >> length;
        cout << "Enter the width: ";
        cin >> width;
        double area = length * width;
        cout << "The area of the rectangle is: " << area << endl;
    } else if (choice == 3) {
        double base, height;
        cout << "Enter the base: ";
        cin >> base;
        cout << "Enter the height: ";
        cin >> height;
        double area = 0.5 * base * height;
        cout << "The area of the triangle is: " << area << endl;
    } else {
        cout << "Invalid choice" << endl;
    }

    return 0;
}
