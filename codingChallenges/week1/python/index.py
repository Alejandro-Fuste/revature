def atbash(string):
    letters = 'abcdefghijklmnopqrstuvwxyz'
    letters_dict = {}
    new_string = ''

    for l in letters:
        letters_dict[l] = letters.index(l)

    for s in string:
        if s.islower():
            new_string += chr(122 - letters_dict[s])
        elif s.isupper():
            new_string += chr(90 - letters_dict[s.lower()])
        else:
            new_string += s

    print(new_string)
    print('----------')


atbash('apple')  # "zkkov"

atbash('Hello World!')  # "Svool dlliow!"

atbash("Christmas is the 25th of December")  # "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"