class Decoder:
    def decompresser(string):
        cols=string.split(',')
        newStr=''
        for i in cols:
            newStr+=i[0]*int(i[1:])
        return newStr

    def decode(encoded):
        matrix=[]
        rows=encoded.split(' ')
        for i in range(len(rows)):
            decom=Decoder.decompresser(rows[i])
            matrix.append([int(j) for j in decom])
        return matrix
