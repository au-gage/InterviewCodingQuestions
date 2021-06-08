# A program that determines if a given string is a valid credit card or not
# Follows a specific set of guidelines listed below
# The string must start with a 4, 5, or 6
# The string must either be 16 digits long, or be divided into four groups of four,
# separated by a hyphen('-')
# The string also must not have a digit consecutively repeated four times("4444")
# The string must only contain digits and potentially hyphens in the correct indexes
# If any of these conditions fail, Invalid is printed, otherwise Valid is printed
# Problem taken from hackerrank.com, coded by Austin Gage on 6/7/21

def creditCardValidator(creditCard):
    repeatingNumber = 1
    if(creditCard[0] != '4' and creditCard[0] != '5' and creditCard[0] != '6'):
        print("Invalid")
        return
    if(len(creditCard) == 19):
        for i in range(1,len(creditCard)):
            if(i == 4 or i == 9 or i == 14):
                if(creditCard[i] != '-'):
                    print("Invalid")
                    return
                else:
                    continue
            if(creditCard[i] == creditCard[i-1]):
                repeatingNumber += 1
                if(repeatingNumber == 4):
                    print("Invalid")
                    return
            elif(creditCard[i-1] == '-'):
                if(creditCard[i] == creditCard[i-2]):
                    repeatingNumber += 1
                if(repeatingNumber == 4):
                    print("Invalid")
                    return
            else:
                repeatingNumber = 1
            if(creditCard[i].isdigit() == False):
                print("Invalid")
                return
    elif(len(creditCard) == 16):
        for i in range(1,len(creditCard)):
            if(creditCard[i] == creditCard[i-1]):
                repeatingNumber += 1
                if(repeatingNumber == 4):
                    print("Invalid")
                    return
            else:
                repeatingNumber = 1
            if(creditCard[i].isdigit() == False):
                print("Invalid")
                return
    else:
        print("Invalid")
        return
    print("Valid")
    return

       

            

