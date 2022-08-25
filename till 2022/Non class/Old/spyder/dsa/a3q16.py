def rev(wrd):
    if len(wrd)==1:
        return wrd
    else:
        return rev(wrd[1:len(wrd)])+wrd[0]



word1='bali'
word2=rev(word1)
print(word2)