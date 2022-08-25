n=int(input('enter your lucky number'))
try:
    if n<0:
        raise Exception('error: negative number')
except Exception as e:
    print(e)
else:
    print('nice choice')