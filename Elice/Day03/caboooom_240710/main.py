import sys

input = input()

builder = []
inputArr = list(input)

for i in range(len(inputArr)):
    if i < len(inputArr) - 1:
        if inputArr[i].isdigit() and inputArr[i + 1].isdigit():
            builder.append("1+")
        elif inputArr[i].isdigit() and inputArr[i + 1] == '(':
            builder.append(inputArr[i] + "*")
        elif inputArr[i].isdigit() and inputArr[i + 1] == ')':
            builder.append("1")
        else:
            builder.append(inputArr[i])
    else:
            builder.append(inputArr[i])


for i in range(len(builder) - 1):
    if builder[i].isdigit() and builder[i + 1] == '(':
        builder[i] += '*'

print(eval("".join(builder)))