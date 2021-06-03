# This method will sort a string in a specific way
# All lowercase letters will be sorted first
# All uppercase letters will be sorted next
# All odd numbers will be sorted next
# Finally all even numbers will be sorted last
# Example Sorting1234 -> ginortS1324
#  
# This method has a run time of O(N) as it only has to loop through the full length
# of the string twice. This does not assume that you add special characters like "?"
def ginortS(input):
    sortedString = ""
    lowercase = []
    uppercase = []
    even = []
    odd = []
    for i in range(0,len(input)):
        currentChar = input[i]
        if(currentChar.islower()):
            lowercase.append(currentChar)
        elif(input[i].isupper()):
            uppercase.append(input[i])
        else:
            num = int(input[i])
            if num % 2 == 0:
                even.append(input[i])
            else:
                odd.append(input[i])
    lowercase.sort()
    uppercase.sort()
    odd.sort()
    even.sort()
    for i in range(len(lowercase)):
        sortedString+=lowercase[i]
    for i in range(len(uppercase)):
        sortedString+=uppercase[i]
    for i in range(len(odd)):
        sortedString+=odd[i]
    for i in range(len(even)):
        sortedString+=even[i]
    print(sortedString)


