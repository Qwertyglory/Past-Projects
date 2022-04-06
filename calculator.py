def calculator():
    number_1 = int(input('Enter your first number: '))
    number_2 = int(input('Enter you second number: '))
    operation = input('Enter your operator: ')

    if operation == '+':
        print('{} + {} = '.format(number_1, number_2))
        print(number_1 + number_2)
    if operation == '-':
        print('{} - {} = '.format(number_1, number_2))
        print(number_1 - number_2)
    if operation == '*':
        print('{} x {} = '.format(number_1, number_2))
        print(number_1 * number_2)
    if operation == '/':
        print('{} / {} = '.format(number_1, number_2))
        print(number_1 / number_2)
    playAgain = input('Do you want to calculate more? Yes or No: ')
    if playAgain == 'Yes':
        calculator()
    else:
        print('goodbye')

print('''This is a calculator.
    Enter the two numbers you want calculated when prompted.
    Then, enter the operation you want to perform on the two numbers.''')
print('''For addition enter: +
    For subtraction enter: -
    For multiplacation enter: *
    For division enter: /''')

calculator()


