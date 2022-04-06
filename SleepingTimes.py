
month_range = [("14-17", 0, 3), ("12-15", 4, 11)]
year_range = [("11-14", 1, 2), ("10-13", 3, 5), ("9-11", 6, 13), ("8-10", 14, 17), ("7-9", 18, 64), ("7-8", 65, 150)]

go = True

def get_age():
    while True:
        try:
            age = int(input("Enter your age (0 if less than 12 months old): "))
            if age > 150:
                print("Please enter an age people live to.")
            elif age < 0:
                print("Please enter a valid age using numbers.")
            else:
                return age
        except ValueError:
            print("Please enter a valid age using numbers.")

def find_sleep_range(age, group):
    if group == "months":
        for i in range(len(month_range)):
            if age >= month_range[i][1] and age <= month_range[i][2]:
                return month_range[i][0]
    if group == "years":
        for i in range(len(year_range)):
            if age >= year_range[i][1] and age <= year_range[i][2]:
                return year_range[i][0]
        

def get_month():
    while True:
        try:
            age = int(input("Enter how many months old (0-11): "))
            if age > 111:
                print("Please enter a valid month using numbers.")
            elif age < 0:
                print("Please enter a valid month using numbers.")
            else:
                return age
        except ValueError:
            print("Please enter a valid month using numbers.")

print("This program helps you determine how much sleep you should be getting each night based on your age.")
    
while go:
    age = get_age()
    if age == 0:
        month = get_month()
        print("A person " + str(month) + " month(s) old should get " + find_sleep_range(month, "months") + " hours of sleep a day.")
    else:
        print("A person " + str(age) + " year(s) old should get " + find_sleep_range(age, "years") + " hours of sleep a day.")
    a = input("Do you want to continue (answer YES or NO): ")
    if a == "NO":
        go = False

print("Thank you for using the program.")
