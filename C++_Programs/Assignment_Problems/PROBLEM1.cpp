//Problem1
//Assignment1
//Author: Daniel Espin
//Date: 3/13/2023
//File's purpose: The program calculates the number of days between two dates.
#include <iostream>

using namespace std;

// Check if a given year is a leap year.
// Returns true if it is, false otherwise.
bool is_leap_year(int year) {
    if (year % 4 != 0) {
        return false;
    } else if (year % 400 == 0) {
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else {
        return true;
    }
}

// Get the number of days in a given month for a given year.
// Returns the number of days.
int get_days_in_month(int month, int year) {
    switch (month) {
        case 2:
            return is_leap_year(year) ? 29 : 28;
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        default:
            return 31;
    }
}

// Check if a given date is valid.
// Returns true if it is, false otherwise.
bool date_validator(int day, int month, int year) {
    if (year < 1 || year > 9999) {
        return false;
    }
    if (month < 1 || month > 12) {
        return false;
    }
    int daysInMonth = get_days_in_month(month, year);
    if (day < 1 || day > daysInMonth) {
        return false;
    }
    return true;
}

// Get the number of days between two dates.
// Returns the number of days.
int days_between_dates(int day1, int month1, int year1, int day2, int month2, int year2) {
    int days = 0;
    if (year1 == year2) {
        if (month1 == month2) {
            days = day2 - day1;
        } else {
            days = get_days_in_month(month1, year1) - day1;
            for (int month = month1 + 1; month < month2; month++) {
                days += get_days_in_month(month, year1);
            }
            days += day2;
        }
    } else {
        days = get_days_in_month(month1, year1) - day1;
        for (int month = month1 + 1; month <= 12; month++) {
            days += get_days_in_month(month, year1);
        }
        for (int year = year1 + 1; year < year2; year++) {
            days += is_leap_year(year) ? 366 : 365;
        }
        for (int month = 1; month < month2; month++) {
            days += get_days_in_month(month, year2);
        }
        days += day2;
    }
    return days;
}

//Prompts the user to input two dates.
int main() {
    int day1, month1, year1, day2, month2, year2;
    int tries = 0;
    do {
        if (tries > 0) {
            cout << "Invalid input. Please try again." << endl;
        }
        cout << "Enter the first date separated by spaces(dd mm yyyy): ";
        cin >> day1 >> month1 >> year1;
        cout << "Enter the second date separated by spaces(dd mm yyyy): ";
        cin >> day2 >> month2 >> year2;
        tries++;
        if (tries > 3) {
            cout << "Too many invalid inputs. Exiting." << endl;
            return 1;
        }
    } 
    while (!date_validator(day1, month1, year1) || !date_validator(day2, month2, year2));

    int daysBetweenDates = days_between_dates(day1, month1, year1, day2, month2, year2);
    cout << "There are " << daysBetweenDates << " days between the two dates." << endl;
    return 0;
}
